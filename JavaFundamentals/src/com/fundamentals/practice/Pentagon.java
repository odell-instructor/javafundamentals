package com.fundamentals.practice;

public class Pentagon extends Polygon {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double sideD;
    private final double sideE;

    public Pentagon(double sideA, double sideB, double sideC, double sideD, double sideE) {
        super(5);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
    }

    @Override
    protected double area() {
        System.out.println(super.area());
        double value = 5 * (5 + 2 * Math.sqrt(5));
        return .25 * Math.sqrt(value)* Math.pow(sideA, 2);
    }

    @Override
    protected double getPerimeter() {
        return sideA + sideB + sideC + sideD + sideE;
    }
}
