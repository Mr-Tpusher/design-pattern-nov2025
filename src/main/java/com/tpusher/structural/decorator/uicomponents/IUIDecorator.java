package com.tpusher.structural.decorator.uicomponents;

public abstract class IUIDecorator implements IUIComponent {
    private IUIComponent uiComponent;

    public IUIDecorator(IUIComponent uiComponent) {
        this.uiComponent = uiComponent;
    }

    // delegate the method call
    @Override
    public void draw() {
        uiComponent.draw();
    }
}
