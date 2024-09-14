// package AdventureCatch;

public class Templar extends Character implements Tank, Healer {

    // Attributs non modifiables
    private final int healCapacity;
    private final int shield;

    // Constructeur
    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    // Implémentation de la méthode getHealCapacity de l'interface Healer
    @Override
    public int getHealCapacity() {
        return healCapacity;
    }



    // Implémentation de la méthode getShield de l'interface Tank
    @Override
    public int getShield() {
        return shield;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity + " HP.";
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP and has a shield of " + shield + "." + " He has the weapon " + getWeapon().toString();
    }
    @Override
    public void attack(Character character) throws DeadCharacterException {
        heal(this);
        character.takeDamage(6);
        if (character.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        int effectiveDamage = Math.max(0, damage - shield);
        setCurrentHealth(Math.max(0, getCurrentHealth() - effectiveDamage));
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
    }

    @Override
    public void heal(Character character) throws DeadCharacterException {
        int newHealth = character.getCurrentHealth() + healCapacity;
        character.setCurrentHealth(Math.min(newHealth, character.getMaxHealth()));
        if (character.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
    }

}
