package com.fundamentals.java;

public class HousePhone extends AbstractTelephone {

    public HousePhone(int volume, int sendKey, int[] numberKeys, String screen) {
        super(volume, sendKey, numberKeys, screen);
    }

    @Override
    protected void receiveCall() {
        System.out.println("Receiving Phone Call");
    }

    @Override
    protected void sendCall() {
        System.out.println("Sending Phone Call");
    }
}
