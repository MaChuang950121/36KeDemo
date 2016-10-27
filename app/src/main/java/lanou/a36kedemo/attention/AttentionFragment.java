package lanou.a36kedemo.attention;

import android.support.v4.app.Fragment;
import android.widget.ListView;

import lanou.a36kedemo.R;
import lanou.a36kedemo.base.BaseFragment;

/**
 * Created by dllo on 16/10/21.
 */
public class AttentionFragment extends BaseFragment {

    private ListView listView;

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
        listView = bindView(R.id.lv_attention);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_attention;
    }
}
