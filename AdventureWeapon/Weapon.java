// package AdventureWeapon;

public class Weapon{
    private final String name;
    private final int damage;

    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
    @Override
    public String toString(){
        return name + " deals " + damage + " damages";
    }
}