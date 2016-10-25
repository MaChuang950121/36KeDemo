package lanou.a36kedemo;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import lanou.a36kedemo.attention.AttentionFragment;
import lanou.a36kedemo.base.BaseActivity;
import lanou.a36kedemo.find.FindFragment;
import lanou.a36kedemo.firstpage.FirstPageFragment;
import lanou.a36kedemo.mine.MineFragment;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private RadioButton first;
    private RadioButton attention;
    private RadioButton find;
    private RadioButton mine;

    @Override
    protected void initData() {
        first.setChecked(true);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_replace,new FirstPageFragment());
        transaction.commit();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        first = bindView(R.id.rb_first);
        attention = bindView(R.id.rb_attention);
        find = bindView(R.id.rb_find);
        mine = bindView(R.id.rb_mine);
        setOnClick(this,first,attention,find,mine);

    }


    @Override
    public void onClick(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (view.getId()){
            case R.id.rb_first:
                transaction.replace(R.id.fl_replace,new FirstPageFragment());
                break;
            case R.id.rb_attention:
                transaction.replace(R.id.fl_replace,new AttentionFragment());
                break;
            case R.id.rb_find:
                transaction.replace(R.id.fl_replace,new FindFragment());
                break;
            case R.id.rb_mine:
                transaction.replace(R.id.fl_replace,new MineFragment());
                break;
        }
        transaction.commit();
    }
}
