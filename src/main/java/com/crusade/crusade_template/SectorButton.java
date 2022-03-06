package com.crusade.crusade_template;

import javafx.scene.control.Button;

import java.io.*;

public class SectorButton extends Button implements Serializable {

    private Sector sector;

    public SectorButton(){
        super();
    }

    public Sector getSector(){
        return sector;
    }

    public void setSector(Sector sector){
        this.sector = sector;
    }

}
