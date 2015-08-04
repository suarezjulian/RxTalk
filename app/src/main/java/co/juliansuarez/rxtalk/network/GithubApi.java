package co.juliansuarez.rxtalk.network;

import java.util.List;

import co.juliansuarez.rxtalk.models.Repo;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by julian on 7/30/15.
 */
public interface GithubApi {
    @GET("/orgs/google/repos")
    void getGoogleRepos(Callback<List<Repo>> googleRepos);
}
