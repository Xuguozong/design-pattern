package com.design.pattern.creation.factory.abstructfactory;

import static java.lang.System.out;

public class SummerTextField implements TextField {
    @Override
    public void display() {
        out.println("summer textfield");
    }
}
