package com.fundamentals.lessons;

/* Lesson 5: Primitive Data types */
/* These data types don't share state like objects. */
public class Lesson5 {

    /* This primitive type has a value range of
    * -128 to 127. The class version of this primitive
    * is Byte. */
    byte myByte = 9;

    /* This primitive type has a value range of
    * -32768 to 32767. The class version of this primitive
    * is Short. */
    short myShort = 235;

    /* This primitive type has a value range of
    * -2,147,483,648 to 2,147,483,647. The class version
    * of this primitive is Integer. */
    int myInt = 2354;

    /* This primitive type has a value range of
    * -9,223,372,036,854,775,808 to 9,233,372,036,854,775,807.
    * The suffix of L or l is needed to separate it from int.
    * The class version of this primitive is Long. */
    long myLong = 56864L;

    /* This primitive type value range of 3.4E-38 to 3.4E+38
    * The suffix of f or F is needed to separate it from double.
    * The class version of this primitive is Float. */
    float myFloat = 34.53F;

    /* This primitive type value range of 1.7E-308 to 1.7+304.
    * The suffix of d or D is optional. The class version of
    * this primitive is Double. */
    double myDouble = 84.98;
    double myOtherDouble = 36.43d;

    // Scientific Notation
    double myNotation = 23.65E8;

    /* Numeric Systems */
    // Decimal value of 26;
    int myDecimal = 26;

    // Binary value of 26;
    short myBinary = 0b11010;

    // Hexadecimal value of 26;
    byte myHexadecimal = 0x1a;

    // Use underscore to make numbers readable
    long usingUnderscores = 4_568_987_367L;

    // A method that shows a local variable
    public void showLocalExample() {
        double pi = 3.14;
        // below variable also created at the class level.
        double myDouble = 43.22;
        System.out.println(pi);
        // uses local scope over instance scope at method level.
        System.out.println(myDouble);
    }

    // A method that shows an Instance variable
    public int showInstanceExample() {
        // uses instance variable at class level
        System.out.println(myDouble);
        return myDecimal;
    }

    /* Data type conversion is the concept of
    * converting between different primitive data types.
    * When going from a floating point number to a whole
    * number value, there is no rounding. The value is
    * truncated.*/

    /* Implicit or Widening type conversion is done when
    * two data types automatically convert. */
    public void convertDirectly(long num2) {
        long converted = myInt;
        float value = num2;
        short small = myByte;
        System.out.println("My samples are " +
                converted + " & " + value);
        System.out.println("My small is " + small);
    }

    /* Explicit or Narrowing type conversion is done
    * when two data types convert, but require a direct
    * boxing affect. This is because a larger data
    * type is converting to a smaller one, which will have
    * precision loss. */
    public void convertExplicitly() {
        long sample2 = (long)myDouble; //84.98
        // 4_568_987_367L
        int sample3 = (int)usingUnderscores;
        byte sample4 = (byte)myFloat; // 34.53
        System.out.println("My sample2 = " + sample2);
        System.out.println("My sample3 = " + sample3);
        System.out.println("My sample4 = " + sample4);
    }

    public static void main(String[] args) {
        Lesson5 myLesson = new Lesson5();
        //myLesson.showLocalExample();
        //int value = myLesson.showInstanceExample();
        //System.out.println(value);
        //System.out.println(myLesson.usingUnderscores);
        //System.out.println(myLesson.myBinary);
        //System.out.println(myLesson.myHexadecimal);
        myLesson.convertDirectly(myLesson.myLong);
        myLesson.convertExplicitly();
    }


} // end class
