package com.design.pattern.creation.factory.simplefactory;

import static java.lang.System.out;

public class PieChart implements Chart {
    public PieChart(){
        out.println("PieChart init!");
    }

    @Override
    public void dispaly() {
        out.println("PieChart display!");
    }
}
