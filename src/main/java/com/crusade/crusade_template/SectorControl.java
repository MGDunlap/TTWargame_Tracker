package com.crusade.crusade_template;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SectorControl<T> {

    public ChoiceBox<T> sectorOwnerChoice;
    private TextField sectorNumberBox;
    private TextField sectorTypeBox;
    private static SectorButton currentButton;
    private Faction currentFaction;
    private int currentChoice;

    public SectorControl(ChoiceBox<T> box, TextField numBox, TextField typBox){
        sectorOwnerChoice = box;
        sectorNumberBox = numBox;
        sectorTypeBox = typBox;

    }

    public void select(SectorButton button) throws NullPointerException{
        currentButton = button;
        sectorNumberBox.setText(""+button.getSector().getSectorNumber());
        sectorTypeBox.setText(button.getSector().getType());
        sectorOwnerChoice.setValue((T) button.getSector().getOwner().getName());
        currentFaction = button.getSector().getOwner();
    }

    public void setSectorOwner(int choice){
        if (Controller.getFactionEditMode()){
            return;
        }
        if (currentButton == null){
            return;
        }
        if (sectorOwnerChoice.getItems().get(choice) != currentButton.getSector().getOwner().getName()){
            Controller.setApplyButton(true);
        }else{
            Controller.setApplyButton(false);
        }
        currentChoice = choice;

    }
    public void applyFaction(){
        if (sectorOwnerChoice.getItems().get(currentChoice) == "None"){
            currentFaction.territorySub();
            currentFaction = null;
            currentButton.getSector().setToUnowned();
            ImageView image = new ImageView(currentButton.getSector().getOwner().getIcon());
            image.setFitHeight(SizeControls.getButtonHeight());
            image.setFitWidth(SizeControls.getButtonWidth());
            currentButton.setGraphic(image);
        }else{
            Faction[] factions = Controller.getFactions();
            currentButton.getSector().setOwner(factions[currentChoice]);
            currentFaction.territorySub();
            factions[currentChoice].territoryAdd();
            currentFaction = factions[currentChoice];
            ImageView image = new ImageView(currentButton.getSector().getOwner().getIcon());
            image.setFitHeight(SizeControls.getButtonHeight());
            image.setFitWidth(SizeControls.getButtonWidth());
            currentButton.setGraphic(image);
        }
        Controller.setApplyButton(false);
        Controller.changeFactionSectorFields();
        Controller.setUnsavedData(true);
    }
}
