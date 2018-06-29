package com.design.pattern.construct.compsite;

public class Run {
    public static void main(String[] args){
        Composite c1 = new Composite("fa");
        Composite c2 = new Composite("son1");
        Composite c3 = new Composite("son2");
        c1.add(c2);
        c1.add(c3);
        c2.add(new Leaf("leaf1"));
        c2.add(new Leaf("leaf2"));
        c1.operate();
    }
}
