package com.fundamentals.java;

public class Condo extends House {
    private String balconyType;

    public Condo() {
        this("wood", "flat", "Red", 28, "Railed");
    }

    public Condo(String foundationType, String roofStyle, String balconyType) {
        this(foundationType, roofStyle, "red", 28, balconyType);
    }

    public Condo(String foundationType, String roofStyle, String doorColor, int windowSize, String balconyType) {
        super(foundationType, roofStyle, doorColor, windowSize);
        this.balconyType = balconyType;
    }

    public String getBalconyType() {
        return balconyType;
    }

    public void setBalconyType(String balconyType) {
        this.balconyType = balconyType;
    }

    public void maintenance() {
        super.doorFunction();
        System.out.println("We will fix any issue.");
    }

    @Override
    public void doorFunction() {
        System.out.println("My condo door slides open and closed.");
    }
}
