package com.design.pattern.construct.bridge.imageview;

import static java.lang.System.out;

public class GifImage extends Image {
    @Override
    void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        operator.doPaint(matrix);
        out.println(fileName+",格式为GIF");
    }
}
