package com.crusade.crusade_template;

import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;

public class SaveLoad {

    public static <T> void Save(T[][] t, Stage stage) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Save Files", "*.save"));
        File file = fileChooser.showSaveDialog(stage);
        if (file != null){
            try {
                FileOutputStream f = new FileOutputStream(file);
                ObjectOutputStream o = new ObjectOutputStream(f);

                // Write objects to file
                for (T[] value : t) {
                    o.writeObject(value);
                }


                o.close();
                f.close();


            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error saving data!");
                alert.setContentText("You should panic.");
                alert.initModality(Modality.APPLICATION_MODAL);
                alert.showAndWait();
            }
        }


    }

    public static <T> void Load(T[][] t, Stage stage) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Save Files", "*.save"));
        File file = fileChooser.showOpenDialog(stage);
        if (file != null){
            try {

                FileInputStream fi = new FileInputStream(file);
                ObjectInputStream oi = new ObjectInputStream(fi);

                // Read objects
                for(int i = 0; i < t.length; i++){
                    t[i] = (T[]) oi.readObject();
                }

                oi.close();
                fi.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error loading save!");
                alert.setContentText("File may be corrupt.");
                alert.initModality(Modality.APPLICATION_MODAL);
                alert.showAndWait();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
