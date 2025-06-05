package HomeWork4.Bridge.shape;

import HomeWork4.Bridge.color.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Квадрат окрашен в " + color.applyColor() + " цвет";
    }
}
