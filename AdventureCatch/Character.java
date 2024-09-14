package AdventureCatch;

import java.util.List;

import java.util.ArrayList;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private Weapon weapon;


    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public  String getName() {
        return name;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    protected void setCurrentHealth(int health) {
        this.currentHealth = health;
    }

    // Constructor

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
        this.weapon = weapon;

    }

    @Override

    public String toString() {
        if (currentHealth == 0) {
            return String.format(("%s : KO"), name);
        }

        return String.format(("%s : %d/%d"), name, currentHealth, maxHealth);
    }

    public abstract void takeDamage(int numb) throws DeadCharacterException;
    // {
    //     currentHealth = Math.max(0, currentHealth - numb);
    // }

    public abstract void attack(Character character) throws DeadCharacterException;
    // {
    //     character.takeDamage(9);
    // }

    public static String printStatus() {
        if (allCharacters.isEmpty() || allCharacters == null) {
            return "------------------------------------------\n" +
                    "Nobody's fighting right now !\n" +
                    "------------------------------------------\n";
        }
        StringBuilder status = new StringBuilder("------------------------------------------\n" +
                "Characters currently fighting :\n");
        for (Character character : allCharacters) {
            status.append(" - ").append(character.toString()).append("\n");
        }
        status.append("------------------------------------------\n");
        return status.toString();
    }

    public static Character fight(Character char1, Character char2) {
        while (true) {
            try {
                char1.attack(char2);
                if (char2.getCurrentHealth() <= 0) {
                    return char1;
                }
                
                char2.attack(char1);
                if (char1.getCurrentHealth() <= 0) {
                    return char2;
                }
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
                return null; // or handle the exception as needed
            }
        }
    }
}