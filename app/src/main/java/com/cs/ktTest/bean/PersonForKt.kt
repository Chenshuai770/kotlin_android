package com.cs.ktTest.bean

/**
 * Created by Administrator on 2018/7/19/019.
 */
class PersonForKt {
    var name: String = ""
        get() = field
        set(value) {
            field = "Name: $value"
        }
}

class PersonForKt1(val name:String)