package co.juliansuarez.rxtalk;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import co.juliansuarez.rxtalk.models.Item;
import co.juliansuarez.rxtalk.models.RepoSearchResults;
import co.juliansuarez.rxtalk.network.GithubApi;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    public static final int MIN_CHARACTERS = 3;
    public static final int MIN_SECONDS = 2;
    RecyclerView recyclerView;
    ProgressBar progressBar;
    EditText editTextSearchTerm;
    private ItemAdapter itemAdapter;
    private GithubApi githubApi;

    private DelayedCountDown delayedCountDown;
    private TextWatcher searchTermWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s != null && s.length() > MIN_CHARACTERS) {
                if (delayedCountDown == null) {
                    delayedCountDown = new DelayedCountDown(s.toString());
                } else {
                    delayedCountDown.cancel();
                    delayedCountDown.setSearchTerm(s.toString());
                }

                delayedCountDown.start();
            } else if (delayedCountDown != null) {
                delayedCountDown.cancel();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        editTextSearchTerm.addTextChangedListener(searchTermWatcher);
    }

    private void init() {
        editTextSearchTerm = (EditText) findViewById(R.id.editTextSearchTerm);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new ItemAdapter(this, new ArrayList<>());
        recyclerView.setAdapter(itemAdapter);

        githubApi = new RestAdapter.Builder().setEndpoint("https://api.github.com").build().create(GithubApi.class);
    }

    private void showProgressBar() {
        recyclerView.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
    }

    private void showData(List<Item> repos) {
        itemAdapter.updateData(repos);
        progressBar.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    private class DelayedCountDown extends CountDownTimer {

        private String searchTerm;

        public DelayedCountDown(String searchTerm) {
            super(MIN_SECONDS * 1000, MIN_SECONDS * 1000);
            this.searchTerm = searchTerm;
        }

        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {
            showProgressBar();
            githubApi.searchRepos(getSearchTerm(), new Callback<RepoSearchResults>() {
                @Override
                public void success(RepoSearchResults repoSearchResults, Response response) {
                    showData(repoSearchResults.getItems());
                }

                @Override
                public void failure(RetrofitError e) {
                    Log.e(MainActivity.class.getSimpleName(), "Error", e);
                }
            });
        }

        public String getSearchTerm() {
            return searchTerm;
        }

        public void setSearchTerm(String searchTerm) {
            this.searchTerm = searchTerm;
        }
    }
}
