package com.tpusher.structural.decorator.uicomponents;

public class BorderDecorator extends IUIDecorator {

    public BorderDecorator(IUIComponent uiComponent) {
        super(uiComponent);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Adding border.");
    }
}
