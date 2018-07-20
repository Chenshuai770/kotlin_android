package com.cs.ktTest.application

import android.app.Application

/**
 * Created by chenshuai on 2018/7/20/020.
 */
class App : Application() {
    companion object {
        private var instance:Application?=null
        fun instance()= instance!!

       // lateinit var instant: App

    }

    override fun onCreate() {
        super.onCreate()
        instance=this
    }
}