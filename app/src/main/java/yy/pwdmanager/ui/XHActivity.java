package yy.pwdmanager.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SynthesizerListener;

import net.tsz.afinal.view.TitleBar;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;
import yy.pwdmanager.util.HttpUtil;

/**
 * Created by Finder丶畅畅 on 2016/12/18 10:24
 * QQ群481606175
 */

public class XHActivity extends BaseActivity {
    @Bind(R.id.title_bar)
    TitleBar titleBar;
    @Bind(R.id.main_tv)
    TextView centerTv;

    @Override
    public void initViews() {
        setContentView(R.layout.ac_xh);
        ButterKnife.bind(this);
        titleBar.setLeftClick(() -> finish());
    }

    @Override
    public void initEvents() {
        HttpUtil.loadTL()
                .getDaJia("3dcacc2cd453e6f95f7b17f5cc783487", "讲个笑话", "adc123")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(map -> {
                    centerTv.setText(map.getText());
                    spike(map.getText());
                });
    }

    private void spike(String val) {
        //1.创建SpeechSynthesizer对象, 第二个参数：本地合成时传InitListener
        SpeechSynthesizer mTts = SpeechSynthesizer.createSynthesizer(this, null);
        //2.合成参数设置，详见《科大讯飞MSC API手册(Android)》SpeechSynthesizer 类
        mTts.setParameter(SpeechConstant.VOICE_NAME, "xiaoyan");//设置发音人
        mTts.setParameter(SpeechConstant.SPEED, "50");//设置语速
        mTts.setParameter(SpeechConstant.VOLUME, "80");//设置音量，范围0~100
        mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD); //设置云端
        //设置合成音频保存位置（可自定义保存位置），保存在“./sdcard/iflytek.pcm”
        //保存在SD卡需要在AndroidManifest.xml添加写SD卡权限
        //如果不需要保存合成音频，注释该行代码
//        mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, "./sdcard/iflytek.pcm");
        //3.开始合成
        mTts.startSpeaking(val, new SynthesizerListener() {
            @Override
            public void onSpeakBegin() {

            }

            @Override
            public void onBufferProgress(int i, int i1, int i2, String s) {

            }

            @Override
            public void onSpeakPaused() {

            }

            @Override
            public void onSpeakResumed() {

            }

            @Override
            public void onSpeakProgress(int i, int i1, int i2) {

            }

            @Override
            public void onCompleted(SpeechError speechError) {
                String s = "";
            }

            @Override
            public void onEvent(int i, int i1, int i2, Bundle bundle) {

            }
        });
    }
}
