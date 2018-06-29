package com.design.pattern.construct.bridge.imageview;

public class Client {
    public static void main(String[] args){
        GifImage image = new GifImage();
        image.setOperator(new LinuxOperator());
        image.parseFile("1.GIF");
    }
}
