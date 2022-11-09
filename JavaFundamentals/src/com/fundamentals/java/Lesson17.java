package com.fundamentals.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lesson17 {

    public void noLamda() {
        SomeInterface some = new SomeInterface() {
            @Override
            public void someRealMethod() {
                System.out.println("My real something");
            }
        };
        some.someRealMethod();
    }

    public void withLambda() {
        SomeInterface withMe = () -> {
            System.out.println("My true something");
        };
        withMe.someRealMethod();
    }

    public void multiplesLambda() {
        // using parameter declaration
        SimpleAdditionInterface simple1 = (able, beta) -> (able + beta);
        System.out.println(simple1.add(20, 30));

        // using data type declaration
        SimpleAdditionInterface simple2 = (int alpha, int bravo) -> (alpha + bravo);
        System.out.println(simple2.add(10, 15));
    }

    public void listLambda() {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");

        list.forEach((value) -> System.out.println(value));
    }

    public void filterLambda() {
        ArrayList<House> houses = getHouseList();
        Stream<House> filterHouses =
                houses.stream().filter(myChoice -> myChoice.getDoorColor() == "Red");

        filterHouses.forEach(house -> System.out.println("Selections " + house.toString()));
    }

    public void company1000() {
        ArrayList<CompanyInfo> my1k = getInfo();
        for(CompanyInfo me : my1k) {
            if(me.getId() < 2000) {
                System.out.println(me);
            }
        }
    }

    public void company2000() {
        ArrayList<CompanyInfo> my2k = getInfo();
        for(CompanyInfo me2 : my2k) {
            if(me2.getId() >= 2000) {
                System.out.println(me2);
            }
        }
    }

    public void queryInfo(ArrayList<CompanyInfo> company, Predicate<CompanyInfo> expr) {
        ArrayList<CompanyInfo> result = new ArrayList<>();
        for(CompanyInfo info: company) {
            if(expr.test(info)) {
                result.add(info);
            }
        }
        result.forEach(person -> System.out.println(person));
    }


    private ArrayList<House> getHouseList() {
        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House("Concrete", "Shingle"));
        houseList.add(new House("Wood", "Cedar", "Blue", 30));
        houseList.add(new House("Dirt", "Mud"));
        houseList.add(new House("Concrete", "Cedar", "Green", 35));
        houseList.add(new House());
        houseList.add(new House("Concrete", "Steel"));
        houseList.add(new House());
        houseList.add(new House("Dirt", "Mud", "Brown", 25));
        houseList.add(new House());

        return houseList;
    }

    public static ArrayList<CompanyInfo> getInfo() {
        ArrayList<CompanyInfo> info = new ArrayList<>();
        info.add(new CompanyInfo(1000, "John"));
        info.add(new CompanyInfo(1100, "Jane"));
        info.add(new CompanyInfo(1200, "Debra"));
        info.add(new CompanyInfo(2000, "Paul"));
        info.add(new CompanyInfo(2100, "Mike"));
        info.add(new CompanyInfo(2200, "Amy"));
        info.add(new CompanyInfo(1300, "Kate"));

        return info;
    }

}
