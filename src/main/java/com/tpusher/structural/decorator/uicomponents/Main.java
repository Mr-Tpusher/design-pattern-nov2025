package com.tpusher.structural.decorator.uicomponents;

public class Main {
    public static void main(String[] args) {
        IUIComponent textBox = new TextBox();
        textBox.draw();

        IUIComponent borderDecorator = new BorderDecorator(textBox);
        borderDecorator.draw();

        System.out.println("--------------------------------------");

        IUIComponent dropdown = new Dropdown();
        IUIComponent dropDownWithShadow = new ShadowDecorator(dropdown);
        dropDownWithShadow.draw();
    }
}
