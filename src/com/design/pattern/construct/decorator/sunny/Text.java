package com.design.pattern.construct.decorator.sunny;

import static java.lang.System.out;

// 文本框类：具体构建类
public class Text extends Component {
    @Override
    public void dispaly() {
        out.println("display text!");
    }
}
