package unsw.loopmania;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.File;

import javax.swing.Action;

import javafx.event.ActionEvent;

public class HeroCastleMenuController {

    private MenuSwitcher gameSwitcher;
    private LoopManiaWorld world;
    private LoopManiaWorldController controller;

    @FXML
    private GridPane inventory;

    public HeroCastleMenuController(LoopManiaWorld world, LoopManiaWorldController controller) {
        this.world = world;
        this.controller = controller;
        //Image swordImage = new Image((new File("src/images/basic_sword.png")).toURI().toString());
        
    }

    public void setGameSwitcher(MenuSwitcher gameSwitcher) {
        this.gameSwitcher = gameSwitcher;
    }
    
    @FXML
    private void switchToGame(){
        gameSwitcher.switchMenu();
    }
 
    @FXML
    private StackPane paneToSell;

    @FXML
    private Label gold;

    @FXML
    private Button exitButton;

    @FXML
    private Label swordPrice;

    @FXML
    private Button purchaseSword;

    @FXML
    private Label staffPrice;

    @FXML
    private Button purchaseStaff;

    @FXML
    private Label stakePrice;

    @FXML
    private Button purchaseStake;

    @FXML
    private Label armourPrice;

    @FXML
    private Button purchaseArmour;

    @FXML
    private Label helmetPrice;

    @FXML
    private Button purchaseHelmet;

    @FXML
    private Button purchaseShield;

    @FXML
    private Label potionPrice;

    @FXML
    private Button purchasePotion;

    @FXML
    private Button sell;

    @FXML
    void updateInventory(ActionEvent event) {
        initialiseInventory();
        for(ItemProperty item: world.getUnequippedInventoryItems()) {
            ImageView view = item.onLoadItems();
            inventory.getChildren().add(view);
            view.setOnMouseClicked(e->selected(item));
        }
    }

    //@FXML
    void selected(ItemProperty item) {
        initialisePane();
        ImageView view = item.onLoadItems();
        view.setFitHeight(100);
        view.setFitWidth(100);
        paneToSell.getChildren().add(view);
        Label label = new Label(item.getType().name());
        paneToSell.getChildren().add(label);
        StackPane.setAlignment(label, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(view, Pos.TOP_CENTER);
    }

    public void initialiseInventory() {
        if (inventory.getChildren().size() >= 0) {
            for (Node n : inventory.getChildren()) {
                inventory.getChildren().remove(n);
            }
        }
    }

    @FXML
    void handleExitButton(ActionEvent event) {
        switchToGame();
    }

    public void updateInventory() {
        this.inventory = controller.getUnequippedInventory();
    }

    private void buyItem(ItemType itemType) {
        world.addGold(-1 * world.getItemPrice(itemType));
        if (itemType == ItemType.HEALTHPOTION) {
            world.addPotion(1);

        }
        else {
            ItemProperty item = world.addUnequippedItem(itemType);
            controller.onLoad(item);
        }

    }

    @FXML
    void handlePurchaseArmour(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.ARMOUR)) {
            buyItem(ItemType.ARMOUR);
        }
        
    }

    @FXML
    void handlePurchaseHelmet(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.HELMET)) {
            buyItem(ItemType.HELMET);
        }
        
    }

    @FXML
    void handlePurchasePotion(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.HEALTHPOTION)) {
            buyItem(ItemType.HEALTHPOTION);
        }
        
    }

    @FXML
    void handlePurchaseShield(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.SHIELD)) {
            buyItem(ItemType.SHIELD);
        }
        
    }

    @FXML
    void handlePurchaseStaff(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.STAFF)) {
            buyItem(ItemType.STAFF);
        }
        
    }

    @FXML
    void handlePurchaseStake(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.STAKE)) {
            buyItem(ItemType.STAKE);
        }
        
    }

    @FXML
    void handlePurchaseSword(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.SWORD)) {
            buyItem(ItemType.SWORD);

        }
        
    }


    @FXML
    public void initialise() {
        gold.textProperty().bind(world.getGold().asString());
    }

    @FXML
    public void sellItem(ActionEvent event) {
        if (paneToSell.getChildren().size() == 0) return;
        String text = "";
        for (Node each: paneToSell.getChildren()) {
            if (each instanceof Label) {
                Label label = (Label)each;
                text = label.getText();
            }
        }

        removeItem(text);
    }

    public void initialisePane() {
        if (paneToSell.getChildren().size() > 0) {
            for (Node each: paneToSell.getChildren()) {
                paneToSell.getChildren().remove(each);
            }
         }
    }

    public void removeItem(String text) {
        /*for (ItemProperty item: world.getUnequippedInventoryItems()) {
            switch(text) {

            }
        }
        world.getUnequippedInventoryItems().remove(item);*/
        return;
    }


}
