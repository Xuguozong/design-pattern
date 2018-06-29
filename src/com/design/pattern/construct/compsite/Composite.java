package com.design.pattern.construct.compsite;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Description: 容器构件，
 * Created by xuguozong on 2018/6/28.
 */
public class Composite extends Component {
    private List<Component> list = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    void add(Component component) {
        list.add(component);
    }

    @Override
    void remove(Component component) {
        list.remove(component);
    }

    @Override
    Component getChild(int i) {
        return list.get(i);
    }

    @Override
    void operate() {
        //
        out.println(name+" composite operate");
        list.forEach(Component::operate);
    }
}
