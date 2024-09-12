// package AdventureWeapon;

public class Weapon{
    public String name;
    public int damage;

    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setName(String name){
        this.name = name;
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