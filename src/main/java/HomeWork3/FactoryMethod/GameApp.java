package HomeWork3.FactoryMethod;

public class GameApp {
    public static void main(String[] args) {
        CharacterCreator creator;

        creator = new WarriorCreator();
        creator.spawnCharacter();

        creator = new MageCreator();
        creator.spawnCharacter();

        creator = new ArcherCreator();
        creator.spawnCharacter();
    }
}
