package com.fundamentals.lessons;

public interface Lesson15interface {

    // Static final variable
    String LED = "LED";

    // static method
    static boolean isEnergyEfficient(String electricType) {
        return electricType.equals(LED);
    } // end method

    // abstract method
    void turnOnDevice();

    // default allows for method body
    default void increaseVolume(int value) {
        System.out.println("Volume increased to " + value);
    }

} // end interface
