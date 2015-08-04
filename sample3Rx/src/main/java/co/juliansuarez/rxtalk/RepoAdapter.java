package co.juliansuarez.rxtalk;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import co.juliansuarez.rxtalk.models.Repo;

/**
 * Created by julian on 8/3/15.
 */
public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.RepoViewHolder> {

    private List<Repo> repoList;
    private final LayoutInflater inflater;

    public RepoAdapter(Context context, List<Repo> repoList) {
        this.inflater = LayoutInflater.from(context);
        this.repoList = repoList;
    }

    @Override
    public RepoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RepoViewHolder(inflater.inflate(R.layout.repo_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RepoViewHolder holder, int position) {
        holder.textViewName.setText(repoList.get(position).getName());
        holder.textViewOwner.setText(repoList.get(position).getOwner().getLogin());
        holder.textViewIssues.setText(holder.textViewIssues.getContext().getString(R.string.issues_number_label, repoList.get(position).getOpenIssuesCount()));
    }

    @Override
    public int getItemCount() {
        return repoList.size();
    }

    public void updateData(List<Repo> repos) {
        repoList = repos;
        notifyDataSetChanged();
    }

    public static class RepoViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewOwner;
        TextView textViewIssues;

        public RepoViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewOwner = (TextView) itemView.findViewById(R.id.textViewOwner);
            textViewIssues = (TextView) itemView.findViewById(R.id.textViewIssues);
        }
    }
}
