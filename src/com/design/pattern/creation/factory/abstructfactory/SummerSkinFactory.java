package com.design.pattern.creation.factory.abstructfactory;

public class SummerSkinFactory extends SkinFactory {
    @Override
    Button createButton() {
        return new SummerButtom();
    }

    @Override
    TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
