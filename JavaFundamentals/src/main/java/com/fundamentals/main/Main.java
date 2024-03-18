package com.fundamentals.main;

import com.fundamentals.lessons.Lesson17;
import com.fundamentals.practice.EndCallInterface;
import com.fundamentals.practice.HousePhone;
import com.fundamentals.practice.Telephone;
import com.fundamentals.practice.Week;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello Java");
        //houseExample();
        //phoneExample();
        //System.out.println(Week.THU);
        lesson17Example(Lesson17.IceCreamFlavors.CHOCOLATE);
    }

    public static void lesson17Example(Lesson17.IceCreamFlavors flavor) {
        System.out.println(Lesson17.IceCreamFlavors.ROCKY_ROAD);
        switch(flavor) {
            case VANILLA:
                System.out.println("Vanilla");
                break;
            default:
                System.out.println("Chocolate");
        }
    }


    // Single Comment
    /* Multi-line comment
    This is a second line
    And a third line.
    * */

    public static void houseExample() {
        House myHouse = new House("Concrete", "Red",
                "Cedar Shingle", 30);
        myHouse.doorFunction();
        System.out.println(myHouse.getEntranceDoorColor());
    }

    // import com.fundamentals.practice.HousePhone;
    public static void phoneExample() {
        int[] keys = {0,1,2,3,4,5,6,7,8,9};
        HousePhone myTelephone = new HousePhone(7, keys, 0, "LCD");
        myTelephone.sendCall();
    }

}
