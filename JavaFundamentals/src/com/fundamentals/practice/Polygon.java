package com.fundamentals.practice;

public abstract class Polygon {
    // many sides
    protected static int DEGREES = 180;
    protected int numberOfSides;
    protected double perimeter = 0;

    public Polygon(int sides) {
        this.numberOfSides = sides;
    }

    protected double area() {
        double sideLength = (getPerimeter() / numberOfSides);
        double iRadius = .5 * sideLength * (1 / Math.tan(Math.PI / numberOfSides));
        return .5 * getPerimeter() * iRadius;
    }

    protected double getPerimeter() {
        return perimeter;
    }

    protected double interiorAngleCalc() {
        return (numberOfSides - 2) * DEGREES;
    }

    protected double exteriorAngleCalc() {
        return DEGREES - interiorAngleCalc();
    }

}
