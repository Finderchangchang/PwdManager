package yy.pwdmanager.ui;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import net.tsz.afinal.FinalDb;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import yy.pwdmanager.BaseActivity;
import yy.pwdmanager.R;
import yy.pwdmanager.listener.PwdTypeListener;
import yy.pwdmanager.model.PwdTypeModel;
import yy.pwdmanager.model.UiModel;
import yy.pwdmanager.util.CommonAdapter;
import yy.pwdmanager.util.CommonViewHolder;
import yy.pwdmanager.util.Utils;
import yy.pwdmanager.view.IMain;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener, IMain {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.nav_view)
    NavigationView navigationView;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawer;
    @Bind(R.id.main_gv)
    GridView mainGv;
    CommonAdapter<UiModel> mAdapter;
    List<UiModel> list;

    @Override
    public void initViews() {
        setContentView(R.layout.ac_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        fab.setOnClickListener(view ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
        );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        loadData();
        mAdapter = new CommonAdapter<UiModel>(this, list, R.layout.item_ui) {
            @Override
            public void convert(CommonViewHolder holder, UiModel s, int position) {
                holder.setImageResource(R.id.iv, s.getImg());
                holder.setText(R.id.tv, s.getTxt());
            }
        };
        mainGv.setAdapter(mAdapter);
    }

    @Override
    public void initEvents() {
        mAdapter.refresh(list);
        mainGv.setOnItemClickListener((parent, view, position, id) -> {
            switch (position) {
                case 0:
                    Utils.IntentPost(XHActivity.class);
                    break;
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void loadData() {
        list = new ArrayList();
        list.add(new UiModel("笑话大全", R.mipmap.nlsc_icon015));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon001));
        list.add(new UiModel("列车查询", R.mipmap.nlsc_icon002));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon003));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon004));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon005));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon006));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon007));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon008));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon009));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon010));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon011));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon012));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon013));
        list.add(new UiModel("列车查询", R.mipmap.nlsc_icon014));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon016));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon017));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon018));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon023));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon024));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon025));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon026));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon027));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon028));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon029));
        list.add(new UiModel("列车查询", R.mipmap.nlsc_icon030));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon031));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon032));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon033));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon034));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon035));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon036));
        list.add(new UiModel("快递查询", R.mipmap.nlsc_icon037));
    }
}
