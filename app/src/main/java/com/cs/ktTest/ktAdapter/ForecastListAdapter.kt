package com.cs.ktTest.ktAdapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator on 2018/7/19/019.
 */
class ForecastListAdapter(val mList: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int = mList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textview.text = mList[position]
    }

    //todo 声明接口



    class ViewHolder(val textview: TextView) : RecyclerView.ViewHolder(textview)
}