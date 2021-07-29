package unsw.loopmania;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class HeroCastleMenuController {

    private MenuSwitcher gameSwitcher;
    private LoopManiaWorld world;
    private LoopManiaWorldController controller;

    public HeroCastleMenuController(LoopManiaWorld world, LoopManiaWorldController controller) {
        this.world = world;
        this.controller = controller;
    }

    public void setGameSwitcher(MenuSwitcher gameSwitcher) {
        this.gameSwitcher = gameSwitcher;
    }
    
    @FXML
    private void switchToGame(){
        gameSwitcher.switchMenu();
    }
 
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
    void handleExitButton(ActionEvent event) {
        switchToGame();
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
        else {

        }
    }

    @FXML
    void handlePurchaseHelmet(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.HELMET)) {
            buyItem(ItemType.HELMET);
        }
        else {

        }
    }

    @FXML
    void handlePurchasePotion(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.HEALTHPOTION)) {
            buyItem(ItemType.HEALTHPOTION);
        }
        else {

        }
    }

    @FXML
    void handlePurchaseShield(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.SHIELD)) {
            buyItem(ItemType.SHIELD);
        }
        else {

        }
    }

    @FXML
    void handlePurchaseStaff(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.STAFF)) {
            buyItem(ItemType.STAFF);
        }
        else {

        }
    }

    @FXML
    void handlePurchaseStake(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.STAKE)) {
            buyItem(ItemType.STAKE);
        }
        else {

        }
    }

    @FXML
    void handlePurchaseSword(ActionEvent event) {
        if (world.getGold().getValue() >= world.getItemPrice(ItemType.SWORD)) {
            buyItem(ItemType.SWORD);

        }
        else {

        }
    }

    @FXML
    public void initialise() {
        gold.textProperty().bind(world.getGold().asString());
    }


}
