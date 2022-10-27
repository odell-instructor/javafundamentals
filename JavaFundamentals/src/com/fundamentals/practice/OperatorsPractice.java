package com.fundamentals.practice;

public class OperatorsPractice {

    /*
    * Assigning the below math problem to multiple variables.
    * Use PEMDAS to get the below output
    * 256 + 365 / 10 + 89 - 16
    *
    * answers
    * 243.0
    * 365
    * */
    public void solveProblem() {
        double sum1 = 256 + 365 / (10 + 89) - 16;
        double sum2 = 256 + 365 / 10 + 89 - 16;

        System.out.println(sum1);
        System.out.println(sum2);
    }

    /* The Math class*/
    public void mathStuff(int val, int pow) {
        System.out.println(Math.pow(val, pow));
    }

    public void ohmsLaw(int voltage, int resistance, int current) {
        // figure out which formula to use to solve
        // for either one.
        /*
        * i = v / r    i = current, v = voltage, r = resistance
        * v = i * r
        * r = v / i
        * */
        int total = 0;
        if(voltage <= 0 && resistance > 0 && current > 0) {
            total = current * resistance;
        }
        if(resistance <= 0 && voltage > 0 && current > 0) {
            total = voltage / current;
        }
        if(current <= 0 && voltage > 0 && resistance > 0) {
            total = voltage / resistance;
        }

        System.out.println(total);
    }


}
