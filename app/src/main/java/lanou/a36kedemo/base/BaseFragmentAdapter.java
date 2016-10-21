package lanou.a36kedemo.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/21.
 */
public abstract class BaseFragmentAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments = new ArrayList<>();
    public BaseFragmentAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
       return getFragmentItem(position);
    }

    @Override
    public int getCount() {
        return 0;
    }

    protected    Fragment getFragmentItem(int position) {
        return  fragments.get(position);

    }
}
