package com.design.pattern.creation.singleton;

/**
 * 饿汉单例,无需考虑多线程环境下的安全问题
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
