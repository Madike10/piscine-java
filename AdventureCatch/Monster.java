package AdventureCatch;

public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);

    }
    @Override
    public void attack(Character character) throws DeadCharacterException{
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if(getWeapon() == null ) {
            character.takeDamage(10);
        }else {
            character.takeDamage(getWeapon().getDamage());
        }
    }

    
    public void takeDamage(int damage) throws DeadCharacterException{
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int effectiveDamage = Math.max(0, (int)(damage * 0.8));
        setCurrentHealth(Math.max(0, getCurrentHealth() - effectiveDamage));
    }

    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return String.format(("%s is a monster with %d HP. He has the weapon %s"), this.getName(), this.getCurrentHealth(), getWeapon().toString());
        }
        return String.format(("%s is a monster and is dead. He has the weapon %s"), this.getName(), getWeapon().toString());
    }

}