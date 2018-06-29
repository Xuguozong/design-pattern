package com.design.pattern.creation.factory.abstructfactory;

import static java.lang.System.out;

public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        out.println("spring combobox");
    }
}
