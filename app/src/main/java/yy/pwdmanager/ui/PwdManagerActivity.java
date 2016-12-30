package yy.pwdmanager.ui;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SynthesizerListener;

import java.util.Calendar;

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
        datePickerDialog = new DatePickerDialog(this, (view, year, monthOfYear, dayOfMonth) -> {

        }, Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
    }

    TextView start_tv;
    TextView end_tv;
    DatePickerDialog datePickerDialog;

    private void load() {
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottom_sheet));
        mBottomSheetDialog = new BottomSheetDialog(this);
        mBottomSheetDialog.setCancelable(false);
        mBottomSheetDialog.setContentView(R.layout.dialog_bottom);
        Button btn = (Button) mBottomSheetDialog.findViewById(R.id.dia_btn);
        btn.setOnClickListener(v -> mBottomSheetDialog.dismiss());
        start_tv = (TextView) mBottomSheetDialog.findViewById(R.id.start_tv);
        start_tv.setOnClickListener(v -> datePickerDialog.show());
        mBottomSheetDialog.setOnCancelListener(dialog -> ToastShort("Cancel"));
        mBottomSheetDialog.setOnDismissListener(dialog -> load());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case 1:
                start_tv.setText(data.getStringExtra("data"));
                break;
            case 2:
                end_tv.setText(data.getStringExtra("data"));
                break;
        }
    }

    @Override
    public void initEvents() {
        btn.setOnClickListener(v -> mBottomSheetDialog.show());
//        btn.setOnClickListener(v -> spike());
        load();
    }
}
