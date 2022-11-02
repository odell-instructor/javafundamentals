package com.fundamentals.practice;

public class MuscleCar extends SportsCar{

    public MuscleCar() {
        this(2, 22, 550, "Black", "Halogen");
    }

    public MuscleCar(int numberOfDoors, int wheelSize, int horsePower, String exteriorColor, String headLightType) {
        super(numberOfDoors, wheelSize, horsePower, exteriorColor, headLightType);
    }
}
