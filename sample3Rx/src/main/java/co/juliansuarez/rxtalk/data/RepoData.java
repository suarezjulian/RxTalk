package co.juliansuarez.rxtalk.data;

import java.util.List;

import co.juliansuarez.rxtalk.models.Repo;

/**
 * Created by j.suarez on 8/6/2015.
 */
public class RepoData {
    private static final long STALE_MS = 5 * 1000; // Data is stale after 5 seconds
    long timestamp;
    private List<Repo> repos;

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
}
