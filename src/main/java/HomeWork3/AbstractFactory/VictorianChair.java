package HomeWork3.AbstractFactory;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Вы сидите на классическом стуле.");
    }
}