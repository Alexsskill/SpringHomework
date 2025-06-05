package HomeWork4.Bridge.shape;

import HomeWork4.Bridge.color.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Круг окрашен в " + color.applyColor() + " цвет";
    }
}