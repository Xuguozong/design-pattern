package com.design.pattern.construct.adapterbridge;

import static java.lang.System.out;

public class DatabaseCollector implements DataCollector {
    @Override
    public void collect() {
        out.println("collect sql data");
    }
}
