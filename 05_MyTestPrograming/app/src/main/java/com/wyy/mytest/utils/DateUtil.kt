package com.wyy.mytest.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * 英文全称  如：2017-11-01 22:11:00
 */
const val FORMAT_YMDHMS = "yyyy-MM-dd HH:mm:ss"

class DateUtil {
    fun dateToStamp(time: String): Long {
        val simpleDateFormat = SimpleDateFormat(FORMAT_YMDHMS, Locale.CHINA)
        val date = simpleDateFormat.parse(time)
        return date.time
    }

    /**
     * 时间毫秒数格式化为指定的时间格式
     */
    fun stampToDate(lt: Long): String {
        val simpleDateFormat = SimpleDateFormat(FORMAT_YMDHMS, Locale.CHINA)
        val date = Date(lt)
        return simpleDateFormat.format(date)
    }
}