package com.design.pattern.construct.bridge.imageview;

import static java.lang.System.out;

public class WindowsOperator implements ImageOperator {
    @Override
    public void doPaint(Matrix matrix) {
        out.println("windows");
    }
}
