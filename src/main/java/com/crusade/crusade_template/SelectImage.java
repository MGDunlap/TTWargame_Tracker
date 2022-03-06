package com.crusade.crusade_template;

import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;

public class SelectImage {

    private static Image defaultImage = new Image(SelectImage.class.getResource("Default_Map.png").toString());
    private static Image icon = new Image(SelectImage.class.getResource("empty.png").toString());
    private static BackgroundImage backgroundImage;
    private static Background backGround;

    public static Background chooser(Stage stage) throws MalformedURLException {
        Image image;
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image");
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile == null){
            //set as the default image if nothing is selected
            image = defaultImage;

        }else{
            image = new Image(selectedFile.toURI().toURL().toString());
            Controller.setBackgroundURL(image.getUrl());
        }

        backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(853, 720, false, false, false, true));

        backGround = new Background(backgroundImage);
        Controller.setUnsavedData(true);
        return backGround;
    }

    public static Image selectIcon(Stage stage) throws MalformedURLException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image");
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile == null){
            //leave image as empty
        }else{
            return new Image(selectedFile.toURI().toURL().toString());
        }

        return icon;
    }

    public static Background defaultBackground(){
        backgroundImage = new BackgroundImage(defaultImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(853, 720, false, false, false, true));
        backGround = new Background(backgroundImage);
        Controller.setBackgroundURL(defaultImage.getUrl());

        return backGround;
    }
    //for loading only
    public static Background urlToBackground(String string){
        Image image = new Image(string);
        backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(853, 720, false, false, false, true));
        backGround = new Background(backgroundImage);

        return backGround;
    }
}
