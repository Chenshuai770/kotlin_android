package com.cs.ktTest.ktActivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.cs.R
import com.cs.ktTest.ktAdapter.ForecastListAdapter

class SecondActivity : AppCompatActivity() {
    private val mList= listOf(
            "星期一","星期二","星期三","星期四","星期五","星期六","星期日"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()


    }

    private fun initView() {
        val mRecyclerView=findViewById(R.id.rl_list) as RecyclerView
        mRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        mRecyclerView.adapter=ForecastListAdapter(mList)

    }
}
