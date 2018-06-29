package com.design.pattern.construct.decorator.sunny;

import static java.lang.System.out;

// 列表框类：具体构建类
public class List extends Component {
    @Override
    public void dispaly() {
        out.println("display lsit!");
    }
}
