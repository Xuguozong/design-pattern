package com.design.pattern.construct.bridge.brush;

import static java.lang.System.out;

public class SmallBrush extends Brush {
    @Override
    void draw() {
        // 画前准备
        out.println("small brush");
        color.print();
    }
}
