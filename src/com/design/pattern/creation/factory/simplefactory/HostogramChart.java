package com.design.pattern.creation.factory.simplefactory;

import static java.lang.System.out;

public class HostogramChart implements Chart {

    public HostogramChart(){
        out.println("histogramchart init!");
    }

    @Override
    public void dispaly() {
        out.println("histogram display!");
    }
}
