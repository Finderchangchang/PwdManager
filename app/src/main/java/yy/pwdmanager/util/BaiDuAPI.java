package yy.pwdmanager.util;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
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
}
