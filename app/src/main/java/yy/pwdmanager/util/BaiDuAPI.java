package yy.pwdmanager.util;

import java.util.Map;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;
import yy.pwdmanager.model.MessageModel;

/**
 * Created by Administrator on 2016/11/21.
 */

public interface BaiDuAPI {


    @FormUrlEncoded
    @POST("/openapi/api")
    Observable<MessageModel> getDaJia(@Field("key") String page,
                                      @Field("info") String size,
                                      @Field("userid") String token);

    /**
     * maxResult--每页数量
     * page--页数
     * time--笑话起始时间
     * showapi_appid=15723
     * showapi_timestamp=20161226002807
     * showapi_sign=9ef402f1bfe34a3f9eb8668bb3d4240c
     *
     * @param map
     * @return
     */
    @GET("/341-2")
    Observable<MessageModel> getXh(@QueryMap Map map);
}
