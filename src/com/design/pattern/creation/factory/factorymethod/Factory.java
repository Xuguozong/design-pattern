package com.design.pattern.creation.factory.factorymethod;

/**
 * 工厂方法模式,每个产品类对应一个具体工厂类
 */
public abstract class Factory {
    public abstract Logger createLogger();
}
