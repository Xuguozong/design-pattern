package com.design.pattern.construct.adapterbridge;

public abstract class Report {
    protected DataCollector collector;

    public void setCollector(DataCollector collector) {
        this.collector = collector;
    }

    abstract void report();
}
