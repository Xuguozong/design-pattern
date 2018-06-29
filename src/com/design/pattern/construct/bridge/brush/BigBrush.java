package com.design.pattern.construct.bridge.brush;

import static java.lang.System.out;

public class BigBrush extends Brush {
    @Override
    void draw() {
        // 画前准备
        out.println("big brush");
        color.print();
    }
}
