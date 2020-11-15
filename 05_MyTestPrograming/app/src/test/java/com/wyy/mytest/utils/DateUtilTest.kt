package com.wyy.mytest.utils

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

const val EXPECTED = "5882-03-11 08:32:03"
const val EXPECTED_TRUE = "5882-03-11 08:32:02"
const val TIME_STAMP = 123456789123456L

@RunWith(Parameterized::class)
class DateUtilTest {
//    private lateinit var timeStamp:Long

    constructor(timeStamp: Long) {
//        this.timeStamp = timeStamp
    }


    @Parameterized.Parameters
    fun primeNumbers(): Collection<Long> {
        return listOf(123456789123456L, 123456789123457L, 123456789123458L)
    }

    @Before
    fun setUp() {
    }

    @Test
    fun stampToDate() {
        assertEquals(EXPECTED_TRUE, DateUtil().stampToDate(TIME_STAMP))
//        assertTrue(EXPECTED_TRUE == DateUtil().stampToDate(TIME_STAMP))
    }
}