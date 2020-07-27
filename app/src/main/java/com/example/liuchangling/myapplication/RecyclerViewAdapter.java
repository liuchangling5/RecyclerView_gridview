package com.example.liuchangling.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by liuchangling on 2020/7/22.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String TAG="TAG";
    List<Taobao> list;    //数据集合
    Context context;
    String path1;
    String path2;
    private LayoutInflater layoutInflater;
    List<Bean> beanList;

    public RecyclerViewAdapter(List<Bean> beanList, Context context, String path1, String path2) {
        this.beanList = beanList;
        this.path1 = path1;
        this.path2 = path2;
        this.context = context;
    }

    //    这个方法是用来处理onCreateViewHolder方法中的viewtype 的
    @Override
    public int getItemViewType(int position) {
        System.out.println("getItemViewType  " + position);
        return position;
    }

    //    初始化item布局
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        System.out.println("这里的 viewtype " + viewType);
        View view = LayoutInflater.from(context).inflate(R.layout.activity_grid, parent, false);
        viewHolder = new GridViewHolder(view);
        return viewHolder;
    }

    //    处理每一个item 的地方,绑定数据
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        list=beanList.get(position).getList();
        GridViewHolder gridViewHolder = (GridViewHolder) holder;
        gridViewHolder.gridView.setAdapter(new GridViewAdapter(list,context));
    }

    @Override
    public int getItemCount() {
        return beanList.size();

    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        public GridView gridView;
        public TextView textView;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv);
            gridView = itemView.findViewById(R.id.g1);
            Log.d(TAG, "GridViewHolder: "+list);
        }
    }
}
