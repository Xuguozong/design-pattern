package com.design.pattern.construct.decorator.general;

// 装饰类，具体装饰类的父类
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
