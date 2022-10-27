package com.fundamentals.java;

import java.util.*;
import java.util.function.BiConsumer;

/* Collections Framework */
public class Lesson10 {

    /* ArrayList */
    public void stringArrayList() {
        List<String> myList = new ArrayList<>();
        myList.add("Happy");
        myList.add("Tuesday");
        myList.add("Not Monday");
        myList.add("Where's Friday");

        System.out.println(myList.get(2));
        System.out.println(myList.contains("Not Monday"));
        System.out.println(myList.size());

        for(String day : myList) {
            //System.out.println(day);
            if(day.contains("day")) {
                System.out.println(day);
            }
        }
    }

    public ArrayList<House> myHouseList(int count) {
        ArrayList<House> houses = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            houses.add(i, new House());
        }
        return houses;
    }

    /* HashSet */
    public void exampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        myHash.add("Quarter Stick");
        myHash.add("Smoke Bombs");
        myHash.add("Mortars");

        Iterator<String> init = myHash.iterator();
        while(init.hasNext()) {
            System.out.println(init.next());
        }

        System.out.println();
        for(String fun : myHash) {
            System.out.println(fun.hashCode());
        }

    }

    /* HashMap */
    public void exampleHashMap() {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(15, "Days");
        myMap.put(20, "Are Here");
        myMap.put(25, "Happy");

        for(Map.Entry<Integer, String> beta : myMap.entrySet()) {
            System.out.println(beta.getKey() + " - " + beta.getValue());

        }
    }

    /* LinkedList */
    /* Part of the Queue interface */
    public void exampleLinkedList() {
        Queue<String> myLinkedQueue = new LinkedList<>();
        myLinkedQueue.add("Pasta");
        myLinkedQueue.add("Alfredo");
        myLinkedQueue.add("Spaghetti");
        myLinkedQueue.add("Macaroni");
        myLinkedQueue.add("Linguini");
        myLinkedQueue.add("Egg Noodle");

        String something = myLinkedQueue.peek();
         String other = myLinkedQueue.poll();

        System.out.println("This keeps "+ something + " and this removes "+other );

        Iterator<String> myPasta = myLinkedQueue.iterator();
        while(myPasta.hasNext()) {
            System.out.println(myPasta.next());
        }
        System.out.println();
        for(String food : myLinkedQueue) {
            System.out.println(food);
        }
    }

}
