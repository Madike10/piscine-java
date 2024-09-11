// package AdventureTemplar;

import java.util.List;

import java.util.ArrayList;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();


    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }
    protected void setCurrentHealth(int health) {
        this.currentHealth = health;
    }

    // Constructor

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);

    }

    @Override

    public String toString() {
        if (currentHealth == 0) {
            return String.format(("%s : KO"), name);
        }

        return String.format(("%s : %d/%d"), name, currentHealth, maxHealth);
    }

    public void takeDamage(int numb) {
        currentHealth = Math.max(0, currentHealth - numb);
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }

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
        while (char1.getCurrentHealth() > 0 && char2.getCurrentHealth() > 0) {
            char1.attack(char2); // Example attack damage
            if (char2.getCurrentHealth() == 0) {
                return char1; // char1 wins
            }
            char2.attack(char1); // Example attack damage
        }
        return char2; // char2 wins
    }
}