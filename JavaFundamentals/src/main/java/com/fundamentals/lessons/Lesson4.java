package com.fundamentals.lessons;

import java.sql.SQLOutput;

// Lesson4: All about Strings
/* String objects are immutable, which means once
the value is set, it cannot be changed. Instead,
it creates a new object.
* */
public class Lesson4 {

    // field or instance variable
    String note = "Welcome to Lesson 4";

    // Assign a new reference to the field above
    String secondNote = note;

    /* This method returns a joined string back
    * to where it was called from. The empty
    * parenthesis is to ensure a space between variables.*/
    public String joinWelcome(String message) {
        // Concatenation
        return note + " " + message;
    }

    /* Show that Strings are immutable */
    public void checkWelcome(String message) {
        note = note + " " + message;
        System.out.println(note);
        System.out.println(secondNote);
    }

    /* charAt returns a single character based
    * on the specified index of the string.
    * Each character of the string is represented
    * by a numeric index value starting at 0.*/
    public void indexNote(int index) {
        System.out.println(note.charAt(index));
        /* If you choose an int value greater
        * than the string, you will produce an error.*/
    }

    /* concat joins two strings together as concatenation.
    * Same as the joinWelcome method above. */
    public void anotherJoin(String msg) {
        System.out.println(note.concat(msg));
    }

    /* equals compares the string to a specified string object */
    public void areWeAlike(String value1, String value2) {
        System.out.println("Are " + value1 + " and "
                + value2 + " the same?");
        System.out.println(value1.equals(value2));
    }

    /* toLower & toUpper will change all characters
    * to the specified case. */
    public void differentCase() {
        System.out.println(note.toLowerCase());
        System.out.println(note.toUpperCase());
    }

    /* Length will return the number of characters including
    * empty spaces */
    public void howLongAmI(String value) {
        System.out.println("How many characters is " + value);
        System.out.println(value.length());
    }

    /* replace will replace all instances of from with to */
    public String changeMyMessage(String word) {
        return note.replace("to", word);
    }

    /* String builder allow you to join objects or
    * primitives together int a variable array or list. */
    public String favoriteThings(String color, String food) {
        StringBuilder builder1 = new StringBuilder();
        builder1.append("My favorite food is ");
        builder1.append(food);

        StringBuilder builder2 = new StringBuilder();
        builder2.append("My favorite color is ").append(color);

        builder1.append(" & ").append(builder2);
        return builder1.toString();
    }

    /* A char is a single character primitive data type.
    * A range of U+0000 to U+10FFF */
    public void iAmSingle() {
        char letter = 'J';
        char unicodeValue = '\u00A9';
        System.out.println(letter);
        System.out.println(unicodeValue);
    }

    /* Escape sequences allow you to escape characters
    * that are used in code, or other situations */
    public String escapeMe() {
        return "Today\'s class is going over Strings.\tIt also will\n cover char.";
    }

    /* This main is for Education use only. Main.java
    * main is the normal start of this project
    * */
    public static void main(String[] args) {
        Lesson4 myLesson4 = new Lesson4();
        String msg = "All about Strings";
        // System.out.println(myLesson4.joinWelcome(msg));
        // myLesson4.checkWelcome(msg);
        // myLesson4.indexNote(5);
        // myLesson4.anotherJoin(" is not quite finished.");
        // myLesson4.areWeAlike("Happy", "Happy");
        // myLesson4.differentCase();
        // myLesson4.howLongAmI(msg);
        // String response = myLesson4.changeMyMessage("two");
        // System.out.println(response);
        // System.out.println(myLesson4.favoriteThings("Dark Blue", "Pizza"));
        // myLesson4.iAmSingle();
        System.out.println(myLesson4.escapeMe());
    }

} // end class
