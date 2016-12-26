package yy.pwdmanager.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import yy.pwdmanager.R;

/**
 * Created by Administrator on 2016/12/26.
 */

public class MyAdapter extends BaseAdapter {
    Context mContext;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    View mView;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (mView == null) {
            mView = LayoutInflater.from(mContext).inflate(R.layout.item_ui, null);
            holder = new ViewHolder();
            mView.setTag(holder);
        } else {
            holder = (ViewHolder) mView.getTag();
        }
        return mView;
    }
}

class ViewHolder {
    TextView titleTextView;
    ImageView iconImageView;
}
