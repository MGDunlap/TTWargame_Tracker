package com.crusade.crusade_template;

import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/*
ButtonGrid by jns on StackOverflow
https://stackoverflow.com/users/6080109/jns
 */

public class ButtonGrid extends Pane {

    private static final double DEFAULT_RATIO = 0.618033987;

    private int                 columnCount;
    private double              ratio;

    public ButtonGrid(int columnCount) {
        this(columnCount, DEFAULT_RATIO);
    }

    public ButtonGrid(int columnCount, double heightToWidthRatio) {
        getStyleClass().add("button-grid");
        this.columnCount = columnCount;
        ratio = heightToWidthRatio;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public void setHeightToWidthRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public Orientation getContentBias() {
        return Orientation.HORIZONTAL;
    }

    @Override
    protected void layoutChildren() {
        double left = getInsets().getLeft();
        double top = getInsets().getTop();

        double tileWidth = calculateTileWidth(getWidth());
        double tileHeight = calculateTileHeight(getWidth());

        ObservableList<Node> children = getChildren();
        double currentX = left;
        double currentY = top;
        for (int idx = 0; idx < children.size(); idx++) {
            if (idx > 0 && idx % columnCount == 0) {
                currentX = left;
                currentY = currentY + tileHeight;
            }
            children.get(idx).resize(tileWidth, tileHeight);
            children.get(idx).relocate(currentX, currentY);
            currentX = currentX + tileWidth;
        }
    }

    @Override
    protected double computePrefWidth(double height) {
        double w = 0;
        for (int idx = 0; idx < columnCount; idx++) {
            Node node = getChildren().get(idx);
            w += node.prefWidth(-1);
        }
        return getInsets().getLeft() + w + getInsets().getRight();
    }

    @Override
    protected double computePrefHeight(double width) {
        double h = calculateTileHeight(width) * getRowCount();
        return getInsets().getTop() + h + getInsets().getBottom();
    }

    private double calculateTileHeight(double width) {
        return calculateTileWidth(width) * ratio;
    }

    private double calculateTileWidth(double width) {
        return (-getInsets().getLeft() + width - getInsets().getRight()) / columnCount;
    }

    private int getRowCount() {
        return getChildren().size() / columnCount;
    }
}
