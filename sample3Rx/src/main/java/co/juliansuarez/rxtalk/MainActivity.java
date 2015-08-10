package co.juliansuarez.rxtalk;

import java.util.ArrayList;
import java.util.List;

import retrofit.RestAdapter;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.app.AppObservable;
import rx.subscriptions.CompositeSubscription;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import co.juliansuarez.rxtalk.data.RepoData;
import co.juliansuarez.rxtalk.data.observables.Sources;
import co.juliansuarez.rxtalk.models.Repo;
import co.juliansuarez.rxtalk.network.GithubApi;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    CompositeSubscription compositeSubscription = new CompositeSubscription();;
    private RepoAdapter repoAdapter;
    private Sources sources;
    private Subscription dataSubscription;
    private Observable<RepoData> repoDataObservable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        initData();
    }

    private void init() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        repoAdapter = new RepoAdapter(this, new ArrayList<>());
        recyclerView.setAdapter(repoAdapter);

        GithubApi githubApi = new RestAdapter.Builder().setEndpoint("https://api.github.com").build()
                .create(GithubApi.class);
        sources = new Sources(this, githubApi);
    }

    private void showProgressBar() {
        recyclerView.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
    }

    private void showData(List<Repo> repos) {
        repoAdapter.updateData(repos);
        progressBar.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {
            initData();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initData() {
        showProgressBar();
        if (dataSubscription != null) {
            compositeSubscription.remove(dataSubscription);
        }

        final Observable<RepoData> memoryObservable = sources.getMemoryObservable();
        final Observable<RepoData> diskObservable = sources.getDiskObservable();
        final Observable<RepoData> networkObservable = sources.getNetworkObservable();

        Observable<RepoData> source = Observable.concat(memoryObservable, diskObservable, networkObservable)
                .first(repoData -> repoData.isUpToDate());

        repoDataObservable = AppObservable.bindActivity(this, source);
        dataSubscription = repoDataObservable.subscribe(new Subscriber<RepoData>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e(MainActivity.class.getSimpleName(), "Error", e);
            }

            @Override
            public void onNext(RepoData repoData) {
                showData(repoData.getRepos());
                Toast.makeText(MainActivity.this, "Data from: " + repoData.getDataSource(), Toast.LENGTH_SHORT)
                        .show();
            }
        });

        compositeSubscription.add(dataSubscription);
    }

    @Override
    protected void onDestroy() {
        compositeSubscription.unsubscribe();
        super.onDestroy();
    }
}
