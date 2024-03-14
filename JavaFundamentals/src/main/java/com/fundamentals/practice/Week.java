package com.fundamentals.practice;

public enum Week {
    SUN(2), MON(4), TUE(6), WED(8), THU(10), FRI(12), SAT(14);

    final int dayNum;

    Week(int value) {
        dayNum = value;
        //System.out.println("Constructor called.");
    }

    public int getDayNum() { return dayNum; }

    public void weekMethod() {
        System.out.println("Method inside an Enum");
    }
}
