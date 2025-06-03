package HomeWork3.AbstractFactory;

public class InteriorDesigner {
    private Chair chair;
    private Table table;

    public InteriorDesigner(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.table = factory.createTable();
    }

    public void designRoom() {
        chair.sitOn();
        table.placeItem();
    }
}
