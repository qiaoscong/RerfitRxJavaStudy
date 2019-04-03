package text.qiao.com.rerfitrxjavastudy.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.base.SimpleActivity;
import text.qiao.com.rerfitrxjavastudy.view.adapter.ViewPagerAdapter;
import text.qiao.com.rerfitrxjavastudy.view.fragment.TouTiaoFragment;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

/**
 * @author 乔少聪
 * @time 2019/1/2 10:19
 * @describe 新闻头条
 */
public class XinWenActivity extends SimpleActivity {

    @BindView(R.id.slidingtab_xinwen)
    SlidingTabLayout slidingtabXinwen;
    @BindView(R.id.viewpager_xinwen)
    ViewPager viewpagerXinwen;

    private String[] strings = {"头条", "社会", "国内", "国际", "娱乐", "体育", "军事", "科技", "财经", "时尚"};

    private ViewPagerAdapter mViewPagerAdapter;
    private ArrayList<Fragment> fragmentList = new ArrayList<>();

    public static void startXinWen(Context context) {
        Intent ii = new Intent(context, XinWenActivity.class);
        context.startActivity(ii);
    }

    @Override
    protected void initInject() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_xinwen;
    }

    @Override
    protected void initView() {

        setSwipeBackEnable(true);
    }

    @Override
    protected void obtainData() {
        initData();
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), strings, fragmentList);
        viewpagerXinwen.setAdapter(mViewPagerAdapter);
        slidingtabXinwen.setViewPager(viewpagerXinwen, strings,this,fragmentList);
    }

    @Override
    protected void initEvent() {
        slidingtabXinwen.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                LogUtil.e("onTabSelect" + position);
            }

            @Override
            public void onTabReselect(int position) {
                LogUtil.e("onTabReselect" + position);
            }
        });
    }

    private void initData() {
        fragmentList.add(TouTiaoFragment.newInstance("top"));
        fragmentList.add(TouTiaoFragment.newInstance("shehui"));
        fragmentList.add(TouTiaoFragment.newInstance("guonei"));
        fragmentList.add(TouTiaoFragment.newInstance("guoji"));
        fragmentList.add(TouTiaoFragment.newInstance("yule"));
        fragmentList.add(TouTiaoFragment.newInstance("tiyu"));
        fragmentList.add(TouTiaoFragment.newInstance("junshi"));
        fragmentList.add(TouTiaoFragment.newInstance("keji"));
        fragmentList.add(TouTiaoFragment.newInstance("caijing"));
        fragmentList.add(TouTiaoFragment.newInstance("shishang"));
    }

}
