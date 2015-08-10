package co.juliansuarez.rxtalk.data.observables;

import android.content.Context;
import android.util.Log;

import co.juliansuarez.rxtalk.data.RepoData;
import co.juliansuarez.rxtalk.data.cache.DiskCache;
import co.juliansuarez.rxtalk.data.cache.MemoryCache;
import co.juliansuarez.rxtalk.network.GithubApi;
import rx.Observable;

/**
 * Created by j.suarez on 8/6/2015.
 */
public class Sources {

    final private Observable<RepoData> networkObservable;
    final private Observable<RepoData> diskObservable;
    final private Observable<RepoData> memoryObservable;

    private DiskCache diskCache;
    private MemoryCache memoryCache;

    public Sources(Context context, final GithubApi githubApi) {
        this.networkObservable = createNetworkObservable(context, githubApi);
        this.diskObservable = createDiskObservable(context);
        this.memoryObservable = createMemoryObservable(context);
    }

    private Observable<RepoData> createMemoryObservable(Context context) {
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
                    subscriber.onNext(new RepoData(repos));
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
        return Observable.create(subscriber -> {
            Log.i(Sources.class.getSimpleName(), "Creating diskObservable");
            DiskCache diskCache = getDiskCache(context);
            final RepoData data = diskCache.getData();
            if (data != null) {
                subscriber.onNext(data);
            }
            subscriber.onCompleted();
        });
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
        return networkObservable;
    }

    public Observable<RepoData> getDiskObservable() {
        return diskObservable;
    }

    public Observable<RepoData> getMemoryObservable() {
        return memoryObservable;
    }
}
