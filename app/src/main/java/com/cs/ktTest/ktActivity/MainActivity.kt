package com.cs.ktTest.ktActivity


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*
import com.cs.R
import com.cs.ktTest.http.Request
import java.text.SimpleDateFormat
import java.util.*

// Using R.layout.activity_main from the 'main' source set


class MainActivity : AppCompatActivity(), View.OnClickListener {

    var timeTextView: TextView? = null
    var container: LinearLayout? = null
    var mButton1: Button? = null
    var mButton2: Button? = null
    var mEtUsrer: EditText? = null
    var mEtPassWord: EditText? = null
    val url:String="http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()


    }

    private fun initView() {
        timeTextView = findViewById(R.id.tv_test) as TextView
        container = findViewById(R.id.ll_container) as LinearLayout
        mButton1 = findViewById(R.id.btn_test1) as Button
        mButton2 = findViewById(R.id.btn_test2) as Button
        mEtUsrer = findViewById(R.id.et_user) as EditText
        mEtPassWord = findViewById(R.id.et_password) as EditText

        mButton1!!.setOnClickListener(this)
        mButton2!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_test1 -> {
                toast("高手")

            }
            R.id.btn_test2 -> {
                //showTime()//显示时间
                /*val intent=Intent(this,SecondActivity::class.java)
                intent.putExtra("uername", mEtUsrer!!.text.toString())
                intent.putExtra("password", mEtPassWord!!.text.toString())
                startActivityForResult(intent,1)*/

                var request=Request(url)
                request.run()

            }
            else -> {
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {


        }
    }


    //封装toast 第二个参数已经封装了数据,所以可以不用继续调用了
    fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT): Unit {
        Toast.makeText(this, message, length).show()
    }

    //点击按钮显示时间
    fun showTime() {
        val dataFormatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        var time = dataFormatter.format(Date())
//      timeTextView!!.setText(time)
        timeTextView!!.text = time
    }


}
