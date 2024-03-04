package com.fundamentals.lessons;

import java.util.*;

/* Lesson 10 - The Collections framework */
public class Lesson10 {

    /* ArrayList */
    /* Non-Generic ArrayList
    * ArrayList obj = new ArrayList();
    *
    * Generic ArrayList
    * ArrayList<E> obj2 = new ArrayList<>();
    * E - Represents a generic object type.*/
    public ArrayList<String> stringArrayList() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Happy");
        myList.add("Wednesday");
        myList.add("Not Monday");
        myList.add("Where's Friday?");

        // get specific element
        System.out.println(myList.get(2));
        // contains
        System.out.println(myList.contains("Not Monday"));
        // size
        System.out.println(myList.size());
        return myList;
    }

    public void showArrayList(ArrayList<String> days) {
        for(String day : days) {
            System.out.println(day);
        } // end for loop
    } // end method

    public void iAmEven(int total) {
        HashSet<Integer> evenSet = new HashSet<>();
        for(int i = 0; i < total; i++) {
            if(i % 2 == 0) {
                evenSet.add(i);
            } // end if
        } // end for

        for(int values : evenSet) {
            System.out.print(values +" ");
        } // end for
    } // end method


    /* HashSet */
    public void aHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        myHash.add("Quarter Stick");
        myHash.add("Smoke Bombs");
        myHash.add("Mortars");

        // Using iterator
        Iterator<String> init = myHash.iterator();
        while(init.hasNext()) {
            System.out.println(init.next());
        }
        System.out.println();
        // enhanced for loop version
        for(String fun : myHash) {
            System.out.println(fun.hashCode() + " - " + fun);
        }
    }

    /* HashMap - Key / value pairs */
    public void daysHashMap() {
        HashMap<Integer, String> days = new HashMap<>();
        days.put(100, "Sunday");
        days.put(200, "Monday");
        days.put(300, "Tuesday");
        days.put(400, "Wednesday");
        days.put(500, "Thursday");
        days.put(600, "Friday");
        days.put(700, "Saturday");

        for(HashMap.Entry<Integer, String> day : days.entrySet()){
            System.out.println(day.getKey() + "-" + day.getValue());
        } // end for loop
    } // end method

    /* LinkedList as part of the Queue Interface */
    public void pastaList() {
        LinkedList<String> pastaChoices = new LinkedList<>();
        pastaChoices.add("Pasta");
        pastaChoices.add("Alfredo");
        pastaChoices.add("Spaghetti");
        pastaChoices.add("Macaroni");
        pastaChoices.add("Linguini");
        pastaChoices.add("Egg Noodle");

        // peek looks at the list, but doesn't remove anything.
        String peekPasta = pastaChoices.peek();
        // poll assign element then remove it from the collection.
        String pollPasta = pastaChoices.poll();
        System.out.println("This keeps "+peekPasta);
        System.out.println("This removes "+pollPasta);

        for(String food : pastaChoices) {
            System.out.println(food);
        } // end for loop
    } // end method


    public static void main(String[] args) {
        Lesson10 myLesson = new Lesson10();
        // myLesson.showArrayList(myLesson.stringArrayList());
        // myLesson.aHashSet();
        //myLesson.daysHashMap();
        //myLesson.pastaList();
        myLesson.iAmEven(20);
    }

} // end class
