package com.cs.javaTest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cs.R;

import java.util.List;

/**
 * Created by Administrator on 2018/7/19/019.
 */

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private Context context;
    private List<String> mList;
    private OnItemClickListen onItemClickListen;


    public TestAdapter(Context context, List<String> mList) {
        this.context = context;
        this.mList = mList;
    }

    public void setOnItemClickListen(OnItemClickListen onItemClickListen){
        this.onItemClickListen=onItemClickListen;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_test_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(new TextView(parent.getContext()));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextview.setText(mList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListen.onItemClick(v,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextview;
        public ViewHolder (TextView mTextview) {
            super(mTextview);
            //mTextview= (TextView)itemView.findViewById(R.id.tv_test_list_title);
           this.mTextview=mTextview;

        }
    }

    interface OnItemClickListen {
        void onItemClick(View view,int pos);
    }
}
