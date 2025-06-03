package HomeWork3.FactoryMethod;

public class MageCreator extends CharacterCreator {
    @Override
    protected Character createCharacter() {
        return new Mage();
    }
}
