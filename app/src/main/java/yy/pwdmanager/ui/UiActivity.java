package yy.pwdmanager.ui;

import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;
import yy.pwdmanager.model.UiModel;
import yy.pwdmanager.util.CommonAdapter;
import yy.pwdmanager.util.CommonViewHolder;
import yy.pwdmanager.util.Utils;

/**
 * Created by Finder丶畅畅 on 2016/12/18 00:14
 * QQ群481606175
 */

public class UiActivity extends BaseActivity {


    @Override
    public void initViews() {
        setContentView(R.layout.ac_ui);
        ButterKnife.bind(this);


    }

    @Override
    public void initEvents() {

    }
}
