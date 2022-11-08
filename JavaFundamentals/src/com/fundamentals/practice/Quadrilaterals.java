package com.fundamentals.practice;

public abstract class Quadrilaterals extends Polygon {
    private double lengthA;
    private double lengthB;
    private double lengthC;
    private double lengthD;

    public Quadrilaterals() {
        super(4);
    }

    public double getLengthA() {
        return lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public double getLengthD() {
        return lengthD;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    public void setLengthD(double lengthD) {
        this.lengthD = lengthD;
    }

    @Override
    protected double getPerimeter() {
        return numberOfSides * lengthA;
    }
}
