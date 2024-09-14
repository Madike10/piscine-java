import java.util.List;
import java.util.ArrayList;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private Weapon weapon;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth, Weapon weapon) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
        this.weapon = weapon;
        allCharacters.add(this);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public boolean isDead() {
        return currentHealth <= 0;
    }

    @Override
    public String toString() {
        String s = "";
        if (currentHealth == 0) {
            s = String.format("%s : KO ", name);
        } else {
            s = String.format("%s : %d/%d", name, currentHealth, maxHealth);
        }
        if (this.weapon != null) {
            s += String.format(" He has the weapon %s.", weapon.toString());
        }
        return s;
    }

    public abstract void takeDamage(int i) throws DeadCharacterException;

    public abstract void attack(Character c) throws DeadCharacterException;

    public static String printStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------\n");

        if (allCharacters.isEmpty()) {
            sb.append("Nobody's fighting right now !\n");
        } else {
            sb.append("Characters currently fighting :\n");
            for (Character character : allCharacters) {
                sb.append(" - ").append(character.toString()).append("\n");
            }
        }

        sb.append("------------------------------------------\n");
        return sb.toString();
    }

    public static Character fight(Character c1, Character c2) {
        while (c1.getCurrentHealth() > 0 && c2.getCurrentHealth() > 0) {
            try {
                c1.attack(c2);
                if (c2.getCurrentHealth() > 0) {
                    c2.attack(c1);
                }
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        // Remove dead characters from the list
        allCharacters.removeIf(Character::isDead);
        return c1.getCurrentHealth() > 0 ? c1 : c2;
    }
}
