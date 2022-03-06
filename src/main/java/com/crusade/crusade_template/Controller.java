package com.crusade.crusade_template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.net.MalformedURLException;

public class Controller {

    //region FXML Items
    @FXML
    private AnchorPane anchorBackground = new AnchorPane();
    @FXML
    private TilePane tilePane1, tilePane2;
    @FXML
    private SectorButton sector = new SectorButton();
    @FXML
    private SectorButton sector2 = new SectorButton();
    @FXML
    private SectorButton sector3 = new SectorButton();
    @FXML
    private SectorButton sector4 = new SectorButton();
    @FXML
    private SectorButton sector5 = new SectorButton();
    @FXML
    private SectorButton sector6 = new SectorButton();
    @FXML
    private SectorButton sector7 = new SectorButton();
    @FXML
    private SectorButton sector8 = new SectorButton();
    @FXML
    private SectorButton sector9 = new SectorButton();
    @FXML
    private SectorButton sector10 = new SectorButton();
    @FXML
    private SectorButton sector11 = new SectorButton();
    @FXML
    private SectorButton sector12 = new SectorButton();
    @FXML
    private SectorButton sector13 = new SectorButton();
    @FXML
    private SectorButton sector14 = new SectorButton();
    @FXML
    private SectorButton sector15 = new SectorButton();
    @FXML
    private SectorButton sector16 = new SectorButton();
    @FXML
    private SectorButton sector17 = new SectorButton();
    @FXML
    private SectorButton sector18 = new SectorButton();
    @FXML
    private SectorButton sector19 = new SectorButton();
    @FXML
    private SectorButton sector20 = new SectorButton();
    @FXML
    private SectorButton sector21 = new SectorButton();
    @FXML
    private SectorButton sector22 = new SectorButton();
    @FXML
    private SectorButton sector23 = new SectorButton();
    @FXML
    private SectorButton sector24 = new SectorButton();
    @FXML
    private SectorButton sector25 = new SectorButton();
    @FXML
    private SectorButton sector26 = new SectorButton();
    @FXML
    private SectorButton sector27 = new SectorButton();
    @FXML
    private SectorButton sector28 = new SectorButton();
    @FXML
    private SectorButton sector29 = new SectorButton();
    @FXML
    private SectorButton sector30 = new SectorButton();
    @FXML
    private SectorButton sector31 = new SectorButton();
    @FXML
    private SectorButton sector32 = new SectorButton();
    @FXML
    private SectorButton sector33 = new SectorButton();
    @FXML
    private SectorButton sector34 = new SectorButton();
    @FXML
    private SectorButton sector35 = new SectorButton();
    @FXML
    private SectorButton sector36 = new SectorButton();
    @FXML
    private SectorButton sector37 = new SectorButton();
    @FXML
    private SectorButton sector38 = new SectorButton();
    @FXML
    private SectorButton sector39 = new SectorButton();
    @FXML
    private SectorButton sector40 = new SectorButton();
    @FXML
    private SectorButton sector41 = new SectorButton();
    @FXML
    private SectorButton sector42 = new SectorButton();
    @FXML
    private SectorButton sector43 = new SectorButton();
    @FXML
    private SectorButton sector44 = new SectorButton();
    @FXML
    private SectorButton sector45 = new SectorButton();
    @FXML
    private SectorButton sector46 = new SectorButton();
    @FXML
    private SectorButton sector47 = new SectorButton();
    @FXML
    private SectorButton sector48 = new SectorButton();
    @FXML
    private SectorButton sector49 = new SectorButton();
    @FXML
    private SectorButton sector50 = new SectorButton();
    @FXML
    private SectorButton sector51 = new SectorButton();
    @FXML
    private SectorButton sector52 = new SectorButton();
    @FXML
    private SectorButton sector53 = new SectorButton();
    @FXML
    private SectorButton sector54 = new SectorButton();
    @FXML
    private SectorButton sector55 = new SectorButton();
    @FXML
    private SectorButton sector56 = new SectorButton();
    @FXML
    private SectorButton sector57 = new SectorButton();
    @FXML
    private SectorButton sector58 = new SectorButton();
    @FXML
    private SectorButton sector59 = new SectorButton();
    @FXML
    private SectorButton sector60 = new SectorButton();
    @FXML
    private SectorButton sector61 = new SectorButton();
    @FXML
    private SectorButton sector62 = new SectorButton();
    @FXML
    private SectorButton sector63 = new SectorButton();
    @FXML
    private SectorButton sector64 = new SectorButton();
    @FXML
    private SectorButton sector65 = new SectorButton();
    @FXML
    private SectorButton sector66 = new SectorButton();
    @FXML
    private CheckMenuItem editCheckBox;
    @FXML
    private VBox sectorEditVBox = new VBox();
    @FXML
    private VBox sectorDisplay = new VBox();
    @FXML
    private ChoiceBox<String> sectorOwnerChoice;
    @FXML
    private TextField sectorNumberBox, sectorTypeBox, sectorTypeField;
    @FXML
    private TextField factionSectors1 = new TextField();
    @FXML
    private TextField factionSectors2 = new TextField();
    @FXML
    private TextField factionSectors3 = new TextField();
    @FXML
    private TextField factionSectors4 = new TextField();
    @FXML
    private TextField factionSectors5 = new TextField();
    @FXML
    private TextField factionSectors6 = new TextField();
    @FXML
    private TextField factionSectors7 = new TextField();
    @FXML
    private TextField factionSectors8 = new TextField();
    @FXML
    private TextField factionSectors9 = new TextField();
    @FXML
    private TextField factionSectors10 = new TextField();
    @FXML
    private Text factionName1 = new Text();
    @FXML
    private Text factionName2 = new Text();
    @FXML
    private Text factionName3 = new Text();
    @FXML
    private Text factionName4 = new Text();
    @FXML
    private Text factionName5 = new Text();
    @FXML
    private Text factionName6 = new Text();
    @FXML
    private Text factionName7 = new Text();
    @FXML
    private Text factionName8 = new Text();
    @FXML
    private Text factionName9 = new Text();
    @FXML
    private Text factionName10 = new Text();
    @FXML
    private Button sectorApplyButton = new Button();
    @FXML
    private HBox factionHbox1 = new HBox();
    @FXML
    private HBox factionHbox2 = new HBox();
    @FXML
    private HBox factionHbox3 = new HBox();
    @FXML
    private HBox factionHbox4 = new HBox();
    @FXML
    private HBox factionHbox5 = new HBox();
    @FXML
    private HBox factionHbox6 = new HBox();
    @FXML
    private HBox factionHbox7 = new HBox();
    @FXML
    private HBox factionHbox8 = new HBox();
    @FXML
    private HBox factionHbox9 = new HBox();
    @FXML
    private HBox factionHbox10 = new HBox();
    @FXML
    private ColorPicker sectorColorPicker = new ColorPicker();
    @FXML
    private CheckBox disableCheckBox;
    @FXML
    private MenuItem editFacButton = new MenuItem();
    //endregion

    //Insets for button size changes
    private final Insets insetS, insetM, insetL, insetZ, inset2S;
    private Stage stage;
    private static SectorButton[] sectorButtons;
    private SectorControl<String> sectorControl;
    private static Faction[] factions;
    private static Sector[] sectors;
    private static TextField[] factionSectors;
    private static Button[] applyButton;
    private static Text[] factionNames;
    private static ChoiceBox[] choiceBoxes;
    private static HBox[] factionHboxes;
    private Object[][] saveData;
    private static int numDisabled = 0;
    private static boolean factionEditMode = false;
    private FactionControl factionControl;
    private SectorEdit sectorEdit;
    private HelpMenu helpMenu;
    private DefaultIcons defaultIcons;
    private Background background;
    private static String backgroundURL;
    private static boolean unsavedData = false;
    public static int buttonSize = 2;//small = 1, med. = 2, lg. = 3
    //                                                w1, h1, w2, h2, w3, h3
    public static double[] bSizeArray = new double[] {35, 44, 60, 74, 80, 100};

    public Controller(){
        sectorOwnerChoice = new ChoiceBox<>();
        factions = new Faction[10];
        sectors = new Sector[66];
        factionControl = new FactionControl();
        helpMenu = new HelpMenu();
        //top, right, bottom, left
        insetZ = new Insets(10, 0, 0, 10);
        insetS = new Insets(20, 0, 0, 20);
        insetM = new Insets(71, 0, 0, 97);
        insetL = new Insets(85, 0, 0, 120);
        inset2S = new Insets(46, 0, 0, 60);
    }

    @FXML
    public void initialize(){
        defaultIcons = new DefaultIcons();
        factionControl.initialize();
        initializeButtons();
        initializeSectors();
        initializeFactions();
        setSectorsUnowned();
        tilePane2.setPickOnBounds(false);
        tilePane1.setPickOnBounds(false);
        sectorControl = new SectorControl<String>(sectorOwnerChoice, sectorNumberBox, sectorTypeBox);
        sectorEdit = new SectorEdit(sectorColorPicker, sectorTypeField, disableCheckBox);
        applyButton = new Button[] {sectorApplyButton};
        choiceBoxes = new ChoiceBox[]{sectorOwnerChoice};
        background = SelectImage.defaultBackground();

        sectorColorPicker.setOnAction(actionEvent -> sectorEdit.setColor());

        sectorTypeField.setOnAction(actionEvent -> sectorEdit.setSectorType());

        disableCheckBox.setOnAction(actionEvent -> sectorEdit.setSectorDisabled());

        sectorOwnerChoice.getSelectionModel().selectedIndexProperty().addListener((observableValue, number, t1) -> {
            sectorControl.setSectorOwner((Integer) t1);;
        });

    }

    //initialize all FXML items
    public void initializeButtons(){
        sectorButtons = new SectorButton[66];
        sectorButtons[0] = sector;
        sectorButtons[1] = sector2;
        sectorButtons[2] = sector3;
        sectorButtons[3] = sector4;
        sectorButtons[4] = sector5;
        sectorButtons[5] = sector6;
        sectorButtons[6] = sector7;
        sectorButtons[7] = sector8;
        sectorButtons[8] = sector9;
        sectorButtons[9] = sector10;
        sectorButtons[10] = sector11;
        sectorButtons[11] = sector12;
        sectorButtons[12] = sector13;
        sectorButtons[13] = sector14;
        sectorButtons[14] = sector15;
        sectorButtons[15] = sector16;
        sectorButtons[16] = sector17;
        sectorButtons[17] = sector18;
        sectorButtons[18] = sector19;
        sectorButtons[19] = sector20;
        sectorButtons[20] = sector21;
        sectorButtons[21] = sector22;
        sectorButtons[22] = sector23;
        sectorButtons[23] = sector24;
        sectorButtons[24] = sector25;
        sectorButtons[25] = sector26;
        sectorButtons[26] = sector27;
        sectorButtons[27] = sector28;
        sectorButtons[28] = sector29;
        sectorButtons[29] = sector30;
        sectorButtons[30] = sector31;
        sectorButtons[31] = sector32;
        sectorButtons[32] = sector33;
        sectorButtons[33] = sector34;
        sectorButtons[34] = sector35;
        sectorButtons[35] = sector36;
        sectorButtons[36] = sector37;
        sectorButtons[37] = sector38;
        sectorButtons[38] = sector39;
        sectorButtons[39] = sector40;
        sectorButtons[40] = sector41;
        sectorButtons[41] = sector42;
        sectorButtons[42] = sector43;
        sectorButtons[43] = sector44;
        sectorButtons[44] = sector45;
        sectorButtons[45] = sector46;
        sectorButtons[46] = sector47;
        sectorButtons[47] = sector48;
        sectorButtons[48] = sector49;
        sectorButtons[49] = sector50;
        sectorButtons[50] = sector51;
        sectorButtons[51] = sector52;
        sectorButtons[52] = sector53;
        sectorButtons[53] = sector54;
        sectorButtons[54] = sector55;
        sectorButtons[55] = sector56;
        sectorButtons[56] = sector57;
        sectorButtons[57] = sector58;
        sectorButtons[58] = sector59;
        sectorButtons[59] = sector60;
        sectorButtons[60] = sector61;
        sectorButtons[61] = sector62;
        sectorButtons[62] = sector63;
        sectorButtons[63] = sector64;
        sectorButtons[64] = sector65;
        sectorButtons[65] = sector66;
        factionSectors = new TextField[10];
        factionSectors[0] = factionSectors1;
        factionSectors[1] = factionSectors2;
        factionSectors[2] = factionSectors3;
        factionSectors[3] = factionSectors4;
        factionSectors[4] = factionSectors5;
        factionSectors[5] = factionSectors6;
        factionSectors[6] = factionSectors7;
        factionSectors[7] = factionSectors8;
        factionSectors[8] = factionSectors9;
        factionSectors[9] = factionSectors10;
        factionNames = new Text[10];
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
        factionHboxes = new HBox[10];
        factionHboxes[0] = factionHbox1;
        factionHboxes[1] = factionHbox2;
        factionHboxes[2] = factionHbox3;
        factionHboxes[3] = factionHbox4;
        factionHboxes[4] = factionHbox5;
        factionHboxes[5] = factionHbox6;
        factionHboxes[6] = factionHbox7;
        factionHboxes[7] = factionHbox8;
        factionHboxes[8] = factionHbox9;
        factionHboxes[9] = factionHbox10;


    }
    //Set all sectors to unowned
    public static  void setSectorsUnowned(){
        for (int i = 0; i < sectorButtons.length; i++){
            sectorButtons[i].getSector().setToUnowned();
            ImageView image = new ImageView(sectorButtons[i].getSector().getOwner().getIcon());
            image.setFitHeight(SizeControls.getButtonHeight());
            image.setFitWidth(SizeControls.getButtonWidth());
            sectorButtons[i].setGraphic(image);
        }
    }
    //Removes all faction ownership of sectors
    public static void removeFactionOwnership(){
        for (int i = 0; i < factions.length; i++){
            factions[i].removeAllOwnership();
        }
    }
    //sets sector icons
    public static void setSectorIcons(){
        for (SectorButton sectorButton : sectorButtons) {
            ImageView image = new ImageView(sectorButton.getSector().getOwner().getIcon());
            image.setFitHeight(SizeControls.getButtonHeight());
            image.setFitWidth(SizeControls.getButtonWidth());
            sectorButton.setGraphic(image);
        }
    }
    //sector initializer
    public void initializeSectors(){
        for (int i = 0; i < sectors.length; i++){
            sectors[i] = new Sector();
            sectors[i].setSectorNumber(i+1);
        }
        for (int i = 0; i < sectorButtons.length; i++){
            sectorButtons[i].setSector(sectors[i]);
        }
    }
    //Faction initializer
    public void initializeFactions(){
        for (int i = 0; i < factions.length; i++){
            factions[i] = new Faction();
            factions[i].setName("Faction " + (i + 1));
            sectorOwnerChoice.getItems().add(factions[i].getName());
            factions[i].setIcon(defaultIcons.getIcon(i));
        }
        sectorOwnerChoice.getItems().add("None");
    }
    //Sets stage
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    //Prompt for closing program
    public void closeProgramButton(){
        Alert close = new Alert(Alert.AlertType.CONFIRMATION);
        close.setTitle("Quit");
        close.setHeaderText("Are you sure you want to quit?");
        if (unsavedData){
            close.setHeaderText("You have unsaved data. Are you sure you want to quit?");
            close.setContentText("Any unsaved data will be lost!");
        }
        if (close.showAndWait().get() == ButtonType.OK){
            this.stage.close();
        }
    }
    //save
    public void save(){
        String[] backgroundURLArray = new String[] {backgroundURL};
        saveData = new Object[][]{sectors, factions, backgroundURLArray};
        //save sectors [0], factions [1]
        SaveLoad.Save(saveData, stage);
        unsavedData = false;
    }
    //load
    public void load(){
        String[] string = new String[] {""};
        saveData = new Object[][]{sectors, factions, string};
        SaveLoad.Load(saveData, stage);
        sectors = (Sector[]) saveData[0];
        factions = (Faction[]) saveData[1];
        string = (String[]) saveData[2];
        backgroundURL = string[0];
        doOnLoad();
    }
    //do these actions when save data is loaded
    private void doOnLoad(){
        for (int i = 0; i < sectorButtons.length; i++){
            sectorButtons[i].setSector(sectors[i]);
            sectors[i].setColorFromString();
            sectorButtons[i].setStyle("-fx-background-color: transparent; -fx-border-color: "+ SectorEdit.toHexString(sectors[i].getSaveColor()) + "; -fx-border-width: 2;" );
        }
        for (int i = 0; i < factions.length; i++){
            factions[i].setIconFromURL();
        }
        changeFactionSectorFields();
        renameFactionNames();
        disableFactionHboxes();
        disableSectors();
        setSectorIcons();
        factionControl.getFactionsAgain();
        setNumDisabledOnLoad();
        background = SelectImage.urlToBackground(backgroundURL);
        anchorBackground.setBackground(background);
    }
    //Change map size
    public void changeResBig(){
        anchorBackground.setPrefSize(1200, 1000);
        SizeControls.changeButtons(sectorButtons, 3);
        tilePane1.setPrefTileHeight(115);
        tilePane1.setPrefTileWidth(200);
        tilePane2.setPrefTileHeight(115);
        tilePane2.setPrefTileWidth(200);
        tilePane1.setPadding(insetL);
        tilePane2.setPadding(insetS);
        stage.setWidth(1440);
        stage.setHeight(1000);
        buttonSize = 3;
        setSectorIcons();
    }
    public void changeResSmall(){
        anchorBackground.setPrefSize(600, 500);
        SizeControls.changeButtons(sectorButtons, 1);
        tilePane1.setPrefTileHeight(60);
        tilePane1.setPrefTileWidth(100);
        tilePane2.setPrefTileHeight(60);
        tilePane2.setPrefTileWidth(100);
        tilePane1.setPadding(inset2S);
        tilePane2.setPadding(insetZ);
        stage.setWidth(800);
        stage.setHeight(500);
        buttonSize = 1;
        setSectorIcons();
    }
    public void changeResMed(){
        anchorBackground.setPrefSize(800, 666);
        SizeControls.changeButtons(sectorButtons, 2);
        tilePane1.setPrefTileHeight(88);
        tilePane1.setPrefTileWidth(155);
        tilePane2.setPrefTileHeight(88);
        tilePane2.setPrefTileWidth(155);
        tilePane1.setPadding(insetM);
        tilePane2.setPadding(insetS);
        stage.setWidth(1150);
        stage.setHeight(666);
        buttonSize = 2;
        setSectorIcons();
    }
    //Set background image
    public void setAnchorBackground() throws MalformedURLException {
        background = SelectImage.chooser(stage);
        anchorBackground.setBackground(background);
        unsavedData = true;
    }
    //enables sector edit mode
    public void editMode(){
        if (editCheckBox.isSelected()){
            sectorEditVBox.setVisible(true);
            sectorDisplay.setVisible(false);
            editFacButton.setDisable(true);
            enableSectors();
        }else if (!editCheckBox.isSelected()){
            sectorEditVBox.setVisible(false);
            sectorDisplay.setVisible(true);
            editFacButton.setDisable(false);
            disableSectors();
        }
    }
    //sector button selection
    public void sectorSelect(ActionEvent actionEvent){
        SectorButton currentButton = (SectorButton) actionEvent.getSource();
        int i = currentButton.getSector().getSectorNumber();
        sectorControl.select(sectorButtons[i-1]);
        sectorEdit.select(sectorButtons[i-1]);
    }
    //Window for about
    public void about(){
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setTitle("About");
        about.setHeaderText("Crusade Map");
        about.setContentText("Ver. 0.4\nMatthew G. Dunlap\n2022");
        about.showAndWait();
    }
    //opens the edit factions menu
    public void editFactions(){
        factionEditMode = true;
        factionControl.factionMenu();
    }
    //opens help menu
    public void openHelp(){
        helpMenu.helpMenu();
    }
    //get faction method for static faction array
    public static Faction[] getFactions(){
        return factions;
    }
    //changes the values in faction sector fields
    public static void changeFactionSectorFields(){
        for (int i = 0; i < factionSectors.length; i++){
            factionSectors[i].setText(String.valueOf(factions[i].getTerritoryOwned()));
        }
    }
    //renames factions
    public static void renameFactionNames(){
        choiceBoxes[0].getSelectionModel().select(0);
        for (int i = 0; i < factionNames.length; i++){
            factionNames[i].setText(factions[i].getName());
        }
        int h = choiceBoxes[0].getItems().size();
        for (int i = 1; i <= h; i++){
            choiceBoxes[0].getItems().remove(0);
        }

        for (int i = 0; i < factions.length; i++){
            if (factions[i].isDisabled()){
                //nope
            }else{
                choiceBoxes[0].getItems().add(factions[i].getName());
            }
        }
        choiceBoxes[0].getItems().add("None");
        choiceBoxes[0].getSelectionModel().select(choiceBoxes[0].getItems().size() -1);
        factionEditMode = false;

    }
    //disable/enable sector apply button
    public static void setApplyButton(boolean enable){
        applyButton[0].setDisable(!enable);
    }
    //get number of disabled factions (where am I using this?)
    public static int getNumDisabled(){
        return numDisabled;
    }
    //Set number of disabled factions
    public static void setNumDisabled(int i){
        numDisabled = i;
    }
    //returns if in faction edit mode
    public static boolean getFactionEditMode(){
        return factionEditMode;
    }
    //disables Hboxes when factions are disabled
    public static void disableFactionHboxes(){
        for (int i = 0; i < factions.length; i++){
            factionHboxes[i].setVisible(!factions[i].isDisabled());
        }
    }
    //Applies selection sector control to a faction
    public void factionApply(){
        sectorControl.applyFaction();
    }
    //set visibility of sector buttons after edit
    public void disableSectors(){
        for (int i = 0; i < sectorButtons.length; i ++){
            sectorButtons[i].setVisible(!sectorButtons[i].getSector().getActuDisabled());
        }
    }
    //set all buttons visible for edit
    public void enableSectors(){
        for (int i = 0; i < sectorButtons.length; i++){
            sectorButtons[i].setVisible(true);
        }
    }
    //get number disabled after loading
    private void setNumDisabledOnLoad(){
        int num = 0;
        for (Faction fac : factions){
            if (fac.isDisabled()){
                num++;
            }
        }
        setNumDisabled(num);
    }
    //Mark unsaved data for exiting purposes
    public static void setUnsavedData(boolean bool){
        unsavedData = bool;
    }
    //Keep background URL for saving purposes
    public static void setBackgroundURL(String string){
        backgroundURL = string;
    }
}