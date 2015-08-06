package co.juliansuarez.rxtalk.network;

import co.juliansuarez.rxtalk.models.RepoSearchResults;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by julian on 7/30/15.
 */
public interface GithubApi {
    @GET("/search/repositories")
    Observable<RepoSearchResults> searchRepos(@Query("q") String queryTerm);
}
