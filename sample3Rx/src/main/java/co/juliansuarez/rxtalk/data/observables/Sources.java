package co.juliansuarez.rxtalk.data.observables;

import rx.Observable;

import android.content.Context;
import android.util.Log;

import co.juliansuarez.rxtalk.data.RepoData;
import co.juliansuarez.rxtalk.data.cache.DiskCache;
import co.juliansuarez.rxtalk.data.cache.MemoryCache;
import co.juliansuarez.rxtalk.network.GithubApi;

/**
 * Created by j.suarez on 8/6/2015.
 */
public class Sources {

    private final Context context;
    private final GithubApi githubApi;
    private DiskCache diskCache;
    private MemoryCache memoryCache;

    public Sources(Context context, final GithubApi githubApi) {
        this.context = context;
        this.githubApi = githubApi;
    }

    private Observable<RepoData> createMemoryObservable() {
        return Observable.create(subscriber -> {
            Log.i(Sources.class.getSimpleName(), "Creating memoryObservable");
            MemoryCache memoryCache = getMemoryCache();
            final RepoData data = memoryCache.getData();
            if (data != null) {
                subscriber.onNext(data);
            }
            subscriber.onCompleted();
        });
    }

    private Observable<RepoData> createNetworkObservable(Context context, GithubApi githubApi) {
        Observable<RepoData> networkObservable = githubApi.getGoogleRepos()
                .flatMap(repos -> Observable.create(subscriber -> {
                    Log.i(Sources.class.getSimpleName(), "Creating networkObservable");
                    final RepoData data = new RepoData(repos);
                    data.setDataSource("Network");
                    subscriber.onNext(data);
                    subscriber.onCompleted();
                }));
        // Save network responses to disk
        networkObservable = networkObservable.doOnNext(repoData -> {
            DiskCache diskCache = getDiskCache(context);
            diskCache.saveData(repoData);
        });

        return networkObservable;
    }

    private Observable<RepoData> createDiskObservable(Context context) {
        Observable<RepoData> diskObservable = Observable.create(subscriber -> {
            Log.i(Sources.class.getSimpleName(), "Creating diskObservable");
            DiskCache diskCache = getDiskCache(context);
            final RepoData data = diskCache.getData();
            if (data != null) {
                subscriber.onNext(data);
            }
            subscriber.onCompleted();
        });
        // Save disk responses to memory
        diskObservable = diskObservable.doOnNext(repoData -> {
            MemoryCache memoryCache = getMemoryCache();
            memoryCache.saveData(repoData);
        });
        return diskObservable;
    }

    public DiskCache getDiskCache(final Context context) {
        if (diskCache == null) {
            diskCache = new DiskCache(context);
        }

        return diskCache;
    }

    public MemoryCache getMemoryCache() {
        if (memoryCache == null) {
            memoryCache = new MemoryCache();
        }
        return memoryCache;
    }

    public Observable<RepoData> getNetworkObservable() {
        return createNetworkObservable(context, githubApi);
    }

    public Observable<RepoData> getDiskObservable() {
        return createDiskObservable(context);
    }

    public Observable<RepoData> getMemoryObservable() {
        return createMemoryObservable();
    }
}
