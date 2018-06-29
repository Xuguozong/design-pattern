package com.design.pattern.creation.prototype;

public interface OfficeDocument extends Cloneable {
    OfficeDocument clone();
    void display();
}
