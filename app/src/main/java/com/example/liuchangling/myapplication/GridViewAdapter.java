package com.example.liuchangling.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by liuchangling on 2020/7/22.
 */


public class GridViewAdapter extends BaseAdapter {
    private String TAG="TAG";

    private List<Taobao> taobaoList;

    private LayoutInflater inflater;
    public GridViewAdapter() {

    }

    public GridViewAdapter(List<Taobao> stuList, Context context) {
        this.taobaoList = stuList;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return taobaoList ==null?0: taobaoList.size();
    }

    @Override
    public Taobao getItem(int position) {
        return taobaoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        final View view=inflater.inflate(R.layout.activity_griditem,null);
        ViewHolder viewHolder=new ViewHolder();

        Taobao taobao=getItem(position);
        viewHolder.t1=view.findViewById(R.id.t1);
        viewHolder.t1.setText(taobao.getName());
        viewHolder.t2=view.findViewById(R.id.t2);
        viewHolder.t2.setText(taobao.getInformation());
        return view;
    }

    class ViewHolder{
        TextView t1;
        TextView t2;
    }
}
