package yy.pwdmanager.util;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/9/20.
 */

public class HttpUtil {
    public static final String BASE_URL = "http://apis.baidu.com/";

    private static final int DEFAULT_TIMEOUT = 5;

    private static Retrofit retrofit;


    public static BaiDuAPI load() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient httpClientBuilder = new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .addHeader("apikey", "706da19045e60c089cd457bd10e5e733").build();
                    return chain.proceed(request);
                }).connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).build();

        retrofit = new Retrofit.Builder()
                .client(httpClientBuilder)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        return retrofit.create(BaiDuAPI.class);
    }

    public static BaiDuAPI loadTL() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient httpClientBuilder = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).build();

        retrofit = new Retrofit.Builder()
                .client(httpClientBuilder)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl("http://www.tuling123.com")
                .build();

        return retrofit.create(BaiDuAPI.class);
    }
}
