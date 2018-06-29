package com.design.pattern.construct.decorator.sunny;

import static java.lang.System.out;

// 黑边框装饰类：具体装饰类
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void dispaly() {
        this.setBlackBorder();
        super.dispaly();
    }

    private void setBlackBorder() {
        out.println("add black border!");
    }
}
