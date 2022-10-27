package com.fundamentals.java;

/* Looping Statements */
public class Lesson8 {

    public void basicWhileLoop() {
        //initialized value
        int able = 0;
        // condition / expression
        while(able <= 10) {
            // block of code
            System.out.print(able +", ");
            // increment
            able++;
        } // end while
        System.out.println();
    } // end method

    public void countdown() {
        int beta = 10;
        while(beta >= 0) {
            System.out.print(beta +", ");
            beta--;
        }
        System.out.println();
    } // end method

    /* Do while loop */
    public void basicDowWhileLoop(int total) {
        int charlie = 0;
        do {
            if(charlie % 2 == 0) {
                System.out.print(charlie + " ");
            } // end if
            charlie++;
        } while(charlie < total);
        System.out.println();
    } // end method

    /* For loop */
    public void basicForLoop(int total) {
        for(int i = 0; i < total; i++) {
            System.out.print(i + " ");
        } // end for
        System.out.println();
    } // end method

    public void multiLoop(int totalA, int totalB) {
        for (int i = 0; i < totalA; i++) {
            for(int j = 0; j < totalB; j++) {
                System.out.print(i + "," + j);
            }  // end inner loop
        } // end outer loop
    } // end method

    public void forLoopStringExample() {
        System.out.println();
        String delta = "Something";
        for(int i = 0; i < delta.length(); i++) {
            System.out.print(delta.charAt(i) + " ");
        } // end for loop
    } // end method

    public void basicBranchExample() {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            } // end if

            if(i == 4) {
                System.out.println("loop breaks");
                break;
            } // end if

            System.out.println(i);

        } // end for
    } // end method

} // end class
