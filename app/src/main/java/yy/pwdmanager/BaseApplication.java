package yy.pwdmanager;

import android.app.Application;
import android.content.Context;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

public class BaseApplication extends Application {
    private static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=55779d16");
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        BaseApplication.context = context;
    }
}