package com.softgates.instadoctor.network

import com.squareup.moshi.Json

data class ScheduleList(

    @Json(name="time")
    var time: String? = null,

    @Json(name="tick")
    var tick: Int? = 0

)