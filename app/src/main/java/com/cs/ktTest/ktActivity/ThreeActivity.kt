package com.cs.ktTest.ktActivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.cs.R
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

/**
 * Created by chenshuai on 2018/7/20/020.
 */
class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        val mButton=find<Button>(R.id.btn_three1)

        mButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                toast("gaoshou")
            }

        })
    }
}