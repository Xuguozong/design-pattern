package com.design.pattern.construct.decorator.general;

import static java.lang.System.out;

// 具体类
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        out.println("concrete component operates");
    }
}
