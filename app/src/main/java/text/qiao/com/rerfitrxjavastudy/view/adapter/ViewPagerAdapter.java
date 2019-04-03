package text.qiao.com.rerfitrxjavastudy.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @project：RerfitRxJavaStudy
 * @fileName ViewPagerAdapter
 * @author：乔少聪
 * @date：2019/1/2 11:05
 * @describe：
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private String[] strings;
    private ArrayList<Fragment> fragmentList;

    public ViewPagerAdapter(FragmentManager fm, String[] strings, ArrayList<Fragment> fragmentList) {
        super(fm);
        this.strings = strings;
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        if(strings.length>fragmentList.size()&&position>fragmentList.size()-1){
            return fragmentList.get(fragmentList.size()-1);
        }
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return strings.length;
    }
}
