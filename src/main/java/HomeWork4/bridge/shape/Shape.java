package HomeWork4.Bridge.shape;

import HomeWork4.Bridge.color.Color;

public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
