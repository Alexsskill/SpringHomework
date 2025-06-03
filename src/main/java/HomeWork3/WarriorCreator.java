package HomeWork3;

public class WarriorCreator extends CharacterCreator {
    @Override
    protected Character createCharacter() {
        return new Warrior();
    }
}
