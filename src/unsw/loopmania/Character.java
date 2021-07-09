package unsw.loopmania;
import java.util.ArrayList;
import java.util.List;

/**
 * represents the main character in the backend of the game world
 */
public class Character extends MovingEntity {
    // TODO = potentially implement relationships between this class and other classes
    private String name;
    private int hp;
    private int damage;
    private List<StaticEntity> inventory;

    public Character(String name, int hp, int damage, PathPosition position) {
        super(position);
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.inventory = new ArrayList<StaticEntity>();
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public List<StaticEntity> getInventory() {
        return this.inventory;
    }

    public void addItemToInventory(StaticEntity item) {
        this.inventory.add(item);
    }
}
