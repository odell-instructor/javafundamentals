package com.fundamentals.practice;

public class SportsCar extends Car{

    private final String headLightType;

    public SportsCar() {
        this("flip up");
    }
    public SportsCar(String headLightType) {
        this(2, 20, 450, "Red", headLightType);
    }

    public SportsCar(int numberOfDoors, int wheelSize, int horsePower, String exteriorColor, String headLightType){
        super(numberOfDoors, wheelSize, horsePower,exteriorColor);
        this.headLightType = headLightType;
    }

    public void carShape() {
        System.out.println("Sits lower than a normal car");
    }

    public String getHeadLightType() {
        return headLightType;
    }
}
