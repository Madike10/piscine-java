public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public int getShield() {
        return shield;
    }

    @Override
    public void heal(Character c) throws DeadCharacterException {
        if (isDead()) {
            throw new DeadCharacterException(this);
        }
        if (c.isDead()) {
            throw new DeadCharacterException(c);
        }
        int newHealth = c.getCurrentHealth() + healCapacity;
        if (newHealth > c.getMaxHealth()) {
            newHealth = c.getMaxHealth();
        }
        c.setCurrentHealth(newHealth);
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        if (isDead()) {
            throw new DeadCharacterException(this);
        }
        heal(this); // If you want to heal this character before attacking, ensure it's intended behavior.
        if (c.isDead()) {
            throw new DeadCharacterException(c);
        }
        if (getWeapon() != null) {
            c.takeDamage(getWeapon().getDamage());
        } else {
            c.takeDamage(6);
        }
    }

    @Override
    public void takeDamage(int i) throws DeadCharacterException {
        if (isDead()) {
            throw new DeadCharacterException(this);
        }
        int toTake = i - shield;
        if (toTake <= 0) {
            return; // Shield absorbs all damage
        }
        if (getCurrentHealth() - toTake <= 0) {
            setCurrentHealth(0);
        } else {
            setCurrentHealth(getCurrentHealth() - toTake);
        }
    }

    @Override
    public String toString() {
        String s;
        if (isDead()) {
            s = String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                    getName(), getShield(), getHealCapacity());
        } else {
            s = String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                    getName(), getCurrentHealth(), getHealCapacity(), getShield());
        }
        if (getWeapon() != null) {
            s += String.format(" He has the weapon %s.", getWeapon().toString());
        }
        return s;
    }
}
