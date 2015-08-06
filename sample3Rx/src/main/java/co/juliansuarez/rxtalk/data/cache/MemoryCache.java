package co.juliansuarez.rxtalk.data.cache;

import co.juliansuarez.rxtalk.data.RepoData;

/**
 * Created by j.suarez on 8/6/2015.
 */
public class MemoryCache implements Cache<RepoData> {

    private RepoData data;

    @Override
    public RepoData getData() {
        return data;
    }

    @Override
    public void saveData(RepoData data) {
        this.data = data;
    }

    @Override
    public boolean isUptoDate() {
        return getData() != null && getData().isUpToDate();
    }
}
