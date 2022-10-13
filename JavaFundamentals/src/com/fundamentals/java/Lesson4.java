package com.fundamentals.java;

/* Primitive Data Types */
/* Prmitive data types don't share state like objects. */
public class Lesson4 {

    /* This primitive type has a value range of
    * -128 to 127 */
    byte myByte = 9;

    /* This primitive type has a value range of
    * -32768 to 32767 */
    short myShort = 235;

    /* This primitive type has a value range of
    * -2,147,483,648 to 2,147,483,647 */
    int myInt = 2354;

    /* This primitive type has a value range of
    * -9,223,372,036,854,774,808 to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    /* This primitive type has a value range of
    * 3.4E-38 to 3.4E+38 */
    float myFloat = 34.53f;

    /* This primitive type has a value range of
    * 1.7E-308 to 1.7E+308*/
    double myDouble = 84.98d;
    double myOther = 36.43;

    /* Numberic Systems */

    // Decimal value of 26
    int myDecimal = 26;

    // Hexadecimal value of 26
    int myHexadecimal = 0x1a;

    // Binary value of 26
    int myBinary = 0b11010;

    // Octal value of 26
    int myOctal = 032;

    public void numericExamples() {
        System.out.println("Decimal "+myDecimal);
        System.out.println("Hexadecimal "+myHexadecimal);
        System.out.println("Binary "+myBinary);
        System.out.println("Octal "+myOctal);
    } //end method

    // Scientific Notation
    double myExonent = 23.65E8;  // 2,365,000,000
    double myOtherExponent = 10E-3; // .010

    public void exponentExample() {
        System.out.println(myOtherExponent);
    }

    // using underscores to make the number readable
    long usingUnderscores = 4_568_987_367L;

    int able = 100;
    // This method shows local scope
    public void showLocalExample() {
        int able  = 20;
        System.out.println(able);
    } // end method

    /* Data type conversion is the concept of coverting between different
    * primitive data types. When going from a floating point to an integer
    * , there is no rounding. The value is truncated*/

    /*Implicit or Widening type conversion is done when two data types
    * automatically convert.*/
    public void exampleImplicit() {
        long sample = myInt;
        float sampleFloat = myLong;
        System.out.println("sample = " + sample);
        System.out.println("sampleFloat = "+sampleFloat);
    } // end method

    /* Explicit or Narrowing type conversion is done when two data
    * types convert, but require direct boxing effect. This is because
    * a larger data type is converting to a smaller one, which will
    * have precision loss. */
    public void exampleExplicit() {
        long sample2 = (long)myDouble;
        int sample3 = (int)usingUnderscores;
        System.out.println(sample2);
        System.out.println(sample3);
    } // end method

    public void sampleMethods() {
        int able = 5;

        int something = Integer.parseInt("32");
        int max = Integer.MAX_VALUE;
        byte bmax = Byte.MAX_VALUE;
        short smax = Short.MAX_VALUE;
        long lmax = Long.MAX_VALUE;
        float fmax = Float.MAX_VALUE;
        double dmax = Double.MAX_VALUE;
        System.out.println(something);
    }



} // end class
