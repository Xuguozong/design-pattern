package com.design.pattern.construct.bridge.brush;

public class Client {
    public static void main(String[] args){
        BigBrush bigBrush = new BigBrush();
        bigBrush.setColor(new RedColor());
        bigBrush.draw();

        SmallBrush smallBrush = new SmallBrush();
        smallBrush.setColor(new BlackColor());
        smallBrush.draw();
    }
}
