package com.fundamentals.lessons;

import java.util.Scanner;

/* Lesson 6 - Using Operators */
public class Lesson6 {

    int sum1 = 23, sum2 = 45;

    /* Arithmetic Operators
    * Math is performed from left to right. */
    public void basicMath() {
        System.out.println(sum1 + sum2);
        System.out.println(sum2 - sum1);
        System.out.println(sum1 * sum2);
        System.out.println(sum2 / sum1);
    }

    public void justTheRemainder(int num) {
        int total = sum2 % num;
        System.out.println(total);
    }

    /* Using PEMDAS to get answer */
    public double mathOrder() {
        double total1 = (20 - 42) / 3.7 + 8.2 * 19 - 32;
        double total2 = 20 - 42 / (3.7 + 8.2) * 19 - 32;
        System.out.println(total1);
        return total2;
    }

    /* Using Scanner to get user input */
    public void addSomeNumbers() {
        int num1, num2, total;
        System.out.println("Enter two integers to " +
                "calculate their sum");
        Scanner userInput = new Scanner(System.in);
        num1 = userInput.nextInt();
        num2 = userInput.nextInt();
        total = num1 + num2;
        System.out.println("The total of the problem is " + total);
    }

    /* Assignment Operators */
    public void demoAssignment(int able, int may) {
        able += may;
        System.out.println("+= operator " + able);
        may -= able;
        System.out.println("-= operator " + may);
        able *= may;
        System.out.println("*= operator " + able);
        able /= may;
        System.out.println("/= operator " + able);
        may %= able;
        System.out.println("%= operator " + may);
    }

    /* Relational Operators - Values return a boolean answer.*/
    public void demoRelationalEquals(int valueA, int valueB) {
        boolean isEqual = (valueA == valueB);
        boolean isNot = (valueA != valueB);
        System.out.println("isEqual " + isEqual);
        System.out.println("isNot " + isNot);
    }

    public void demoRelationalGreater(int valueC, int valueD) {
        boolean isGreater = (valueC > valueD);
        boolean isLess = (valueD <= valueC);
        System.out.println("isGreater " + isGreater);
        System.out.println("isLess " + isLess);
    }

    /* Compare equal() with == */
    public void compareEquals() {
        String name = new String("Dave");
        String name2 = new String("Dave");
        String name3 = name2;

        boolean isEqualOperator = (name == name2);
        boolean isOtherEqualOperator = (name2 == name3);
        System.out.println("== " + isEqualOperator);
        System.out.println("== w/name3 " + isOtherEqualOperator);
        boolean isEqualMethod = name2.equals(name3);
        boolean isEqualCompare = name.equals(name2);
        System.out.println("isEqualMethod " + isEqualMethod);
        System.out.println("IsEqualCompare " + isEqualCompare);
    }

    /* Logical Operators */
    /* The logical && means that both conditions
    * must be true for the result to be true. */
    public void demoLogicalAnd(int num1, int num2, int num3) {
        boolean answer = (num1 != num2) && (num3 > num2);
        System.out.println("Logical Operator And (&&) " + answer);
    }

    /* The logical || means that only 1 condition
    * must be true for the result to be true */
    public void demoLogicalOr(int num4, int num5, int num6) {
        boolean answer = (num4 != num5) || (num6 > num4);
        System.out.println("Logical Operator Or (||) " + answer);
    }

    /* Increment Operator */
    public void makeMeIncrease() {
        int able = 10, num1, num2;

        /* Post Increment - Value is computed then incremented */
        num1 = able++; // post increment
        System.out.println(able); // 11
        System.out.println(num1); // 10

        /* Pre Increment - Value is incremented then computed */
        num2 = ++able;
        System.out.println(able); // 12
        System.out.println(num2); // 12
    }

    /* Decrement Operator */
    public void makeMeDecrease() {
        int beta = 10, value1, value2;

        /* Post Decrement - Value is computed, then decremented */
        value1 = beta--;
        System.out.println(value1); //10
        System.out.println(beta); //  9

        /* Pre Decrement - Value is decremented, then computed */
        value2 = --beta;
        System.out.println(value2); // 8
        System.out.println(beta);   // 8
    }

    public static void main(String[] args) {
        Lesson6 myLesson = new Lesson6();
        // myLesson.basicMath();
        // myLesson.justTheRemainder(7);
       // double total = myLesson.mathOrder();
        //System.out.println(total);
        //myLesson.addSomeNumbers();
        // myLesson.demoAssignment(20, 6);
        //myLesson.demoRelationalEquals(225, 58);
        //myLesson.demoRelationalGreater(17, 38);
        //myLesson.compareEquals();
        //myLesson.demoLogicalAnd(5, 10, 15);
        //myLesson.demoLogicalOr(5, 10, 15);
        // myLesson.makeMeIncrease();
        myLesson.makeMeDecrease();
    }

} // end class
