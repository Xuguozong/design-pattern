package com.design.pattern.construct.compsite;

import static java.lang.System.out;

public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void add(Component component) {
        // 声明异常
    }

    @Override
    void remove(Component component) {
        // 声明异常
    }

    @Override
    Component getChild(int i) {
        return null;
    }

    @Override
    void operate() {
        out.println(name+" leaf operate");
    }
}
