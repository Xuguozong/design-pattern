package com.design.pattern.construct.adapterbridge;

import static java.lang.System.out;

public class ExcelCollectorAdapter implements DataCollector {

    private ExcelAPI excelAPI;

    public ExcelCollectorAdapter() {
        excelAPI = new ExcelAPI();
    }

    @Override
    public void collect() {
        excelAPI.api();
        out.println("collect excel data");
    }
}
