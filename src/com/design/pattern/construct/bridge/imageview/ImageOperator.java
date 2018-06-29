package com.design.pattern.construct.bridge.imageview;
// 图像处理接口（根据操作系统划分）
public interface ImageOperator {
    void doPaint(Matrix matrix);
}
