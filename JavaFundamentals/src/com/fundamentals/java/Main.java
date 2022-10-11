package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {
        houseExample();
    } // end method

    /*
    * This method demonstrates the House class
    * */
    public static void houseExample() {
        House myHouse = new House();
        myHouse.doorColor = "Red";
        myHouse.doorFunction();

        House otherHouse = new House();
        otherHouse.doorColor = "Yellow";

        System.out.println(myHouse.doorColor);
        System.out.println(otherHouse.doorColor);

        House thirdHouse = otherHouse;
        thirdHouse.doorColor = "Blue";

        System.out.println(thirdHouse.doorColor);
        System.out.println(otherHouse.doorColor);
    } // end method

} // end class
