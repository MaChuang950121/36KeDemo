package lanou.a36kedemo.firstpage;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.text.SimpleDateFormat;
import java.util.ArrayList;

import it.sephiroth.android.library.picasso.Picasso;
import lanou.a36kedemo.R;
import lanou.a36kedemo.tools.VolleySingle;

/**
 * Created by dllo on 16/10/25.
 */
public class ProjectAdapter extends BaseAdapter {

    Context context;
    ArrayList<ProjectBean.DataBean.DataBeans> bean;

    public void setBean(ArrayList<ProjectBean.DataBean.DataBeans> bean) {
        this.bean = bean;
    }

    public ProjectAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return bean == null ? 0 : bean.size();
    }

    @Override
    public Object getItem(int i) {
        return bean.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_project,viewGroup,false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        viewHolder.date.setText(format.format(bean.get(i).getPublishTime()));
        viewHolder.source.setText(bean.get(i).getColumnName());
        viewHolder.title.setText(bean.get(i).getTitle());
//        Picasso.with(context).load(bean.get(i).getFeatureImg()).
//                into(viewHolder.iv);
 VolleySingle.getVolleySingle().getImage(bean.get(i).getFeatureImg(),viewHolder.iv);
        return view;
    }
    class ViewHolder{

        private TextView title;
        private TextView source;
        private TextView date;
        private ImageView iv;

        public ViewHolder(View view) {
            title = (TextView) view.findViewById(R.id.tv_project_title);
            source = (TextView) view.findViewById(R.id.tv_project_source);
            date = (TextView) view.findViewById(R.id.tv_project_date);
            iv = (ImageView) view.findViewById(R.id.iv_project);
        }
    }
}
