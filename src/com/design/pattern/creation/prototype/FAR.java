package com.design.pattern.creation.prototype;

import static java.lang.System.out;

public class FAR implements OfficeDocument {
    @Override
    public OfficeDocument clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficeDocument)obj;
    }

    @Override
    public void display() {
        out.println("《可行性分析报告》");
    }
}
