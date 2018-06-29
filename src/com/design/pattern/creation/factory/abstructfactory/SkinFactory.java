package com.design.pattern.creation.factory.abstructfactory;

/**
 * 抽象工厂模式，一群具有某个特征的类对应一个具体工厂类
 */
public abstract class SkinFactory {
    abstract Button createButton();
    abstract TextField createTextField();
    abstract ComboBox createComboBox();
}
