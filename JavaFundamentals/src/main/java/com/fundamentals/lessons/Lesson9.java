package com.fundamentals.lessons;

/* Lesson 9 - Arrays */
/* Arrays can have data that consists of objects
* and primitive data types. */
public class Lesson9 {

    /* An array of int values */
    public void basicIntArray() {
        int[] intArray = {23,45,12,8,92,103,37};
        for(int i = 0; i < intArray.length; i++) {
            if(i == (intArray.length - 1)) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ",");
            }
        } // end for loop
    } // end method

    /* An array of string values */
    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "Happy";
        stringArray[1] = "Tuesday";
        stringArray[2] = "Movie";
        stringArray[3] = "Day";
        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        } // end for loop
    } // end method

    /* Enhanced for loop or foreach loop */
    public void enhancedForLoop() {
        int[] intArray = {23,45,4,12,92,103,37};
        for(int number : intArray) {
            System.out.println(number);
        } // end for loop
    } // end method

    /* Two-Dimensional Array */
    public void aTwoDimensionalArray() {
        int[][] myArray = {{23,45} , {35,46} ,
                {57,98} , {32,48}};
        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.println("[" +i+ "]"+"[" +j+ "] = " +
                      myArray[i][j]);
                //System.out.println(myArray[i][0] + " " + myArray[i][1]);
            } // end inner loop
        } // end outer loop
    } // end method

    /* Enhanced for loop 2D Array */
    public void anEnhanced2DArray() {
        int[][] otherArray = {{32,54} , {53,64} ,
                {75,89} , {23,84}};
        for(int[] ints : otherArray) {
            for(int anInt : ints) {
                System.out.print(anInt + ",");
            } // end inner for loop
        } // end outer for loop
    } // end method

    /* Three-dimensional Array */
    public void aThreeDArray() {
        int[][][] threeD = {
                {{10, 11}, {12, 13}},
                {{14, 15}, {16, 17}}
        };
        for(int a = 0; a < threeD.length; a++) {
            for(int b = 0; b < threeD[a].length; b++) {
                for(int c = 0; c < threeD[b].length; c++) {
                    System.out.println("["+a+"]["+b+"]["+c+"] = "
                            + threeD[a][b][c]);
                } // end inner inner for loop
            } // end inner for loop
        } // end outer for loop
    } // end method

    /* Jagged Array */
    public void aJaggedArray() {
        String[][] strArray = new String[1][3];
        strArray[0][0] = "Feb";
        strArray[0][1] = "Mar";
        strArray[0][2] = "Apr";
        for(String[] first : strArray) {
            for(String value : first) {
                System.out.println(value);
            } // end inner for loop
        } // end outer for loop
    } // end method

    public static void main(String[] args) {
        Lesson9 myLesson = new Lesson9();
        // myLesson.basicIntArray();
        //myLesson.basicStringArray();
        //myLesson.enhancedForLoop();
        //myLesson.aTwoDimensionalArray();
        // myLesson.anEnhanced2DArray();
        //myLesson.aThreeDArray();
        myLesson.aJaggedArray();
    }

} // end class
