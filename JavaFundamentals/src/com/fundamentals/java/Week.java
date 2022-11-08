package com.fundamentals.java;

public enum Week {
    SUN(2), MON(4), TUE(6), WED(8), THU(10), FRI(12), SAT(14);

    private final int dayNum;

    private Week(int val) {
        this.dayNum = val;
        //System.out.println("Constructor called for " + this.toString());
    }

    public int getDayNum() { return dayNum; }

    public void someEnumMethod() {
        System.out.println("Method inside an Enum");
    }
}
