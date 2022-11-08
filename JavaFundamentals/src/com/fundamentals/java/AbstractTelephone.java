package com.fundamentals.java;

public abstract class AbstractTelephone implements PhoneInterface {
    private final int volume;
    private final int sendKey;
    private final int[] numberKeys;
    private final String screen;

    public AbstractTelephone(int volume, int sendKey, int[] numberKeys, String screen) {
        this.volume = volume;
        this.sendKey = sendKey;
        this.numberKeys = numberKeys;
        this.screen = screen;
    }

    protected abstract void receiveCall();
    protected abstract void sendCall();

    public void prankCall(PhoneInterface value) {
        System.out.println("What is my " + value);
    }

    @Override
    public void endCall() {
        System.out.println("The call ends.");
    }

    @Override
    public void callerID(String name, int number) {
        System.out.println(name + " - " + number);
    }

    public int getVolume() {
        return volume;
    }

    public int getSendKey() {
        return sendKey;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }

    public String getScreen() {
        return screen;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
