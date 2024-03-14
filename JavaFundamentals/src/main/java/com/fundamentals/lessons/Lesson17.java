package com.fundamentals.lessons;

import com.fundamentals.practice.Week;

/* Lesson 17 - Enumerations */
public class Lesson17 {
    // Enum within the class
    public enum IceCreamFlavors { VANILLA, CHOCOLATE,
        STRAWBERRY, ROCKY_ROAD }

    public void showEnum() {
        Week day = Week.WED;
        System.out.println(day);
        System.out.println(IceCreamFlavors.STRAWBERRY);
        System.out.println(Week.THU);
    }

    /* Use enum for switches */
    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String msg = "My favorite flavor is ";
        switch(flavors) {
            case VANILLA:
                msg += "Vanilla";
                break;
            case CHOCOLATE:
                msg += "Chocolate";
                break;
            case STRAWBERRY:
                msg += "Strawberry";
                break;
            default:
                msg += "Rocky Road";
        }
        System.out.println(msg);
    }

    public void valueOrdinal() {
        Week[] week = Week.values();
        for(Week day : week) {
            System.out.println(day + " at index " + day.ordinal());
        }
        System.out.println(Week.valueOf("WED"));
    }

    public void showEnumMethod() {
        Week day = Week.WED;
        System.out.println(day);
        day.weekMethod();
    }

    public void showEnumValues() {
        Week[] days = Week.values();
        for(Week day : days) {
            System.out.println("Week name " + day.name() +
                    " Week #: " + day.getDayNum());
        }
    }

    public static void main(String[] args ){
        Lesson17 my17 = new Lesson17();
        //my17.showEnum();
        //my17.myFavoriteFlavor(IceCreamFlavors.ROCKY_ROAD);
        //my17.valueOrdinal();
        // my17.showEnumMethod();
        my17.showEnumValues();
    }

}
