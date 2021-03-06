package lanou.a36kedemo.mine;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import lanou.a36kedemo.R;
import lanou.a36kedemo.base.BaseActivity;


/**
 * Created by dllo on 16/10/28.
 */
public class OffLineActivity extends BaseActivity implements View.OnClickListener {


    private TextView areaCode;

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_off_line;
    }

    @Override
    protected void initViews() {
        areaCode = bindView(R.id.tv_area_code);
        setOnClick(this,areaCode);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_area_code:
                startActivity(new Intent(this,PopupPrefix.class));
                break;
        }
    }
}
