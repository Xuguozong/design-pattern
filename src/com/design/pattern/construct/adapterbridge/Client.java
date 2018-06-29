package com.design.pattern.construct.adapterbridge;

public class Client {
    public static void main(String[] args){
        DailyReport report = new DailyReport();
        report.setCollector(new ExcelCollectorAdapter());
        report.report();
    }
}
