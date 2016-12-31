package yy.pwdmanager.ui;

import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;
import yy.pwdmanager.model.MianShi;
import yy.pwdmanager.util.CommonAdapter;
import yy.pwdmanager.util.CommonViewHolder;

/**
 * 面试题
 * Created by Finder丶畅畅 on 2016/12/31 09:38
 * QQ群481606175
 */

public class MSActivity extends BaseActivity {
    @Bind(R.id.title_name_tv)
    TextView titleNameTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.main_lv)
    ListView mainLv;
    List<MianShi> lists;
    CommonAdapter<MianShi> mAdapter;

    @Override
    public void initViews() {
        setContentView(R.layout.ac_ms);
        ButterKnife.bind(this);
        toolbar.setNavigationOnClickListener(v -> finish());
        titleNameTv.setText("面试题集锦");
        lists = new ArrayList<>();
        mAdapter = new CommonAdapter<MianShi>(this, lists, R.layout.item_ms) {
            @Override
            public void convert(CommonViewHolder holder, MianShi msMessageModel, int position) {
                holder.setText(R.id.title_tv, (position + 1) + "、" + msMessageModel.getTitle());
                holder.setText(R.id.content_tv, msMessageModel.getContent());
            }
        };
        mainLv.setAdapter(mAdapter);
    }

    @Override
    public void initEvents() {
        BmobQuery<MianShi> query = new BmobQuery<>();
        query.order("-createdAt");
        query.findObjects(new FindListener<MianShi>() {
            @Override
            public void done(List<MianShi> list, BmobException e) {
                if (e == null) {
                    lists = list;
                    mAdapter.refresh(lists);
                }
            }
        });
    }
}
