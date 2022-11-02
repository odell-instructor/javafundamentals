package com.fundamentals.practice;

import com.fundamentals.java.Lesson4;

import java.util.Arrays;

public class PracticeMain {

    public static void main(String[] args) {
        //modifiers();
        //lessonsReference();
        // exampleVarArgs();
        // operators();
        // looping();
        // beer();
       // math();
       // dogRecord();
       // polyShapes();
        carStuff();
    }

    // inheritance demo
    public static void carStuff() {
        SportsCar theCar = new SportsCar();
        System.out.println(theCar.getHeadLightType());
        System.out.println(theCar.getExteriorColor());

        SportsCar otherSport = new SportsCar("LED light");
        System.out.println(otherSport.getHeadLightType());
        System.out.println(otherSport.getHorsePower());
        System.out.println(otherSport.getExteriorColor());
        //theCar.carShape();
        //theCar.setExteriorColor("White");
        //theCar.setHorsePower(300);
        //theCar.setWheelSize(17);

        MuscleCar myCar = new MuscleCar(3, 19, 445, "Green", "Round");
        System.out.println(myCar.getExteriorColor());
        System.out.println(myCar.getHorsePower());
        //myCar.carShape(); // parent
        myCar.motion(70); // grand parent
        //myCar.setExteriorColor("Black");
       // myCar.setHorsePower(500);
       // myCar.setWheelSize(20);

        Car myOther = new MuscleCar();
        //myOther.carShape(); // can not see method from sportscar
        myOther.motion(55);
    }

    public static void polyShapes() {
        Pentagon pent1 = new Pentagon();
        double angle1 = pent1.interiorAngleCalc();
        System.out.println(angle1);

        Hexagon hex1 = new Hexagon();
        double angle2 = hex1.interiorAngleCalc();
        System.out.println(angle2);

        Polygon poly1 = new Pentagon();
        double angle3 = poly1.interiorAngleCalc();
        System.out.println(angle3);
    }


    public static void dogRecord() {
        Dog myDog = new Dog(3, "Lab", 8);

        System.out.println(myDog.breed());
        myDog.move();
    }

    public static void math() {
        OperatorsPractice practice = new OperatorsPractice();
        practice.mathStuff(23,5);
    }

    public static void beer() {
        BottlesOfBeer beer = new BottlesOfBeer();
        beer.beerSong();
    }

    public static void looping() {
        LoopingPractice practice = new LoopingPractice();
        practice.loopFive(100);
        practice.loopFiveTwo();
        practice.loopPrime();
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
