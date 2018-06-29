package com.design.pattern.creation.singleton;

/**
 * 使用静态内部类的方式实现单例模式
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    private static class SingletonHolder{
        public static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstence(Object object){
        return SingletonHolder.instance;
    }
}
