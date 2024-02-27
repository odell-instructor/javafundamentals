package com.fundamentals.lessons;

/* Lesson 8 - Looping Statements */
/* Looping statements require 3 key factors:
* 1. Initialized value
* 2. The Condition to be checked
* 3. The increment or decrement.*/
public class Lesson8 {

    /* The While loop */
    public void aLittleWhileLoop(int total) {
        int num = 0; // initialize value
        while(num <= total) { // condition
            System.out.println(num + ", ");
            num++; // increment
        } // end while
    } // end method

    public void countdown() {
        int count = 10;
        while(count >= 0) {
            System.out.print(count + ", ");
            count--;
        } // end while
    } // end method

    /* Do while loop - The code block is
    * executed once prior to checking the condition. */
    public void aDoWhileLoop() {
        int start = 0;
        do {
            if(start % 2 == 0) {
                System.out.print(start + " ");
            } // end if
            start++;
        } while(start <= 20); // end do while
    } // end method

    /* For loop - A more compact way of doing loops. */
    public void aForLoop(int total) {
        for(int i = 0; i < total; i++) {
            System.out.print(i + " ");
        } // end for
    } // end method

    /* Looping within another loop */
    public void multiLoop(int first, int second) {
        for(int i = 0; i < first; i++) {
            for(int j = 0; j < second; j++) {
                System.out.print("(" + i + "," + j + ")");
            } // end inner loop
            System.out.println();
        } // end outer loop
    } // end method

    /* Branching */
    public void branchingExample() {
        for(int i = 0; i < 6; i++) {
            if(i == 2) {
                continue;
            } // end if
            if(i == 4) {
                System.out.println("The loop ends");
                break;
            } // end if
            if(i == 3) {
                System.out.println("Three");
            } else {
                System.out.println(i);
            } // end if/else
        } // end for
    } // end method


    public static void main(String[] args) {
        Lesson8 myLesson = new Lesson8();
        // myLesson.aLittleWhileLoop(10);
        // myLesson.countdown();
        // myLesson.aDoWhileLoop();
        // myLesson.aForLoop(14);
        // myLesson.multiLoop(5, 3);
        myLesson.branchingExample();
    }

} // end class
