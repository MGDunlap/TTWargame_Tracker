package com.crusade.crusade_template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.MalformedURLException;

public class FactionControl {

    //<editor-fold desc="FXML items">
    @FXML
    private TextField factionName1 = new TextField()	;
    @FXML
    private TextField factionName2 = new TextField()	;
    @FXML
    private TextField factionName3 = new TextField()	;
    @FXML
    private TextField factionName4 = new TextField()	;
    @FXML
    private TextField factionName5 = new TextField()	;
    @FXML
    private TextField factionName6 = new TextField()	;
    @FXML
    private TextField factionName7 = new TextField()	;
    @FXML
    private TextField factionName8 = new TextField()	;
    @FXML
    private TextField factionName9 = new TextField()	;
    @FXML
    private TextField factionName10 = new TextField();
    @FXML
    private Button selectIcon1= new Button()	;
    @FXML
    private Button selectIcon2= new Button()	;
    @FXML
    private Button selectIcon3= new Button()	;
    @FXML
    private Button selectIcon4= new Button()	;
    @FXML
    private Button selectIcon5= new Button()	;
    @FXML
    private Button selectIcon6= new Button()	;
    @FXML
    private Button selectIcon7= new Button()	;
    @FXML
    private Button selectIcon8= new Button()	;
    @FXML
    private Button selectIcon9= new Button()	;
    @FXML
    private Button selectIcon10= new Button()	;
    @FXML
    private CheckBox factionDisable1 = new CheckBox();
    @FXML
    private CheckBox factionDisable2 = new CheckBox();
    @FXML
    private CheckBox factionDisable3 = new CheckBox();
    @FXML
    private CheckBox factionDisable4 = new CheckBox();
    @FXML
    private CheckBox factionDisable5 = new CheckBox();
    @FXML
    private CheckBox factionDisable6 = new CheckBox();
    @FXML
    private CheckBox factionDisable7 = new CheckBox();
    @FXML
    private CheckBox factionDisable8 = new CheckBox();
    @FXML
    private CheckBox factionDisable9 = new CheckBox();
    @FXML
    private CheckBox factionDisable10 = new CheckBox();
    @FXML
    private ImageView iconView = new ImageView();
    @FXML
    private ImageView iconView1 = new ImageView();
    @FXML
    private ImageView iconView2= new ImageView();
    @FXML
    private ImageView iconView3 = new ImageView();
    @FXML
    private ImageView iconView4 = new ImageView();
    @FXML
    private ImageView iconView5 = new ImageView();
    @FXML
    private ImageView iconView6 = new ImageView();
    @FXML
    private ImageView iconView7 = new ImageView();
    @FXML
    private ImageView iconView8 = new ImageView();
    @FXML
    private ImageView iconView9 = new ImageView();
    @FXML
    private Button okButton = new Button();
    //</editor-fold>

    private Faction[] factions;
    private static Button[] selectIcons;
    private static TextField[] factionNames;
    private static CheckBox[] factionDisables;
    private static ImageView[] views;
    private final DefaultIcons defaultIcons;

    public FactionControl(){
        factions = Controller.getFactions();
        defaultIcons = new DefaultIcons();

    }

    private void initializeControls(){
        selectIcons = new Button[10];
        selectIcons[0] = selectIcon1;
        selectIcons[1] = selectIcon2;
        selectIcons[2] = selectIcon3;
        selectIcons[3] = selectIcon4;
        selectIcons[4] = selectIcon5;
        selectIcons[5] = selectIcon6;
        selectIcons[6] = selectIcon7;
        selectIcons[7] = selectIcon8;
        selectIcons[8] = selectIcon9;
        selectIcons[9] = selectIcon10;
        factionNames = new TextField[10];
        factionNames[0] = factionName1;
        factionNames[1] = factionName2;
        factionNames[2] = factionName3;
        factionNames[3] = factionName4;
        factionNames[4] = factionName5;
        factionNames[5] = factionName6;
        factionNames[6] = factionName7;
        factionNames[7] = factionName8;
        factionNames[8] = factionName9;
        factionNames[9] = factionName10;
        factionDisables = new CheckBox[10];
        factionDisables[0] = factionDisable1;
        factionDisables[1] = factionDisable2;
        factionDisables[2] = factionDisable3;
        factionDisables[3] = factionDisable4;
        factionDisables[4] = factionDisable5;
        factionDisables[5] = factionDisable6;
        factionDisables[6] = factionDisable7;
        factionDisables[7] = factionDisable8;
        factionDisables[8] = factionDisable9;
        factionDisables[9] = factionDisable10;
        views = new ImageView[10];
        views[0] = iconView ;
        views[1] = iconView1;
        views[2] = iconView2;
        views[3] = iconView3;
        views[4] = iconView4;
        views[5] = iconView5;
        views[6] = iconView6;
        views[7] = iconView7;
        views[8] = iconView8;
        views[9] = iconView9;
    }
    @FXML
    public void initialize(){
        initializeControls();
    }

    public void factionMenu(){
        try{
            FXMLLoader facMenu = new FXMLLoader(FactionControl.class.getResource("FactionMenu.fxml"));
            Stage menu = new Stage();
            menu.initModality(Modality.APPLICATION_MODAL);
            menu.setTitle("Factions");
            Scene scene = new Scene(facMenu.load(), 465, 740);
            menu.setScene(scene);
            loadPrevious();
            initialDisables();
            menu.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initialDisables(){
        for (int i = 0; i < factionDisables.length - 1; i++){
            if (i == 9){
                if (!factionDisables[i].isSelected()){
                    factionDisables[i].setDisable(true);
                }
            }else if (!factionDisables[i].isSelected() && !factionDisables[i + 1].isSelected()){
                factionDisables[i].setDisable(true);
            }
        }
    }

    public void toggleDisable(ActionEvent actionEvent){
        CheckBox currentCheckBox = (CheckBox) actionEvent.getSource();
        int index = convertID(currentCheckBox.getId());
        if (currentCheckBox.isSelected()){
            factionDisables[index - 1].setDisable(false);
        }else{
            factionDisables[index - 1].setDisable(true);
        }

    }

    public void close(ActionEvent actionEvent){
        Node node = (Node) actionEvent.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        onCloseAction(thisStage);
    }

    public void selectFacIcon(ActionEvent actionEvent) throws MalformedURLException {
        Node node = (Node) actionEvent.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        Image icon = new Image(SelectImage.selectIcon(thisStage).getUrl());
        Button button = (Button) actionEvent.getSource();
        int index = convertID(button.getId());
        factions[index].setIcon(icon);
        factions[index].setIconURL(icon.getUrl());
        views[index].setImage(new Image(icon.getUrl(), 40, 32, true, true));

    }

    private int convertID(String id){
        String s = id.replaceAll("[^\\d.]", "");
        return Integer.parseInt(s) - 1;
    }

    private void loadPrevious(){
        for (int i = 0; i < factions.length; i ++){
            factionNames[i].setText(factions[i].getName());
            if (factions[i].getIcon() != null){
                Image icon = factions[i].getIcon();
                views[i].setImage(new Image(icon.getUrl(), 40, 32, true, true));
            }

            factionDisables[i].setSelected(factions[i].isDisabled());
        }
    }

    private void onCloseAction(Stage stage){
        int num = 0;
        for (CheckBox factionDisable : factionDisables) {
            if (factionDisable.isSelected()) {
                num++;
            }
        }
        if (num != Controller.getNumDisabled()){
            final int disabled = num;
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Apply Changes");
            alert.setHeaderText("Enabling/Disabling Factions will reset the map sectors.");
            alert.setContentText("Are you sure you want to continue?");
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.showAndWait().ifPresent(buttonType -> {
                if (buttonType == ButtonType.OK){
                    for (int i = 0; i < factions.length; i++){
                        factions[i].setName(factionNames[i].getText());
                        factions[i].setDisabled(factionDisables[i].isSelected());
                    }
                    Controller.renameFactionNames();
                    Controller.setNumDisabled(disabled);
                    Controller.removeFactionOwnership();
                    Controller.setSectorsUnowned();
                    Controller.changeFactionSectorFields();
                    Controller.setSectorIcons();
                    Controller.disableFactionHboxes();
                    Controller.setUnsavedData(true);
                    stage.close();
                }
            });

        }else{
            for (int i = 0; i < factions.length; i++){
                factions[i].setName(factionNames[i].getText());
                factions[i].setDisabled(factionDisables[i].isSelected());
            }
            Controller.renameFactionNames();
            Controller.setSectorIcons();
            Controller.setUnsavedData(true);
            stage.close();
        }
        Controller.setFactionEditMode(false);
    }

    public void getFactionsAgain(){
        factions = Controller.getFactions();
    }

    public void setToDefaultIcons(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Default Icons");
        alert.setHeaderText("Reset faction icons to default?");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.showAndWait().ifPresent(buttonType -> {
            if (buttonType == ButtonType.OK){
                for (int i = 0; i < factions.length; i++){
                    factions[i].setIcon(defaultIcons.getIcon(i));
                }
                loadPrevious();
            }
        });
    }
}
