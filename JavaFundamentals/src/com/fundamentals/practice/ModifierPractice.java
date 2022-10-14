package com.fundamentals.practice;

/*
* Access Modifiers specify Accessibility scope
*
* Public means everyone can see it.
* */
public class ModifierPractice {

    private int value1 = 345;
    String message = "Hello";
    protected char letter = 'C';
    public boolean isHere = true;

    private void examplePrivate() {
        System.out.println(value1);
    } // end method

    void exampleDefault() {
        System.out.println(value1 + " is private");
    } // end method

    protected void exampleProtected(String name) {
        System.out.println(name);
    } // end method

    public void examplePublic() {
        System.out.println("I\'m Here");

    } // end method

} // end class
