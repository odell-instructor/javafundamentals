package com.fundamentals.java;

import java.text.DecimalFormat;

public class Lesson11 {
    private static final int FREEZING = 32;
    private static final double KELVIN_UNIT = 273.15;

    static int num;
    static String word;

    static {
        num = 97;
        word = "Sample";
        System.out.println("Static block 1 " + num + " " + word);
    }

    static {
        num = 101;
        System.out.println("Static Block 2 "+ num + " "+ word);
    }

    // default constructor
    private Lesson11() { }

    public static double celsiusToFahrenheit(double celsius) {
        double preTotal = (celsius * 9 / 5) + FREEZING;
        return refineResult(preTotal);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double preTotal = (fahrenheit - FREEZING) * 5 / 9;
        return refineResult(preTotal);
    }

    public static double celsiusToKelvin(double celsius) {
        return refineResult(celsius + KELVIN_UNIT);
    }

    public static double kelvinToCelsius(double kelvin) {
        return refineResult(kelvin - KELVIN_UNIT);
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double preTotal = (fahrenheit - FREEZING) * 5 / 9 + KELVIN_UNIT;
        return refineResult(preTotal);
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double preTotal = (kelvin - KELVIN_UNIT) * 9 / 5 + FREEZING;
        return refineResult(preTotal);
    }

    private static double refineResult(double value) {
        DecimalFormat decForm = new DecimalFormat("0.00");
        return Double.parseDouble(decForm.format(value));
    }

}
