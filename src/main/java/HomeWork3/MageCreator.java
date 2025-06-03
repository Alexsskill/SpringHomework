package HomeWork3;

public class MageCreator extends CharacterCreator {
    @Override
    protected Character createCharacter() {
        return new Mage();
    }
}
