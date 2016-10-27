package lanou.a36kedemo.mine;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import lanou.a36kedemo.R;
import lanou.a36kedemo.base.BaseActivity;

/**
 * Created by dllo on 16/10/27.
 */
public class CommentActivity extends BaseActivity{

    private TabLayout tb;
    private ViewPager vp;
    private ArrayList<Fragment> arrayList;

    @Override
    protected void initData() {
        arrayList = new ArrayList<>();
        bindFragment(arrayList,new SendFragment());
        bindFragment(arrayList,new AnswerFragment());
        CommentAdapter adapter = new CommentAdapter(getSupportFragmentManager());
        adapter.setFragments(arrayList);
        vp.setAdapter(adapter);
        tb.setupWithViewPager(vp);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_comment;
    }

    @Override
    protected void initViews() {
        tb = bindView(R.id.tb_comment);
        vp = bindView(R.id.vp_comment);
    }
}
