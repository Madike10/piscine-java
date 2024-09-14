public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public void takeDamage(int i) throws DeadCharacterException {
        if (isDead()) {
            throw new DeadCharacterException(this);
        }
        int damageToTake = (int) Math.floor(i * 0.8);
        if (getCurrentHealth() - damageToTake <= 0) {
            setCurrentHealth(0);
        } else {
            setCurrentHealth(getCurrentHealth() - damageToTake);
        }
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        if (isDead()) {
            throw new DeadCharacterException(this);
        }
        if (c.isDead()) {
            throw new DeadCharacterException(c);
        }
        if (getWeapon() != null) {
            c.takeDamage(getWeapon().getDamage());
        } else {
            c.takeDamage(7);
        }
    }

    @Override
    public String toString() {
        String s;
        if (getCurrentHealth() > 0) {
            s = String.format("%s is a monster with %d HP", getName(), getCurrentHealth());
        } else {
            s = String.format("%s is a monster and is dead", getName());
        }
        if (getWeapon() != null) {
            s += String.format(" He has the weapon %s.", getWeapon().toString());
        }
        return s;
    }
}
