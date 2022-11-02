package com.fundamentals.practice;

public record Dog(int furLength, String breed, int tailLength) {

    public void move() {
        System.out.println("I run fast");
    }
}
