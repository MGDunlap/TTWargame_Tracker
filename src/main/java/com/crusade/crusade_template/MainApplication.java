package com.crusade.crusade_template;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1150, 666);
        stage.setTitle("Campaign Map");
        stage.setScene(scene);
        stage.show();

        Controller controller = fxmlLoader.getController();
        controller.setStage(stage);

        stage.setOnCloseRequest(e -> {
            e.consume();
            controller.closeProgramButton();
        });
    }

    public static void main(String[] args) {
        launch();
    }
}