package com.fundamentals.java;

public class House {

    private String foundationType;
    private String roofStyle;
    private String doorColor;
    private int windowSize;

    public House() {
        this("Cinder Blocks", "Steel", "Grey", 42);
    }

    public House(String foundationType, String roofStyle) {
        this(foundationType, roofStyle, "Red" , 25);
    }

    public House(String foundationType, String roofStyle, String doorColor, int windowSize) {
        this.foundationType = foundationType;
        this.roofStyle = roofStyle;
        this.doorColor = doorColor;
        this.windowSize = windowSize;
    }

    /* Setter and Getter */

    public void setFoundationType(String foundationType) {
        this.foundationType = foundationType;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public String getRoofStyle() {
        return roofStyle;
    }

    public void setRoofStyle(String roofStyle) {
        this.roofStyle = roofStyle;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }

    public void doorFunction() {
        System.out.println("This door opens.");
    }

    public void doorFunction(String message) {
        System.out.println(message + " " + doorColor);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Foundation: "+getFoundationType() +
                " Roof Style: " + getRoofStyle() + " Door Color: " + getDoorColor() +
                " Window Sizes: "+getWindowSize();
    }
} // end class
