package com.fundamentals.lessons;

import com.fundamentals.main.House;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Exception Handling */
public class Lesson18 {
    House ranch;

    /* Throws */
    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getTotalWindows());
    }

    /* Throw */
    public void throwHouse(House house) {
        if(house == null) {
            throw new NullPointerException("House object is null");
        } else  {
            System.out.println(house.getTotalWindows());
        }
    }

    /* Using try / catch with Scanner*/
    public void addNumbersV2() {
        int num1 = 0, num2 = 0, total;
        System.out.println("Enter two integers to" +
                " calculate their sum.");
        Scanner userInput = new Scanner(System.in);
        try {
            num1 = userInput.nextInt();
            num2 = userInput.nextInt();
            total = num1 + num2;
            System.out.println("The total of the problem is " + total);
        } catch(InputMismatchException ime) {
            System.out.println("Please enter numeric values. Not words");
        }
    }

    /* Finally block */
    public void exampleFinally() {
        try {
            ranch = new House();
            System.out.println(ranch.getTotalWindows());
        } catch(NullPointerException npe) {
            System.out.println("Null pointer called " + npe.getMessage());
        } finally {
            System.out.println("The finally block was called.");
        } // end try/catch/finally
    } // end method

    /* More than 1 catch */
    public void myArrayException() {
        String[] names = {"Dave", "Matt", "Jody" };
        String[] values = {"243", "429", "542"};
        try {
            byte value = Byte.parseByte(values[1]);
            System.out.println(value);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide a proper index value");
        } catch(NumberFormatException nfe) {
            System.out.println("This is not a correct number.");
        } catch(StackOverflowError soe) {
            System.out.println("You have given me more than a byte.");
        } catch(Exception ex) {
            System.out.println("I dunno what you did " + ex.getMessage());
        }
    }


    public static void main(String[] args) {
        Lesson18 my18 = new Lesson18();
        //my18.exampleThrows();
        //my18.throwHouse(my18.ranch);
        // my18.addNumbersV2();
        //my18.exampleFinally();
        my18.myArrayException();
    }

}
