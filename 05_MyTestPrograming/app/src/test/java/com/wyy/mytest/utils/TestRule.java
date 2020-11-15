package com.wyy.mytest.utils;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TestRule implements org.junit.rules.TestRule {
    @Override
    public Statement apply(Statement base, Description description) {
        return null;
    }
}
