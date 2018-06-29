package com.design.pattern.creation.factory.abstructfactory;

import static java.lang.System.out;

public class SpringButton implements Button {
    @Override
    public void display() {
        out.println("spring button");
    }
}
