package com.design.pattern.construct.decorator.sunny;

import static java.lang.System.out;
// 滚动条装饰类：具体装饰类
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void dispaly() {
        this.setScrollBar();
        super.dispaly();
    }

    private void setScrollBar() {
        out.println("add scrollbar!");
    }
}
