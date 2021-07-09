package unsw.loopmania;

import javafx.beans.property.SimpleIntegerProperty;

public class Tower extends Building {
    private final int shootRadius = 5; // TODO: this value may be changed later

    public Tower(SimpleIntegerProperty x, SimpleIntegerProperty y) {
        super(x, y);
    }

    public boolean checkPathType() {
        // Get the Pathtype at (x, y)
        // If it is non-pathtiles and no other buildings exsits on it
        // place the village
        return true;
    } 

    public void addEnemyNearBy() {
        // loop through all enemies
        // calculate the distance between tower and enemy
        // if it is in radius
        // add to the list
        return;
    }

    public boolean checkBattle() { 
        // loop through the enemies in the list stepOns
        // if it id in battle
        // decuct hp
        return true;
    }

    public int getShootRadius() {
        return this.shootRadius;
    }
}
