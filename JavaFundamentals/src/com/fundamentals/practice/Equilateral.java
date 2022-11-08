package com.fundamentals.practice;

public class Equilateral extends Triangle {

    public Equilateral(double length) {
        sideA = length;
        sideB = length;
        sideC = length;
    }

    @Override
    public double getHeight() {
        return Math.sqrt( Math.pow(sideB, 2) - Math.pow(sideA / 2,2) );
    }

    @Override
    protected double area() {
        System.out.println(super.area());
        return .5 * sideA * getHeight();
    }
}
