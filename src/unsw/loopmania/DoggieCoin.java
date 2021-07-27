package unsw.loopmania;

import java.util.List;

import javafx.beans.property.SimpleIntegerProperty;

public class DoggieCoin extends ItemProperty{
    private int price;
    public DoggieCoin(SimpleIntegerProperty x, SimpleIntegerProperty y, ItemType type) {
        super(x, y, type);
        price = 200;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void useDuringBattle(EnemyProperty e, Character c) {
        return;
        
    }

    @Override
    public void characterStepOn(LoopManiaWorld l, List<ItemProperty> toRemoveGold,
            List<ItemProperty> toRemoveHealthPotion) {
        return;
        
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return price;
    }

    public void setPrice(int value) {
        this.price = value;
    }
    
}
