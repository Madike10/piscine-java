package AdventureCharacter;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    // Getter

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    // Constructor

    public Character(String newName, int newMaxHealth) {
        name = newName;
        maxHealth = newMaxHealth;
        currentHealth = maxHealth;
    }

    @Override

    public String toString() {
        if (currentHealth == 0) 
        {
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
}