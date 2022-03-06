package com.crusade.crusade_template;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelpMenu {

    public void helpMenu(){
        try{
            FXMLLoader helpMenu = new FXMLLoader(FactionControl.class.getResource("HelpMenu.fxml"));
            Stage menu = new Stage();
            menu.initModality(Modality.APPLICATION_MODAL);
            menu.setTitle("Help");
            Scene scene = new Scene(helpMenu.load(), 500, 420);
            menu.setScene(scene);
            menu.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

