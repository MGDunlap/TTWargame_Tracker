package com.crusade.crusade_template;

import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SectorEdit {

    private static SectorButton currentButton;
    private ColorPicker picker;
    private TextField specialText;
    private CheckBox checkBox;

    public SectorEdit(ColorPicker cp, TextField textField, CheckBox box){
        picker = cp;
        specialText = textField;
        checkBox = box;

    }

    public void select(SectorButton button) throws NullPointerException{
        currentButton = button;
        checkBox.setSelected(currentButton.getSector().getActuDisabled());
        specialText.setText(currentButton.getSector().getType());
        picker.setValue(currentButton.getSector().getSaveColor());
    }

    public void setColor(){
        currentButton.setStyle("-fx-background-color: rgba(255,255,255,0.1); -fx-border-color: "+ toHexString(picker.getValue()) + "; -fx-border-width: 2;" );
        currentButton.getSector().setSaveColor(picker.getValue());
        Controller.setUnsavedData(true);
    }

    public void setSectorType(){
        currentButton.getSector().setSpecial(specialText.getText());
        Controller.setUnsavedData(true);
    }

    public static String toHexString(Color color) {
        int r = ((int) Math.round(color.getRed()     * 255)) << 24;
        int g = ((int) Math.round(color.getGreen()   * 255)) << 16;
        int b = ((int) Math.round(color.getBlue()    * 255)) << 8;
        int a = ((int) Math.round(color.getOpacity() * 255));

        return String.format("#%08X", (r + g + b + a));
    }

    public void setSectorDisabled() {
        currentButton.getSector().setActuDisabled(checkBox.isSelected());
        Controller.setUnsavedData(true);
    }
}
