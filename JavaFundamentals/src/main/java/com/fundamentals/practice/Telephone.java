package com.fundamentals.practice;

/* Lesson 15 Abstract example */
public abstract class Telephone implements EndCallInterface{
    // fields
    private final int volume;
    private final int[] numberKeys;
    private final int sendKey;
    private final String screen;

    public Telephone(int volume, int[] numberKeys,
                     int sendKey, String screen) {
        this.volume = volume;
        this.numberKeys = numberKeys;
        this.sendKey = sendKey;
        this.screen = screen;
    }

    // Add abstract methods
    public abstract void receiveCall();
    public abstract void sendCall();


    public int getVolume() {
        return volume;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }

    public int getSendKey() {
        return sendKey;
    }

    public String getScreen() {
        return screen;
    }
} // end class
