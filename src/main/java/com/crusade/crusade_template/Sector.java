package com.crusade.crusade_template;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.*;

public class Sector implements Serializable {

    private String specialType = "";
    private Faction owner;
    private int sectorNumber = 0;
    private String colorAsString = "333333";
    private transient Color saveColor = Color.web("333333");
    private Boolean actuDisabled = false;
    private transient Image empty = new Image(SelectImage.class.getResource("empty.png").toString());//not used after faction creation
    private final Faction unownedFac = new Faction(empty, "None", 0);

    public Sector() {
        owner = unownedFac;
    }

    public Sector(Faction faction){
        owner = faction;
    }

    public Faction getOwner() {
        return owner;
    }

    public void setOwner(Faction owner) {
        this.owner = owner;
    }

    public String getType() {
        return specialType;
    }

    public void setSpecial( String type) {
        specialType = type;

    }

    public void setSectorNumber(int number){
        sectorNumber = number;
    }

    public int getSectorNumber(){
        return sectorNumber;
    }

    public void setToUnowned(){
        owner = unownedFac;
    }

    public Color getSaveColor() {
        return saveColor;
    }

    public void setSaveColor(Color saveColor) {
        this.saveColor = saveColor;
        colorAsString = saveColor.toString();
    }

    public Boolean getActuDisabled() {
        return actuDisabled;
    }

    public void setActuDisabled(Boolean actuDisabled) {
        this.actuDisabled = actuDisabled;
    }

    public void setColorFromString(){
        saveColor = Color.web(colorAsString);
    }

}
