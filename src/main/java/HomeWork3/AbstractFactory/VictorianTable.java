package HomeWork3.AbstractFactory;

public class VictorianTable implements Table {
    @Override
    public void placeItem() {
        System.out.println("Вы положили предмет на классический стол.");
    }
}