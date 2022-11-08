package com.fundamentals.java;

/* Enumerations */
public class Lesson16 {
    public enum IceCreamFlavors { VANILA, CHOCOLATE, STRAWBERRY, ROCK_ROAD};

    public void myFavoriteFlavor(IceCreamFlavors flavor) {
        String msg = "My favorite flavor is ";
        switch(flavor) {
            case VANILA:
                msg += IceCreamFlavors.VANILA.toString().toLowerCase();
                break;
            case CHOCOLATE:
                msg += "Chocolate and a little peanut butter.";
                break;
            case STRAWBERRY:
                msg += IceCreamFlavors.STRAWBERRY.toString().toLowerCase();
                break;
            default:
                msg += "Rocky Road";
                break;
        } //
        System.out.println(msg);
    }
}
