package com.design.pattern.construct.decorator.general;

import static java.lang.System.out;

// 具体装饰类
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        // 添加装饰类的装饰方法
        addMethodB();
    }

    private void addMethodB() {
        out.println("execute b ");
    }
}
