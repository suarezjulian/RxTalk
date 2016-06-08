package co.juliansuarez.rxtalk.data;

import java.util.List;

import co.juliansuarez.rxtalk.models.Repo;

/**
 * Created by j.suarez on 8/6/2015.
 */
public class RepoData {
    private static final long STALE_MS = 20 * 1000; // Data is stale after 20 seconds
    private long timestamp;
    private List<Repo> repos;
    private String dataSource;

    public RepoData() {
        // Needed for gson
    }

    public RepoData(List<Repo> repos) {
        this.repos = repos;
        this.timestamp = System.currentTimeMillis();
    }

    public boolean isUpToDate() {
        return System.currentTimeMillis() - timestamp < STALE_MS;
    }

    public List<Repo> getRepos() {
        return repos;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
}
