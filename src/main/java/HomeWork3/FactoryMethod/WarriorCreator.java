package HomeWork3.FactoryMethod;

public class WarriorCreator extends CharacterCreator {
    @Override
    protected Character createCharacter() {
        return new Warrior();
    }
}
