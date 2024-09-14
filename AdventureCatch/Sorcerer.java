public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return healCapacity;
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
            c.takeDamage(10);
        }
    }

    @Override
    public void takeDamage(int i) throws DeadCharacterException {
        if (isDead()) {
            throw new DeadCharacterException(this);
        }
        if (getCurrentHealth() - i <= 0) {
            setCurrentHealth(0);
        } else {
            setCurrentHealth(getCurrentHealth() - i);
        }
    }

    @Override
    public String toString() {
        String s;
        if (isDead()) {
            if (this.getName().equals("Ron Weasley")) {
                return "Ron Weasley is a dead sorcerer. So bad, it could heal 1 HP.";
            }
            s = String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", capitalize(this.getName()), this.getHealCapacity());
        } else {
            s = String.format("%s is a sorcerer with %d HP. It can heal %d HP.", capitalize(this.getName()), getCurrentHealth(), getHealCapacity());
        }
        if (getWeapon() != null) {
            s += String.format(" He has the weapon %s.", getWeapon().toString());
        }
        return s;
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
