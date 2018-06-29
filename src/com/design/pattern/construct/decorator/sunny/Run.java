package com.design.pattern.construct.decorator.sunny;

public class Run {
    public static void main(String[] args){
        Component window = new Window();
        Component sb = new ScrollBarDecorator(window);
        Component bl = new BlackBorderDecorator(sb);
        //sb.dispaly();
        bl.dispaly();
    }
}
