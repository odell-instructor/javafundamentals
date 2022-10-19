package com.fundamentals.practice;

import com.fundamentals.java.Lesson4;

import java.util.Arrays;

public class PracticeMain {

    public static void main(String[] args) {
        //modifiers();
        //lessonsReference();
        // exampleVarArgs();
        operators();
    }

    public static void operators() {
        OperatorsPractice practice = new OperatorsPractice();
        practice.solveProblem();
    }

    public static void modifiers() {
        ModifierPractice practice = new ModifierPractice();
        practice.exampleDefault();
        System.out.println(practice.message);

        practice.exampleProtected("Matt");
        System.out.println(practice.letter);
    }

    public static void lessonsReference() {
        Lesson4 lesson4 = new Lesson4();
        lesson4.sampleMethods();
    }

    public static void exampleVarArgs() {
        singleVarArg("Happy", "Thursda", "Weekend");
        singleVarArg("Try me");
        singleVarArg();
    } // end method

    public static void singleVarArg(String... value) {
        System.out.println(Arrays.toString(value));
        for(String s : value) {
            System.out.println(s);
        } // end for
    } // end method
} // end class
