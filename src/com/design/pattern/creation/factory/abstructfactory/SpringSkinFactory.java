package com.design.pattern.creation.factory.abstructfactory;

public class SpringSkinFactory extends SkinFactory {
    @Override
    Button createButton() {
        return new SpringButton();
    }

    @Override
    TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
