package HomeWork3.FactoryMethod;

public class ArcherCreator extends CharacterCreator {
    @Override
    protected Character createCharacter() {
        return new Archer();
    }
}
