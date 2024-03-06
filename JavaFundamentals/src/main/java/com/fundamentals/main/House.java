package com.fundamentals.main;

public class House {
    private String entranceDoorColor;
    private String foundationType;
    private String roofStyle;
    private int totalWindows;

    public House() {
        this("Cinder Blocks", "Grey");
    }

    public House(String foundationType , String doorColor) {
        this(foundationType, doorColor, "Cedar Shingle", 30);
    }

    public House(String foundationType , String doorColor ,
                 String roofStyle , int totalWindows) {
        this.foundationType = foundationType;
        entranceDoorColor = doorColor;
        this.roofStyle = roofStyle;
        this.totalWindows = totalWindows;
    }

    public String getEntranceDoorColor() {
        return entranceDoorColor;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public String getRoofStyle() {
        return roofStyle;
    }

    public int getTotalWindows() {
        return totalWindows;
    }

    public void doorFunction() {
        System.out.println("This door opens.");
    }

    public static void main(String[] args) {

    }

}
