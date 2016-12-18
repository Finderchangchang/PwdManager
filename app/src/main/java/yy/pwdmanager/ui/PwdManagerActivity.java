package yy.pwdmanager.ui;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.widget.Button;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.SynthesizerListener;

import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;

/**
 * Created by Finder丶畅畅 on 2016/12/14 00:06
 * QQ群481606175
 */

public class PwdManagerActivity extends BaseActivity {
    Button btn;
    BottomSheetBehavior bottomSheetBehavior;
    BottomSheetDialog mBottomSheetDialog;

    @Override
    public void initViews() {
        setContentView(R.layout.ac_pwd_manage);
        btn = (Button) findViewById(R.id.btn);
        load();
    }

    private void load() {
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottom_sheet));
        mBottomSheetDialog = new BottomSheetDialog(this);
        mBottomSheetDialog.setCancelable(false);
        mBottomSheetDialog.setContentView(R.layout.dialog_bottom);
        Button btn = (Button) mBottomSheetDialog.findViewById(R.id.dia_btn);
        btn.setOnClickListener(v -> mBottomSheetDialog.dismiss());

        mBottomSheetDialog.setOnCancelListener(dialog -> ToastShort("Cancel"));
        mBottomSheetDialog.setOnDismissListener(dialog -> load());
    }

    private void spike() {
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
        mTts.startSpeaking("大家好，我就柳睿垚。柳睿垚~~", new SynthesizerListener() {
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
                String s="";
            }

            @Override
            public void onEvent(int i, int i1, int i2, Bundle bundle) {

            }
        });
    }

    @Override
    public void initEvents() {
//        btn.setOnClickListener(v -> mBottomSheetDialog.show());
        btn.setOnClickListener(v -> spike());

    }
}