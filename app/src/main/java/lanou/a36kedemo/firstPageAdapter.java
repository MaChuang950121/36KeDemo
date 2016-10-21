package lanou.a36kedemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/21.
 */
public class firstPageAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments  = new ArrayList<>();
    ArrayList<String> til = new ArrayList<>();
    String[] title = {"快讯","推荐","早期项目"};
    public firstPageAdapter(FragmentManager fm) {
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
}
