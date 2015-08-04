package co.juliansuarez.rxtalk.network;

import java.util.List;

import co.juliansuarez.rxtalk.models.Repo;
import retrofit.http.GET;
import rx.Observable;

/**
 * Created by julian on 7/30/15.
 */
public interface GithubApi {
    @GET("/orgs/google/repos")
    Observable<List<Repo>> getGoogleRepos();
}
