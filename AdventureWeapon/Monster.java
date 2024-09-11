// package AdventureWeapon;

public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);

    }
    @Override
    public void attack(Character character){
        if(weapon == null ) {
            character.takeDamage(10);
        }else {
            character.takeDamage(weapon.getDamage());
        }
    }

    
    public void takeDamage(int damage){
        int effectiveDamage = Math.max(0, (int)(damage * 0.8));
        setCurrentHealth(Math.max(0, getCurrentHealth() - effectiveDamage));
    }

    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return String.format(("%s is a monster with %d HP. He has the weapon %s"), this.getName(), this.getCurrentHealth(), weapon.toString());
        }
        return String.format(("%s is a monster and is dead. He has the weapon %s"), this.getName(), weapon.toString());
    }

}