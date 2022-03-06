package com.crusade.crusade_template;

import javafx.scene.image.Image;

import java.io.*;

public class Faction implements Serializable {

    private String name;
    private String iconURL;
    private transient Image icon;
    private int territoryOwned;
    private boolean isDisabled = false;

    public Faction() {
        name = "Default Faction";
        territoryOwned = 0;
    }

    public Faction(Image image, String nm, int terr){
        icon = image;
        iconURL = image.getUrl();
        name = nm;
        territoryOwned = terr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getIcon() {
        return icon;
    }

    public void setIcon(Image icon) {
        this.icon = icon;
        iconURL = icon.getUrl();
    }

    public void setIconURL(String string){
        iconURL = string;
    }

    public void territoryAdd(){
        territoryOwned++;
    }

    public void territorySub(){
        territoryOwned--;
        if (territoryOwned < 0){
            territoryOwned = 0;
        }
    }

    public int getTerritoryOwned(){
        return territoryOwned;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public void removeAllOwnership(){
        territoryOwned = 0;
    }

    public void setIconFromURL(){
        icon = new Image(iconURL);
    }

}
