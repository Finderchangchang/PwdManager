package yy.pwdmanager.ui;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;
import yy.pwdmanager.util.DrawView;

/**
 * Created by Finder丶畅畅 on 2016/12/18 00:14
 * QQ群481606175
 */

public class UiActivity extends BaseActivity {
    @Bind(R.id.bottom_ll)
    LinearLayout bottom_ll;
    DrawView view;
    @Bind(R.id.clear_btn)
    Button clear_btn;
    @Bind(R.id.main_ll)
    LinearLayout main_ll;
    float startX;//起始的x的位置

    @Override
    public void initViews() {
        setContentView(R.layout.ac_ui);
        ButterKnife.bind(this);
        view = new DrawView(this);
    }

    @Override
    public void initEvents() {
        bottom_ll.addView(view);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        int w = View.MeasureSpec.makeMeasureSpec(0,
                View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0,
                View.MeasureSpec.UNSPECIFIED);
        clear_btn.measure(w, h);
        int ben_width = clear_btn.getMeasuredWidth();
        int ben_height = clear_btn.getMeasuredHeight();
        clear_btn.setX(metrics.widthPixels / 2 - ben_width / 2);
        clear_btn.setY(metrics.heightPixels - ben_height / 2 - 200);
//        clear_btn.setOnClickListener(v -> view.clearImg());
        main_ll.setOnTouchListener((v, event) -> {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    break;
                case MotionEvent.ACTION_UP:
                    break;
                case MotionEvent.ACTION_MOVE:
                    Log.i("X", event.getX() + "");
                    break;
            }
            return true;
        });
    }
}
