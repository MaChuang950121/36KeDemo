package lanou.a36kedemo.firstpage;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import lanou.a36kedemo.R;
import lanou.a36kedemo.base.BaseFragment;

/**
 * Created by dllo on 16/10/21.
 */
public class FirstPageFragment extends BaseFragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ArrayList<Fragment> arrayList;

    @Override
    protected void initView() {
        viewPager = bindView(R.id.vp_first_page);
        tabLayout = bindView(R.id.tb_first_page);
    }
    @Override
    protected void addFragmentArrayList() {
        arrayList = new ArrayList<>();
        bindFragment(arrayList,new NewsFlashFragment());
        bindFragment(arrayList,new RecommendFragment());
        bindFragment(arrayList,new ProjectFragment());
    }

    @Override
    protected void addAdapter() {
        FirstPageAdapter adapter = new FirstPageAdapter(getChildFragmentManager());
        adapter.setFragments(arrayList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }



    @Override
    public int getLayout() {
        return R.layout.fragment_first;
    }

}
