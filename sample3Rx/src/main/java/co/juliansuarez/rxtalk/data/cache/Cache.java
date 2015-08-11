package co.juliansuarez.rxtalk.data.cache;

/**
 * Created by j.suarez on 8/6/2015.
 */
public interface Cache<T> {
    T getData();

    void saveData(T data);

}
