package com.design.pattern.creation.factory.simplefactory;

public class Test {
    public static void main(String[] args){
        Chart pie = ChartFactoy.getChart("pie");
        pie.dispaly();
    }
}
