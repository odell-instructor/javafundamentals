package com.fundamentals.java;

import com.fundamentals.practice.ModifierPractice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // houseExample();
        // lesson3Example();
        // lesson4Example();
        // modifiersExample();
        // lesson5Example();
        // lesson6Example();
        // lesson7Example();
        // lesson8Example();
        // lesson9Example();
        // lesson10Examples();
        // companyExample();
        // System.out.println("Hello Java");
       // lesson11Examples();
        // encapulateHouse();
         condoInheritance();
    } // end method

    public static void condoInheritance() {
        Condo myCondo = new Condo();
        //myCondo.setBalconyType("Small balcony");
        myCondo.doorFunction(); // from house now overridden
        myCondo.maintenance(); // from Condo
        System.out.println(myCondo.getBalconyType());
        // error or a doorcolor?
        System.out.println(myCondo.getDoorColor());
    }

    public static void encapulateHouse() {
        House house1 = new House();
        System.out.println(house1.getFoundationType());
        System.out.println(house1.getRoofStyle());
        System.out.println(house1.getDoorColor());
        System.out.println(house1.getWindowSize());

        House house2 = new House("Concrete","Shingle");
        System.out.println(house2.getDoorColor());
        System.out.println(house2.getWindowSize());

        House house3 = new House("Dirt", "Bamboo", "Tan", 30);
        System.out.println(house3.getFoundationType());
        System.out.println(house3.getRoofStyle());
        house3.doorFunction();
        house3.doorFunction("My door opens short and its color is ");

    }

    public static void lesson11Examples() {
        System.out.println(Lesson11.fahrenheitToCelsius(56));
        System.out.println(Lesson11.celsiusToFahrenheit(13));
        System.out.println(Lesson11.celsiusToKelvin(30));
        System.out.println(Lesson11.kelvinToCelsius(286.64));
        System.out.println(Lesson11.fahrenheitToKelvin(56));
        System.out.println(Lesson11.kelvinToFahrenheit(335.648));
    }

    public static void companyExample() {
        CompanyInfo info = new CompanyInfo();
        info.id = 10101;
        info.name = "Peter Parker";
        info.display();
        CompanyInfo.company = "Daily Bugle";
        info.display();

    }


    public static void lesson10Examples() {
        Lesson10 ten = new Lesson10();
        // ten.stringArrayList();

        ArrayList<House> houseList = ten.myHouseList(5);
        // houseList.get(1).doorColor = "Red";
        for(House house : houseList) {
            //house.doorFunction();
        }

        //ten.exampleHashSet();
        // ten.exampleHashMap();
        ten.exampleLinkedList();

    }

    public static void lesson9Example() {
        Lesson9 lesson9 = new Lesson9();
        //lesson9.basicIntArray();
        //lesson9.basicStringArray();
        //lesson9.enhancedForArray();
        //lesson9.basicTwoDimensionalArray();
        // lesson9.basicThreeDimensionalArray();
        lesson9.basicJaggedArray();
    }


    public static void lesson8Example() {
        Lesson8 lesson8 = new Lesson8();
        lesson8.basicWhileLoop();
        lesson8.countdown();
        lesson8.basicDowWhileLoop(10);
        lesson8.basicForLoop(6);
        lesson8.multiLoop(4, 8);
        lesson8.forLoopStringExample();
        lesson8.basicBranchExample();
    }


    public static void lesson7Example() {
        Lesson7 lesson7 = new Lesson7();
        // lesson7.basicIfStatement(11, 11);
        // lesson7.basicIfElseStatement(10, 15);
         lesson7.mathAndIf(5, 20, 122);
        String result = lesson7.basicIfElseChain(15);
        // System.out.println(result);

        //lesson7.basicIfAndExample(17);
        //lesson7.basicIfOrExample(18);
        //lesson7.basicSwitch(4);
        //lesson7.otherSwitch('t');
        //lesson7.anotherSwitch(4);
        System.out.println(lesson7.patternSwitch(3));

    } // end method

    public static void lesson6Example() {
        Lesson6 lesson6 = new Lesson6();
        // lesson6.basicMath();
        // lesson6.exampleModulus();
        // lesson6.mathOrder();
        // lesson6.addTwoNumbers();
        // lesson6.exampleAssignment();
        // lesson6.exampleRelationalEquals(12, 12);
        // lesson6.exampleRelationGreater(10, 10);
        // lesson6.exampleLogicalAnd(5, 7, 10);
        // lesson6.exampleLogicalOr(10, 10, 15);
        // lesson6.exampleLogicalNot(10, 15);
        // lesson6.exampleIncrement();
        lesson6.exampleDecrement();
    }

    public static void lesson5Example() {
        Lesson5 lesson5 = new Lesson5();
        // lesson5.localDateTimeExample();
        // lesson5.localEpochExample();
        // lesson5.localDateParseExample();
        // lesson5.localDateExample();
        // lesson5.epochDateExample();
        // lesson5.localTimeExample();
        // lesson5.bornDateFormatter();
        lesson5.timePeriodExample();
    }

    public static void modifiersExample() {
        ModifierPractice practice = new ModifierPractice();
       // practice.examplePrivate(); // cannot access because of private modifier
       // practice.exampleDefault(); // cannot access because of default modifier
       // practice.exampleProtected("Matt"); // cannot access because of protected modifer
        practice.examplePublic();
        System.out.println(practice.isHere);
    }

    public static void lesson4Example() {
        Lesson4 myLesson4 = new Lesson4();
        // myLesson4.numericExamples();
        // myLesson4.exponentExample();
        // myLesson4.exampleImplicit();
        // myLesson4.exampleExplicit();
        myLesson4.sampleMethods();
    }


    public static void lesson3Example() {
        Lesson3 myLesson3 = new Lesson3();
        // myLesson3.exampleString();
        // myLesson3.exampleCharAt();
        // myLesson3.exampleConcat();
        // myLesson3.exampleEquals();
        // myLesson3.exampleLower();
        // myLesson3.exampleUpper();
        // myLesson3.exampleLength();
        // System.out.println(myLesson3.exampleReplace());
        // myLesson3.exampleBuilder("Pizza", 3);
        // myLesson3.exampleChar();
        myLesson3.exampleEscape();
    } // end method


    /*
    * This method demonstrates the House class
    * */
    public static void houseExample() {
        House myHouse = new House();
        //myHouse.doorColor = "Red";
        myHouse.setDoorColor("Red");
        myHouse.doorFunction();

        House otherHouse = new House();
        //otherHouse.doorColor = "Yellow";
        myHouse.setDoorColor("Yellow");

        //System.out.println(myHouse.doorColor);
        System.out.println(myHouse.getDoorColor());
        //System.out.println(otherHouse.doorColor);
        System.out.println(otherHouse.getDoorColor());

        House thirdHouse = otherHouse;
        // thirdHouse.doorColor = "Blue";
        thirdHouse.setDoorColor("Blue");

        System.out.println(thirdHouse.getDoorColor());
        System.out.println(otherHouse.getDoorColor());
    } // end method

} // end class
