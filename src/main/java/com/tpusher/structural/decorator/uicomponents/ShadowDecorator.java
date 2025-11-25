package com.tpusher.structural.decorator.uicomponents;

public class ShadowDecorator extends IUIDecorator {

    public ShadowDecorator(IUIComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing Shadow");
    }
}
