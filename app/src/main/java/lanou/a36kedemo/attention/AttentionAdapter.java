package lanou.a36kedemo.attention;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import lanou.a36kedemo.R;


/**
 * Created by dllo on 16/10/24.
 */
public class AttentionAdapter extends BaseAdapter {
    ArrayList<String> arrayList;
    Context context;

    public AttentionAdapter(Context context) {
        this.context = context;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList == null?0 :arrayList.size();
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
            view = LayoutInflater.from(context).inflate(R.layout.item_attention,null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_attention.setText(arrayList.get(i).toString());
        return view;
    }
    class ViewHolder{

        private final TextView tv_attention;

        public ViewHolder(View view) {
            tv_attention = (TextView) view.findViewById(R.id.tv_attention);
        }
    }
}
