package yy.pwdmanager.ui;

import android.widget.DatePicker;

import butterknife.Bind;
import butterknife.ButterKnife;
import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;

/**
 * Created by Administrator on 2016/12/22.
 */

public class DateActivity extends BaseActivity {
    @Bind(R.id.datePicker)
    DatePicker datePicker;

    @Override
    public void initViews() {
        setContentView(R.layout.ac_date);
        ButterKnife.bind(this);

    }

    @Override
    public void initEvents() {

    }
}
