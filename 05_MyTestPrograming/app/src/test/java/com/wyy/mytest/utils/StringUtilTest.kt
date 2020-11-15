package com.wyy.mytest.utils

import android.content.Context
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(
    MockitoJUnitRunner::class
)
class StringUtilTest {


    @Test
    fun checkStringStartWithTarget() {
        assertThat(StringUtil.checkStringStartWithTarget("abcdefg", "abc")).isTrue()
    }

    fun testSourceString() {
//        assertThat()
    }
}