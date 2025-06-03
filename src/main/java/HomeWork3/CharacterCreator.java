package HomeWork3;

public abstract class CharacterCreator {

    protected abstract Character createCharacter();

    public void spawnCharacter() {
        Character character = createCharacter();
        character.attack();
    }
}
