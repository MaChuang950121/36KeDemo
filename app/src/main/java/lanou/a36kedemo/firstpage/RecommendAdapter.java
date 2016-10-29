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
import lanou.a36kedemo.tools.VolleySingle;

/**
 * Created by dllo on 16/10/29.
 */
public class RecommendAdapter extends BaseAdapter{
    Context context;
    ArrayList<RecommendBean.DataBean.DataBeans> arrayList = new ArrayList<>();

    public RecommendAdapter(Context context) {
        this.context = context;
    }

    public void setArrayList(ArrayList<RecommendBean.DataBean.DataBeans> arrayList) {
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
            view = LayoutInflater.from(context).inflate(R.layout.item_recommend,null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(arrayList.get(i).getTitle());
        viewHolder.source.setText(arrayList.get(i).getColumnName());
        VolleySingle.getVolleySingle().getImage(arrayList.get(i).getFeatureImg(),viewHolder.iv);
        return view;
    }

    private class ViewHolder {

        private final ImageView iv;
        private final TextView title;
        private final TextView source;

        public ViewHolder(View view) {
            iv = (ImageView) view.findViewById(R.id.iv_recommend);
            title = (TextView) view.findViewById(R.id.tv_recommend_title);
            source = (TextView) view.findViewById(R.id.tv_recommend_source);
        }
    }
}
