package com.design.pattern.creation.factory.simplefactory;

/**
 * 简单工厂模式，工厂负责所有类的创建工作
 */
public class ChartFactoy {
    public static Chart getChart(String name){
        if (name.equalsIgnoreCase("pie")){
            return new PieChart();
        }if (name.equalsIgnoreCase("histo")){
            return new HostogramChart();
        }else {
            return null;
        }
    }

}
