package com.example.spreadtrummichaelwang.viewadapter;

/**
 * Created by SPREADTRUM\michael.wang on 16-7-26.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter<T> extends CommonAdapter<T>
{
//    private LayoutInflater mInflater;
//    private Context mContext;
//    private List<T> mDatas;

    public MyAdapter(Context context, List<T> mDatas)
    {
        super(context,mDatas);
    }

//    @Override
//    public int getCount()
//    {
//        return mDatas.size();
//    }
//
//    @Override
//    public Object getItem(int position)
//    {
//        return mDatas.get(position);
//    }
//
//    @Override
//    public long getItemId(int position)
//    {
//        return position;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        MyViewHolder viewHolder = MyViewHolder.get(mContext, convertView, parent,
                R.layout.item, position);
        TextView mTitle = viewHolder.getView(R.id.id_tv_title);
        mTitle.setText((String) mDatas.get(position));
        return viewHolder.getConvertView();
    }

//    private final class ViewHolder
//    {
//        TextView mTextView;
//    }

}