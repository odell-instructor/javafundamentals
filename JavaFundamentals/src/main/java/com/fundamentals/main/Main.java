package com.fundamentals.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        houseExample();
    }

    // Single Comment
    /* Multi-line comment
    This is a second line
    And a third line.
    * */

    public static void houseExample() {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.entranceDoorColor = "Red";
        myHouse.foundationType = "Concrete";
        myHouse.roofStyle = "Cedar Shingle";
        myHouse.totalWindows = 30;
        System.out.println(myHouse.entranceDoorColor);
    }

}
