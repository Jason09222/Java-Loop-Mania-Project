package unsw.loopmania;

import javafx.beans.property.SimpleIntegerProperty;

/**
 * represents an equipped or unequipped Armour in the backend world
 */
public class Armour extends BasicItem {
    private int defense;
    private final int price = 1000;
    // TODO = add more weapon/item types
    public Armour(SimpleIntegerProperty x, SimpleIntegerProperty y, BasicEnemy enemy) {
        super(x, y, "Armour");
        defense = enemy.getDamage()/2;
    }
    public int getDefense() {
        return this.defense;
    }
    public int getPrice() {
        return this.price;
    }
    
}