package com.crusade.crusade_template;

import javafx.scene.control.Button;

public class SizeControls {


    //1 = small, 2 = med, 3 = large
    public static void changeButtons(SectorButton[] buttons, int size){
        if (size == 1){
            for(SectorButton i : buttons){
                i.setPrefSize(65, 56);
            }
        }else if (size == 2){
            for (SectorButton i : buttons){
                i.setPrefSize(98, 85);
            }
        }else if (size == 3){
            for (SectorButton i : buttons){
                i.setPrefSize(130, 112);
            }
        }else{
            throw new IllegalStateException("Unexpected value: " + size);
        }
    }

    public static double getButtonHeight(){
        if (Controller.buttonSize == 1){//small
            return Controller.bSizeArray[1];
        }else if (Controller.buttonSize == 2){//med
            return Controller.bSizeArray[3];
        }else{//large
            return Controller.bSizeArray[5];
        }
    }

    public static double getButtonWidth(){
        if (Controller.buttonSize == 1){//small
            return Controller.bSizeArray[0];
        }else if (Controller.buttonSize == 2){//med
            return Controller.bSizeArray[2];
        }else{//large
            return Controller.bSizeArray[4];
        }
    }
}
