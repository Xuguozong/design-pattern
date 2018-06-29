package com.design.pattern.construct.adapterbridge;

import static java.lang.System.out;

public class WeeklyReport extends Report {
    @Override
    void report() {
        collector.collect();
        out.println("weekly report");
    }
}
