package com.fundamentals.practice;

public class LoopingPractice {

    /*
    * Write a loop with a total amount of 100.
    * Print out all the numbers divisible by 5.
    * */
    public void loopFive(int total) {
        int val = 0;
        do {
            if(val % 5 == 0) {
                System.out.print(val +" ");
            }
            val++;
        }while(val < total);
    }

    public void loopFiveTwo() {
        System.out.println();
        int able = 0;
        while(able <= 100) {
            if(able % 5 == 0) {
                System.out.print(able + " ");
            }
            able++;
        }
    }

    /* Display the prime numbers */
    public void loopPrime() {
        System.out.println();
        int counter;
        for (int i = 0; i <= 100; i++) {
            counter = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    counter++;
                }
            }
            if(counter == 2) {
                System.out.print(i+ " ");
            }
        }
    }

}
