package com.design.pattern.construct.bridge.brush;

import static java.lang.System.out;

public class MidBrush extends Brush {
    @Override
    void draw() {
        // 画前准备
        out.println("mid brush");
        color.print();
    }
}
