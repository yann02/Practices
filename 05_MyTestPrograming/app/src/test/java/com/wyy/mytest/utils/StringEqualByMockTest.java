package com.wyy.mytest.utils;

import android.content.Context;

import com.wyy.mytest.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StringEqualByMockTest {
    @Mock
    Context mMockContext;

    private static final String MATCHER = "My";

    @Test
    public void resourceStringByMockCompare() {
        when(mMockContext.getString(R.string.app_name)).thenReturn(MATCHER);
        assertThat(mMockContext.getString(R.string.app_name)).startsWith(MATCHER);
    }
}
