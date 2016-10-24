package lanou.a36kedemo.firstpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/21.
 */
public class FirstPageAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments  = new ArrayList<>();
    ArrayList<String> titleList = new ArrayList<>();
    String[] title = {"快讯","推荐","早期项目"};

    public FirstPageAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public void setFragments(ArrayList<Fragment> fragments) {
        this.fragments = fragments;
        for (int i = 0; i < title.length; i++) {
            titleList.add(title[i]);
        }
    }

    public FirstPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size() ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
