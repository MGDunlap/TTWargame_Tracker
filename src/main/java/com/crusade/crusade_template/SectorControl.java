package com.crusade.crusade_template;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class SectorControl<T> {

    public ChoiceBox<T> sectorOwnerChoice;
    private TextField sectorNumberBox;
    private TextField sectorTypeBox;
    private static SectorButton currentButton;
    private Faction currentFaction;
    private int currentChoice;
    private String logString;

    private GameLog gameLog;

    public SectorControl(ChoiceBox<T> box, TextField numBox, TextField typBox){
        sectorOwnerChoice = box;
        sectorNumberBox = numBox;
        sectorTypeBox = typBox;
        gameLog = new GameLog();

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
            Faction[] factions = Controller.getFactions();
            logString = "";
            logString += "Sector " + currentButton.getSector().getSectorNumber() + " changed from " + currentButton.getSector().getOwner().getName() + " to None";
            gameLog.PrintLog(logString);
            currentFaction.territorySub();
            currentFaction = null;
            currentButton.getSector().setToUnowned();
            ImageView image = new ImageView(currentButton.getSector().getOwner().getIcon());
            image.setFitHeight(SizeControls.getButtonHeight());
            image.setFitWidth(SizeControls.getButtonWidth());
            currentButton.setGraphic(image);
        }else{
            Faction[] factions = Controller.getFactions();
            logString = "";
            logString += "Sector " + currentButton.getSector().getSectorNumber() + " changed from " + currentButton.getSector().getOwner().getName() + " to " +
                factions[currentChoice].getName();
            gameLog.PrintLog(logString);
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

    public void logSector(){
        logString = "";
        logString += "Sector " + currentButton.getSector().getSectorNumber() + ", controlled by " + currentButton.getSector().getOwner().getName() + ", remains secure";
        gameLog.PrintLog(logString);
    }
}
