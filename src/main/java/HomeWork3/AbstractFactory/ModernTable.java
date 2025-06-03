package HomeWork3.AbstractFactory;

public class ModernTable implements Table {
    @Override
    public void placeItem() {
        System.out.println("Вы положили предмет на современный стол.");
    }
}