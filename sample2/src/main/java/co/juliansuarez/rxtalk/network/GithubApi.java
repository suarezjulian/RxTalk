package co.juliansuarez.rxtalk.network;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import co.juliansuarez.rxtalk.models.RepoSearchResults;

/**
 * Created by julian on 7/30/15.
 */
public interface GithubApi {
    @GET("/search/repositories")
    void searchRepos(@Query("q") String queryTerm, Callback<RepoSearchResults> repoSearchResultsCallback);
}
