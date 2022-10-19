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

}
