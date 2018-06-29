package com.design.pattern.construct.decorator.general;

import static java.lang.System.out;

// 具体装饰类
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        // 添加装饰类的装饰方法
        addMethodA();
    }

    private void addMethodA() {
        out.println("execute a ");
    }
}
