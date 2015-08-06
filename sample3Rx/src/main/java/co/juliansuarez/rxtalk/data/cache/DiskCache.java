package co.juliansuarez.rxtalk.data.cache;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

import android.content.Context;
import android.util.Log;

import co.juliansuarez.rxtalk.data.RepoData;

import com.google.gson.Gson;

/**
 * Created by j.suarez on 8/6/2015.
 */
public class DiskCache implements Cache<RepoData> {
    private final static String CACHE_FILE_NAME = "cache";

    private final Context context;
    private final Gson gson;

    public DiskCache(final Context context) {
        this.context = context.getApplicationContext();
        this.gson = new Gson();
    }

    @Override
    public RepoData getData() {
        return readFromCacheFile();
    }

    @Override
    public void saveData(RepoData data) {
        writeToCacheFile(data);
    }

    @Override
    public boolean isUptoDate() {
        final RepoData data = getData();
        return data != null && data.isUpToDate();
    }

    private RepoData readFromCacheFile() {
        File cacheFile = new File(context.getCacheDir(), CACHE_FILE_NAME);
        Reader cacheReader = null;
        RepoData repoData = null;
        try {
            cacheReader = new FileReader(cacheFile);
            repoData = gson.fromJson(cacheReader, RepoData.class);
        } catch (FileNotFoundException e) {
            Log.e(DiskCache.class.getSimpleName(), "Data not found ", e);
        }

        return repoData;
    }

    private void writeToCacheFile(RepoData data) {
        String jsonData = gson.toJson(data);
        OutputStream outputStream = null;

        try {
            File cacheFile = new File(context.getCacheDir(), CACHE_FILE_NAME);
            outputStream = new BufferedOutputStream(new FileOutputStream(cacheFile));
            outputStream.write(jsonData.getBytes());
        } catch (Exception e) {
            Log.e(DiskCache.class.getSimpleName(), "Exception writing cache to disk ", e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    Log.e(DiskCache.class.getSimpleName(), "Exception writing cache to disk ", e);
                }
            }
        }
    }
}
