package com.wyy.mytest;

import com.wyy.mytest.entity.Book;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestMockitoSimple {
    @Mock
    Book mBook;

    @Rule
    public MockitoRule mMockitoRule = MockitoJUnit.rule();

    @Test
    public void TestUserIsNull() {
        assertNotNull(mBook);
    }

    @Test
    public void TestMockitoThenReturn(){
        when(mBook.getName()).thenReturn("Thinking in C");
        System.out.println(mBook.getName());
    }

}
