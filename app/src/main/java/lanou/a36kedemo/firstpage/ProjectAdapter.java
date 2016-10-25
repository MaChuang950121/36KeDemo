package lanou.a36kedemo.firstpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import lanou.a36kedemo.R;

/**
 * Created by dllo on 16/10/25.
 */
public class ProjectAdapter extends BaseAdapter {
    ArrayList<ProjectBean.DataBean.DataBeans> arrayList;
    Context context;

    public ProjectAdapter(Context context) {
        this.context = context;
    }

    public void setArrayList(ArrayList<ProjectBean.DataBean.DataBeans> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList == null ? 0 : arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_project,null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.date.setText(String.valueOf(arrayList.get(i).getPublishTime()));
        viewHolder.source.setText(arrayList.get(i).getType());
        viewHolder.title.setText(arrayList.get(i).getTitle());

        return view;
    }
    class ViewHolder{

        private final TextView title;
        private final TextView source;
        private final TextView date;
        private final ImageView iv;

        public ViewHolder(View view) {
            title = (TextView) view.findViewById(R.id.tv_project_title);
            source = (TextView) view.findViewById(R.id.tv_project_source);
            date = (TextView) view.findViewById(R.id.tv_project_date);
            iv = (ImageView) view.findViewById(R.id.iv_project);
        }
    }
}
