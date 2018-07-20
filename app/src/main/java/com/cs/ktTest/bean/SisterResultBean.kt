package com.cs.ktTest.bean

import com.google.gson.annotations.SerializedName

data class SisterResultBean(
        var error: Boolean = false, // false
        var results: List<Result> = listOf()
) {
    data class Result(
            @SerializedName("_id")
            var id: String = "", // 5b4eaae4421aa93aa99bee16
            var createdAt: String = "", // 2018-07-18T11:14:55.648Z
            var desc: String = "", // 2018-07-18
            var publishedAt: String = "", // 2018-07-18T00:00:00.0Z
            var source: String = "", // web
            var type: String = "", // 福利
            var url: String = "", // https://ww1.sinaimg.cn/large/0065oQSqly1ftdtot8zd3j30ju0pt137.jpg
            var used: Boolean = false, // true
            var who: String = "", // lijinshanmx
            var list: List<X> = listOf()
    ) {
        data class X(
                @SerializedName("_id")
                var id: String = "", // 5b398cf8421aa95570db5491
                var createdAt: String = "", // 2018-07-02T10:24:56.546Z
                var desc: String = "", // 2018-07-02
                var publishedAt: String = "", // 2018-07-02T00:00:00.0Z
                var source: String = "", // web
                var type: String = "", // 福利
                var url: String = "", // http://ww1.sinaimg.cn/large/0065oQSqly1fsvb1xduvaj30u013175p.jpg
                var used: Boolean = false, // true
                var who: String = "" // lijinshanmx
        )
    }
}