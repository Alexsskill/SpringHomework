package HomeWork3;

public class ArcherCreator extends CharacterCreator {
    @Override
    protected Character createCharacter() {
        return new Archer();
    }
}
