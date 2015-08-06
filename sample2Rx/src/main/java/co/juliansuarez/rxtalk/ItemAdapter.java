package co.juliansuarez.rxtalk;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import co.juliansuarez.rxtalk.models.Item;

/**
 * Created by julian on 8/3/15.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.RepoViewHolder> {

    private final LayoutInflater inflater;
    private List<Item> itemList;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.inflater = LayoutInflater.from(context);
        this.itemList = itemList;
    }

    @Override
    public RepoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RepoViewHolder(inflater.inflate(R.layout.repo_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RepoViewHolder holder, int position) {
        holder.textViewName.setText(itemList.get(position).getName());
        holder.textViewOwner.setText(itemList.get(position).getOwner().getLogin());
        holder.textViewIssues.setText(holder.textViewIssues.getContext().getString(R.string.issues_number_label, itemList.get(position).getOpenIssuesCount()));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void updateData(List<Item> items) {
        itemList = items;
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
