package com.example.dm5.simpleviewpagerfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by zhenfei.wang on 2016/6/23.
 */
public class Fragment1 extends Fragment {
    private View mRootView;
    private Context mContext; // 避免getActivity()返回null

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.fragment, null, false);
            init(mRootView);
        }
        ViewGroup parent = (ViewGroup) mRootView.getParent();
        if (parent != null) {
            parent.removeView(mRootView);
        }
        return mRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private void init(View mRootView) {
        ListView listView = (ListView) mRootView.findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1);
        adapter.add("A");
        adapter.add("B");
        adapter.add("C");
        adapter.add("D");
        adapter.add("E");
        adapter.add("F");
        adapter.add("G");
        adapter.add("H");
        adapter.add("I");
        adapter.add("J");
        adapter.add("K");
        adapter.add("L");
        adapter.add("M");
        adapter.add("N");
        adapter.add("O");
        adapter.add("A");
        listView.setAdapter(adapter);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if(hidden){
            onPause();
        }else {
            onResume();
        }
    }
}
