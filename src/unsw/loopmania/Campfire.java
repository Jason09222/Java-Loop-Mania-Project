package unsw.loopmania;

import javafx.beans.property.SimpleIntegerProperty;

public class Campfire extends Building {
    private final int campRadius = 5; // TODO; the value may change later;

    public Campfire(SimpleIntegerProperty x, SimpleIntegerProperty y) {
        super(x, y);

    }

    public int getcampRadius() {
        return this.campRadius;
    }
    
    public boolean checkPathType() {
        // Get the Pathtype at (x, y)
        // If it is non-pathtiles and no other buildings exsits on it
        // place the village
        return true;
    } 

    public void doubleDamage(BasicEnemy stepOn) {
        // TODO: get the character's damage and double it
        // deduct corresponding points from the enemy
    }


}
