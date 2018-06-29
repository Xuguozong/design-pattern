package com.design.pattern.construct.decorator.sunny;

import static java.lang.System.out;

// 窗体类：具体构建类
public class Window extends Component {
    @Override
    public void dispaly() {
        out.println("display window!");
    }
}
