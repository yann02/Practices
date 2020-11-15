package com.wyy.mytest.utils;

import com.wyy.mytest.entity.User;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestKotlinDataEntity {
    private User mUser;
    @Test
    public void TestUserIsNull() {
        assertNotNull(mUser);
    }
}
