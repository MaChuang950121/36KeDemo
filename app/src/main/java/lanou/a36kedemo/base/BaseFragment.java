package lanou.a36kedemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import lanou.a36kedemo.R;

/**
 * Created by dllo on 16/10/21.
 */
public abstract class BaseFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (getLayout() == 0){
            return inflater.inflate(R.layout.null_layout,container,false);
        }
        return inflater.inflate(getLayout(),container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        addFragmentArrayList();
        addAsyncTask();
        addAdapter();
    }

    protected abstract void addAdapter();

    protected abstract void addAsyncTask();

    protected abstract void addFragmentArrayList();


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
    protected <T extends View> T bindView(int id){
        return (T) getView().findViewById(id);
    }
    protected <T extends View> T bindView(View view,int id){
        return (T) view.findViewById(id);
    }
    protected abstract void initView();
    public abstract int getLayout() ;
    protected void bindFragment(ArrayList<Fragment> arrayList,Fragment fragment){
        arrayList.add(fragment);
    }

}
