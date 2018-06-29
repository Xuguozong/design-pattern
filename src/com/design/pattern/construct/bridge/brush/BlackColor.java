package com.design.pattern.construct.bridge.brush;

import static java.lang.System.out;

public class BlackColor implements Color {
    @Override
    public void print() {
        out.println("black");
    }
}
