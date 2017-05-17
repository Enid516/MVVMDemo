package com.example.mvvmdemo.list;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.List;

/**
 * 通用的Adapter
 * Created by Enid on 2017/5/11.
 */

public class CommonAdapter<T> extends BaseAdapter {
    private Context mContext;
    private List<T> mDataList;
    private int layoutId;   //item布局ID
    private int variableId; //DataBinding的变量ID

    public CommonAdapter(Context mContext, List<T> mDataList, int layoutId, int variableId) {
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.layoutId = layoutId;
        this.variableId = variableId;
    }

    @Override
    public int getCount() {
        return mDataList == null ? 0 : mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //没有ViewHolder的复用，但Databinding内部已经实现了复用
        ViewDataBinding binding;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), layoutId, parent, false);
        } else {
            binding = DataBindingUtil.getBinding(convertView);
        }
        binding.setVariable(variableId,mDataList.get(position));
        return binding.getRoot();
    }
}
