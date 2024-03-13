package com.fundamentals.lessons;

/* Abstraction - Abstract Classes and Interfaces */
public class Lesson15  implements Lesson15interface {

    @Override
    public void turnOnDevice() {
        System.out.println("Device is turned on.");
    }

    public static void main(String[] args) {
        Lesson15 myLesson = new Lesson15();
        System.out.println(Lesson15.LED);
        myLesson.turnOnDevice();
        myLesson.increaseVolume(12);
        System.out.println(Lesson15interface.isEnergyEfficient("LED"));
    }

} // end class
