package com.design.pattern.construct.compsite;

/**
 * Description: 抽象构件，为叶子构件和容器构件提供接口声明
 * Created by xuguozong on 2018/6/28.
 */
public abstract class Component {
    abstract void add(Component component);
    abstract void remove(Component component);
    abstract Component getChild(int i);
    abstract void operate();
}
