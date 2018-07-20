package com.cs.javaTest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.cs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/19/019.
 */

public class TestActivity extends AppCompatActivity {
    private RecyclerView mRlTest;
    private TestAdapter mAdapter;
    private List<String > mList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        initDate();
    }

    private void initDate() {
        for (int i = 0; i < 20; i++) {
            mList.add("高手>>>  "+i);
        }
        mAdapter.notifyDataSetChanged();
    }

    private void initView() {
        mRlTest = (RecyclerView) findViewById(R.id.rl_test);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRlTest.setLayoutManager(linearLayoutManager);

        mAdapter=new TestAdapter(this, mList);
        mRlTest.setAdapter(mAdapter);

        mAdapter.setOnItemClickListen(new TestAdapter.OnItemClickListen() {
            @Override
            public void onItemClick(View view, int pos) {
                Toast.makeText(TestActivity.this, mList.get(pos), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
