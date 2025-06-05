package HomeWork4.Bridge;

import HomeWork4.Bridge.color.BlueColor;
import HomeWork4.Bridge.color.RedColor;
import HomeWork4.Bridge.shape.Circle;
import HomeWork4.Bridge.shape.Shape;
import HomeWork4.Bridge.shape.Square;

public class Client {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        System.out.println(redCircle.draw());

        Shape blueSquare = new Square(new BlueColor());
        System.out.println(blueSquare.draw());
    }
}