package com.design.pattern.construct.bridge.imageview;
// 抽象图像类
public abstract class Image {
    protected ImageOperator operator;

    public void setOperator(ImageOperator operator) {
        this.operator = operator;
    }

    public Image(ImageOperator operator) {
        this.operator = operator;
    }

    public Image() {}


    abstract void parseFile(String fileName);
}
