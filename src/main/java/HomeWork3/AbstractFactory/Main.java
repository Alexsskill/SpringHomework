package HomeWork3.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        InteriorDesigner designer = new InteriorDesigner(factory);
        designer.designRoom();
    }
}