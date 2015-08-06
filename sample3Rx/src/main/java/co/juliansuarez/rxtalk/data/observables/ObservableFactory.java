package co.juliansuarez.rxtalk.data.observables;

import retrofit.RestAdapter;
import rx.Observable;

import android.content.Context;

import co.juliansuarez.rxtalk.data.DataSourceType;
import co.juliansuarez.rxtalk.data.RepoData;
import co.juliansuarez.rxtalk.data.cache.DiskCache;
import co.juliansuarez.rxtalk.data.cache.MemoryCache;
import co.juliansuarez.rxtalk.network.GithubApi;

/**
 * Created by j.suarez on 8/6/2015.
 */
public class ObservableFactory {

    public static Observable<RepoData> getRepoDataObservable(Context context, DataSourceType dataSourceType) {
        switch (dataSourceType) {
        case NETWORK:
            final GithubApi githubApi = new RestAdapter.Builder().setEndpoint("https://api.github.com").build()
                    .create(GithubApi.class);
            final Observable<RepoData> networkObservable = githubApi.getGoogleRepos()
                    .flatMap(repos -> Observable.create(subscriber -> {
                        subscriber.onNext(new RepoData(repos));
                        subscriber.onCompleted();
                    }));

            // Save network responses to disk
            networkObservable.doOnNext(repoData -> {
                DiskCache diskCache = new DiskCache(context);
                diskCache.saveData(repoData);
            });
            return networkObservable;
        case MEMORY:
            return Observable.create(subscriber -> {
                MemoryCache memoryCache = new MemoryCache();
                subscriber.onNext(memoryCache.getData());
                subscriber.onCompleted();
            });
        case DISK:
            return Observable.create(subscriber -> {
                DiskCache diskCache = new DiskCache(context);
                subscriber.onNext(diskCache.getData());
                subscriber.onCompleted();
            });
        }

        return null;
    }

}
