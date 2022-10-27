package com.fundamentals.java;

/* Arrays */
public class Lesson9 {

    // An array of int values
    public void basicIntArray() {
        int[] intArray = {23,45,12,8,92,103,37};
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        } // end for loop
    } // end method

    // An array of strings
    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "Happy";
        stringArray[1] = "Monday";
        stringArray[2] = "Movie";
        stringArray[3] = "Day";

        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        } // end for loop

    } // end method

    public void enhancedForArray() {
        int[] intArray = {23,45,12,8,92,103,37};

        for(int number : intArray) {
            System.out.println(number);
        } // end enhanced for

    } // end method

    /* Two-Dimensional Array */
    public void basicTwoDimensionalArray() {
        int[][] myArray = {{23, 45} , {35, 46} , {57, 98} , {32,48} };

        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.println("["+i+"]"+"["+j+"] = " + myArray[i][j]);
            } // end inner foor
        } // end outer for

        System.out.println();

        for (int[] ints : myArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " , ");
            } // end inner foor
        } // end outer for
    } // end method

    /* Three-Dimensional Array */
    public void basicThreeDimensionalArray() {
        int[][][] threeD = {
                {{10,12},{13,14}},
                {{15,16},{17,18}}
        };

        for(int i = 0; i < threeD.length; i++) {
            for(int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[j].length; k++) {
                    System.out.println("["+i+"]"+"["+j+"]"+"["+k+"] = " +threeD[i][j][k]);
                } // end inner inner for
            } // end inner for
        } // end outer for

    } // end method

    /* Jagged Array */
    public void basicJaggedArray() {
        String[][] strArray = new String[1][3];
        strArray[0][0] = "June";
        strArray[0][1] = "July";
        strArray[0][2] = "August";

        for(String[] first : strArray) {
            for(String value : first) {
                System.out.println(value);
            } // end inner for
        } // end outer for
    } // end method


} // end class
