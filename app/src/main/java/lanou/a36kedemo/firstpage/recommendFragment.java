package lanou.a36kedemo.firstpage;


import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.ArrayList;

import lanou.a36kedemo.R;
import lanou.a36kedemo.base.BaseFragment;
import lanou.a36kedemo.tools.GsonRequest;
import lanou.a36kedemo.tools.UrlValues;
import lanou.a36kedemo.tools.VolleySingle;

/**
 * Created by dllo on 16/10/21.
 */
public class RecommendFragment extends BaseFragment {
    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private ListView listView;

    @Override
    protected void addAdapter() {

    }

    @Override
    protected void addAsyncTask() {
        RecommendAsyncTask asyncTask = new RecommendAsyncTask();
        asyncTask.execute();
    }

    @Override
    protected void addFragmentArrayList() {

    }

    @Override
    protected void initView() {
        listView = bindView(R.id.lv_recommend);

    }

    @Override
    public int getLayout() {
        return R.layout.fragment_recommend;
    }

    private class RecommendAsyncTask extends AsyncTask<GsonRequest<RecommendBean>,
            Void,GsonRequest<RecommendBean>>{
        @Override
        protected GsonRequest<RecommendBean> doInBackground(GsonRequest<RecommendBean>... gsonRequests) {
            GsonRequest<RecommendBean> gsonRequest = new GsonRequest<RecommendBean>(RecommendBean.class,
                    UrlValues.FIRSTPAGE_RECOMMEND, new Response.Listener<RecommendBean>() {
                @Override
                public void onResponse(RecommendBean response) {
                    ArrayList<RecommendBean.DataBean.DataBeans> arrayList =
                            (ArrayList<RecommendBean.DataBean.DataBeans>) response.getData().getData();
                    RecommendAdapter  adapter = new RecommendAdapter(context);
                    adapter.setArrayList(arrayList);
                    listView.setAdapter(adapter);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
            return gsonRequest;
        }

        @Override
        protected void onPostExecute(GsonRequest<RecommendBean> recommendBeanGsonRequest) {
            super.onPostExecute(recommendBeanGsonRequest);
            VolleySingle.getVolleySingle().addRequest(recommendBeanGsonRequest);
        }
    }
}
