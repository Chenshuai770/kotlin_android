package com.cs.ktTest.http

import android.util.Log
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.uiThread
import java.net.URL

/**
 * Created by chenshuai on 2018/7/19/019.
 */

class Request(val url:String){
    fun run(): Unit {
        async(){
            val forecastJsonStr=URL(url).readText()
            uiThread {
                Log.d(javaClass.simpleName,forecastJsonStr)
            }
        }

    }
}