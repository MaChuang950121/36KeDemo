package lanou.a36kedemo.mine;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import lanou.a36kedemo.R;
import lanou.a36kedemo.base.BaseFragment;

/**
 * Created by dllo on 16/10/21.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener {

    private View user;
    private View data;
    private View collect;
    private View comment;
    private View settings;
    private View feedBack;
    private Context context;
    private RelativeLayout user2;
    private RelativeLayout data2;
    private RelativeLayout collect2;
    private RelativeLayout comment2;
    private RelativeLayout settings2;
    private RelativeLayout feedBack2;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    protected void addAdapter() {

    }

    @Override
    protected void addAsyncTask() {

    }

    @Override
    protected void addFragmentArrayList() {

    }



    @Override
    protected void initView() {
        user = bindView(R.id.user);
        data = bindView(R.id.data);
        collect = bindView(R.id.collect);
        comment = bindView(R.id.comment);
        settings = bindView(R.id.settings);
        feedBack = bindView(R.id.feedBack);
//        user2 = bindView(R.id.user2);
//        data2 = bindView(R.id.data2);
//        collect2 = bindViews(collect, R.id.collect2);
//        comment2 = bindViews(comment, R.id.comment2);
//        settings2 = bindViews(settings, R.id.settings2);
//        feedBack2 = bindViews(feedBack, R.id.feedBack2);
        setItemOnClick(this, user, data, collect, comment, settings, feedBack);



    }

    @Override
    public int getLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.user:
                Intent intent = new Intent(getActivity(),UserActivity.class);
                startActivity(intent);
                break;
            case R.id.data:
                Intent intent1 = new Intent(getActivity(),UserActivity.class);
                startActivity(intent1);
                break;
            case R.id.collect:
                Intent intent2 = new Intent(getActivity(),CollectActivity.class);
                startActivity(intent2);
                break;
            case R.id.comment:
                Intent intent3 = new Intent(getActivity(),CommentActivity.class);
                startActivity(intent3);
                break;
            case R.id.settings:
                Intent intent4 = new Intent(getActivity(),SettingsActivity.class);
                startActivity(intent4);
                break;
            case R.id.feedBack:
                break;
        }
    }
}
