package com.fundamentals.practice;

public class BottlesOfBeer {

    public void beerSong() {
        int bottlesOfBeer = 99;
        String word = "bottles";

        while(bottlesOfBeer > 0) {
            if(bottlesOfBeer == 1) {
                word = "bottle";
            }

            System.out.println(bottlesOfBeer + " " + word + " of Beer on the wall");
            System.out.println(bottlesOfBeer + " "+ word + " of Beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            bottlesOfBeer--;

            if(bottlesOfBeer > 0) {
                System.out.println(bottlesOfBeer + " " + word + " of Beer on the wall");
            } else {
                System.out.println("No more bottles of Beer on the wall.");
            }
            System.out.println();
        }
    }
}
