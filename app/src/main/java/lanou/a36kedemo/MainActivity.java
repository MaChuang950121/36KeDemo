package lanou.a36kedemo;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import lanou.a36kedemo.base.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private RadioButton firstPage;
    private RadioButton attention;
    private RadioButton find;
    private RadioButton mine;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        firstPage = bindView(R.id.rb_firstPage);
        attention = bindView(R.id.rb_attention);
        find = bindView(R.id.rb_find);
        mine = bindView(R.id.rb_mine);
        setOnClick(this,firstPage,attention,find,mine);

    }


    @Override
    public void onClick(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (view.getId()){
            case R.id.rb_firstPage:
                transaction.replace(R.id.fl_replace,new firstPageFragment());
                break;
            case R.id.rb_attention:
                transaction.replace(R.id.fl_replace,new attentionFragment());
                break;
            case R.id.rb_find:
                transaction.replace(R.id.fl_replace,new findFragment());
                break;
            case R.id.rb_mine:
                transaction.replace(R.id.fl_replace,new mineFragment());
                break;
        }
        transaction.commit();
    }
}
