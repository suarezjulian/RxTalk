package co.juliansuarez.rxtalk.network;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;
import co.juliansuarez.rxtalk.models.Repo;

/**
 * Created by julian on 7/30/15.
 */
public interface GithubApi {
    @GET("/orgs/google/repos")
    Observable<List<Repo>> getGoogleRepos();
}
