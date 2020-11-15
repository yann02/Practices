package com.wyy.mytest.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class JavaDateUtilTest {
    private long time;
    private static final String EXPECTED_TRUE = "5882-03-11 08:32:03";

    public JavaDateUtilTest(long time) {
        this.time = time;
    }

    @Parameterized.Parameters
    public static Collection<Long> primeNumbers(){
        return Arrays.asList(125456789123456L,123456789123457L,123456789123458L);
    }

    @Test
    public void stampToDate(){
        assertEquals(EXPECTED_TRUE, new DateUtil().stampToDate(time));
    }
}
