package com.design.pattern.construct.adapterbridge;

import static java.lang.System.out;

public class TextCollector implements DataCollector {
    @Override
    public void collect() {
        out.println("collect text file data");
    }
}
