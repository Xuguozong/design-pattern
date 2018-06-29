package com.design.pattern.creation.factory.factorymethod;

import static java.lang.System.out;

public class DataBaseLogger implements Logger {
    @Override
    public void writeLog() {
        out.println("database logger");
    }
}
