package AdventureAbstract;

public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public void heal(Character character) {
        // Ensure currentHealth does not exceed maxHealth
        int newHealth = character.getCurrentHealth() + healCapacity;
        character.setCurrentHealth(Math.min(newHealth, character.getMaxHealth()));
    }

    @Override
    public void attack(Character character) {
        heal(this);
        character.takeDamage(10);
    }

    @Override
    public void takeDamage(int numb) {
        setCurrentHealth(Math.max(0, getCurrentHealth() - numb));
    }

    @Override

    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return String.format(("%s is a dead sorcerer. So bad, it could heal %d HP."), this.getName(), healCapacity);
        }
        return String.format(("%s is a sorcerer with %d HP. It can heal %d HP."), this.getName(),
                this.getCurrentHealth(), healCapacity);
    }

}