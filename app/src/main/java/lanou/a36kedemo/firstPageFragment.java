package lanou.a36kedemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import lanou.a36kedemo.base.BaseFragment;

/**
 * Created by dllo on 16/10/21.
 */
public class firstPageFragment extends BaseFragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void addFragmentArrayList() {
        ArrayList<Fragment> arrayList = new ArrayList<>();
        bindFragment(arrayList,new newsFlashFragment());
        bindFragment(arrayList,new recommendFragment());
        bindFragment(arrayList,new projectFragment());
    }

    @Override
    protected void initView() {
        viewPager = bindView(R.id.vp_firstPage);
        tabLayout = bindView(R.id.tb_firstPage);
    }

    @Override
    public int getLayout() {
        return R.layout.firstfragment;
    }

}
