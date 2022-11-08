package com.fundamentals.practice;

public abstract class Triangle extends Polygon implements HeightInterface {

    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle() {
        super(3);
    }

    @Override
    protected double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
