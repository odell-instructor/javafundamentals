package com.fundamentals.lessons;

import java.text.DecimalFormat;

/* Lesson 11 - Using Static */
/* Static members are called directly
* rather than from an instance variable.*/
public class Lesson11 {

    static final int FREEZING = 32;
    static final double KELVIN_UNIT = 273.15;

    static int num;
    static String word;

    static {
        num = 97;
        word = "Sample";
        System.out.println("Static Block 1 " +
                num + " " + word);
    }
    static {
        //num = 42;
        System.out.println("Static Block 2 " +
                num + " " + word);
        for(int i = 0; i < num; i++) {
            if(i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static double celsiusToFahrenheit(double celsius) {
        double total = (celsius * 9 / 5) + FREEZING;
        return refineResult(total);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double total = (fahrenheit - FREEZING) * 5 / 9;
        double total2 = (fahrenheit - FREEZING) / 1.8;
        return refineResult(total2);
    }

    public static double celsiusToKelvin(double celsius) {
        return refineResult(celsius + KELVIN_UNIT);
    }

    public static double kelvinToCelsius(double kelvin) {
        return refineResult(kelvin - KELVIN_UNIT);
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double total = (fahrenheit - FREEZING) * 5 / 9 + KELVIN_UNIT;
        double total2 = fahrenheitToCelsius(fahrenheit) + KELVIN_UNIT;
        return refineResult(total2);
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double total1 = kelvinToCelsius(kelvin);
        return refineResult(celsiusToFahrenheit(total1));
    }

    public static double refineResult(double value) {
        DecimalFormat decForm = new DecimalFormat("0.0");
        return Double.parseDouble(decForm.format(value)) ;
    }

    public static void main(String[] args) {
       // word = "Something";
       // System.out.println(word);
       // System.out.println(FREEZING);
        System.out.println(celsiusToFahrenheit(45.4));
        System.out.println(fahrenheitToCelsius(98.6));
        System.out.println(fahrenheitToCelsius(113.72));
        System.out.println(celsiusToKelvin(35.6));
        System.out.println(kelvinToCelsius(308.8));
        System.out.println(fahrenheitToKelvin(73.4));
        System.out.println(kelvinToFahrenheit(296.1));
    }

} // end class
