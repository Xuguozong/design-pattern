package com.design.pattern.creation.singleton;


/**
 * 简单单例模式
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
