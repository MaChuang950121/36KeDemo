package lanou.a36kedemo.mine;

import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import lanou.a36kedemo.R;
import lanou.a36kedemo.base.BaseActivity;

/**
 * Created by dllo on 16/10/29.
 */
public class PopupPrefix extends BaseActivity implements View.OnClickListener {

    private LinearLayout popUpPrefix;

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayout() {
        return R.layout.pop_prefix_item;
    }

    @Override
    protected void initViews() {
        popUpPrefix = bindView(R.id.pop_layout);
        setOnClick(this,popUpPrefix);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pop_layout:
                break;
        }
    }
    public boolean onTouchEvent(MotionEvent event){
        finish();
        return true;
    }
}
