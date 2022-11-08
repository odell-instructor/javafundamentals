package com.fundamentals.practice;

public class Isosceles extends Triangle{

    public Isosceles(double side2, double side1) {
        this.sideA = side2;
        this.sideB = side2;
        this.sideC = side1;
    }

    //TODO area
    //TODO height


    @Override
    protected double area() {
        return .5 * sideC * getHeight();
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(sideA,2) - (Math.pow(sideC,2) / 4));
    }
}
