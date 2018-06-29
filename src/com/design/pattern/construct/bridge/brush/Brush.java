package com.design.pattern.construct.bridge.brush;
// 抽象部分,对应笔刷型号
public abstract  class Brush {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void draw();
}
