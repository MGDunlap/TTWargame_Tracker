package com.crusade.crusade_template;

import javafx.scene.image.Image;

public class DefaultIcons {

    private Image icons[];
    private Image icon1 = new Image(SelectImage.class.getResource("1.png").toString());
    private Image icon2 = new Image(SelectImage.class.getResource("2.png").toString());
    private Image icon3 = new Image(SelectImage.class.getResource("3.png").toString());
    private Image icon4 = new Image(SelectImage.class.getResource("4.png").toString());
    private Image icon5 = new Image(SelectImage.class.getResource("5.png").toString());
    private Image icon6 = new Image(SelectImage.class.getResource("6.png").toString());
    private Image icon7 = new Image(SelectImage.class.getResource("7.png").toString());
    private Image icon8 = new Image(SelectImage.class.getResource("8.png").toString());
    private Image icon9 = new Image(SelectImage.class.getResource("9.png").toString());
    private Image icon10 = new Image(SelectImage.class.getResource("10.png").toString());

    public DefaultIcons(){
        icons = new Image[] {icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10};
    }

    public Image getIcon(int i){
        return icons[i];
    }

}
