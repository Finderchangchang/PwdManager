package yy.pwdmanager.ui;

import android.widget.TextView;

import net.tsz.afinal.view.MaterialLockView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;
import yy.pwdmanager.util.Utils;

/**
 * 手势登录页面
 * Created by Finder丶畅畅 on 2016/12/11 21:59
 * QQ群481606175
 */

public class SSLoginActivity extends BaseActivity {
    @Bind(R.id.pwd_mv)
    MaterialLockView pwdMv;
    @Bind(R.id.msg_tv)
    TextView msgTv;
    String ss_key;
    String re_key;//确认密码

    @Override
    public void initViews() {
        setContentView(R.layout.ac_ss_login);
        ButterKnife.bind(this);
        ss_key = Utils.getCache("ss_key");
    }

    @Override
    public void initEvents() {
        pwdMv.setOnPatternListener(new MaterialLockView.OnPatternListener() {
            @Override
            public void onPatternDetected(List<MaterialLockView.Cell> pattern, String SimplePattern) {
                if (!("").equals(ss_key)) {//登录
                    if (ss_key.equals(SimplePattern)) {
                        Utils.IntentPost(MainActivity.class);
                        finish();
                    } else {
                        ToastShort("手势错误");
                        pwdMv.clearPattern();
                    }
                } else {//注册
                    if (re_key != null) {
                        if (re_key.equals(SimplePattern)) {
                            Utils.IntentPost(MainActivity.class);
                            Utils.putCache("ss_key", re_key);
                            msgTv.setText("请再次录入手势");
                            finish();
                        } else {
                            ToastShort("手势错误");
                            pwdMv.clearPattern();
                        }
                    } else {
                        re_key = SimplePattern;
                        pwdMv.clearPattern();
                    }
                }
                super.onPatternDetected(pattern, SimplePattern);
            }
        });
    }
}
