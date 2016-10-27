package lanou.a36kedemo.mine;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/27.
 */
public class CommentAdapter extends FragmentPagerAdapter{

    String[] title ={"回复我的","我发出的"};
    ArrayList<String> titleList = new ArrayList<>();
    ArrayList<Fragment> fragments = new ArrayList<>();

    public void setFragments(ArrayList<Fragment> fragments) {
        this.fragments = fragments;
        for (int i = 0; i < title.length; i++) {
            titleList.add(title[i]);
        }
    }

    public CommentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ?0 :fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
