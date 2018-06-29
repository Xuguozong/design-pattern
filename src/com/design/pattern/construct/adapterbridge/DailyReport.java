package com.design.pattern.construct.adapterbridge;

import static java.lang.System.out;

public class DailyReport extends Report {
    @Override
    void report() {
        collector.collect();
        out.println("daily report");
    }
}
