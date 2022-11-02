package com.fundamentals.practice;

public class Polygon {
    // many sides
    protected static int DEGREES = 180;
    protected int numberOfSides;

    public Polygon() {
        this(4);
    }
    public Polygon(int sides) {
        this.numberOfSides = sides;
    }

    protected double interiorAngleCalc() {
        return (numberOfSides - 2) * DEGREES;
    }

    protected double exteriorAngleCalc() {
        return DEGREES - interiorAngleCalc();
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
