package lanou.a36kedemo.firstpage;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.util.Log;
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
public class ProjectFragment extends BaseFragment {
    Context context;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private ListView listView;

    @Override
    protected void addAsyncTask() {
        ProjectAsyncTask  asyncTask = new ProjectAsyncTask();
        asyncTask.execute();
    }

    @Override
    protected void addFragmentArrayList() {

    }

    @Override
    protected void addAdapter() {
//        ArrayList<ProjectBean> arrayList = new ArrayList<>();
//        ProjectAdapter adapter = new ProjectAdapter(context);
//        adapter.setArrayList(arrayList);
//        listView.setAdapter(adapter);

    }

    @Override
    protected void initView() {
        listView = bindView(R.id.lv_project);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_project;
    }

    private class ProjectAsyncTask extends AsyncTask<GsonRequest<ProjectBean>,
            Void,GsonRequest<ProjectBean>>{

        @Override
        protected GsonRequest<ProjectBean> doInBackground(GsonRequest<ProjectBean>... strings) {
            final GsonRequest<ProjectBean> gsonRequest =
                    new GsonRequest<ProjectBean>(ProjectBean.class,
                    UrlValues.FIRSTPAGE_PROJECT, new Response.Listener<ProjectBean>() {
                @Override
                public void onResponse(ProjectBean response) {
                    Log.d("ProjectAsyncTask", "response:" + response);
                    ArrayList<ProjectBean.DataBean.DataBeans> beans =
                            (ArrayList<ProjectBean.DataBean.DataBeans>) response.getData().getData();
                    Log.d("ProjectAsyncTask", "beans:" + beans);

                    ProjectAdapter adapter = new ProjectAdapter(context);
                    adapter.setBean(beans);
                    listView.setAdapter(adapter);

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("ProjectAsyncTask", "error:" + error);

                }
            });

            return gsonRequest;

        }

        @Override
        protected void onPostExecute(GsonRequest<ProjectBean> s) {
            super.onPostExecute(s);
            VolleySingle.getVolleySingle().addRequest(s);

        }
    }
}
