package com.design.pattern.creation.builder;

public abstract class Builder {
    // 创建产品对象
    Product product = new Product();

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    // 返回产品对象
    public Product getProduct(){
        return product;
    }
}
