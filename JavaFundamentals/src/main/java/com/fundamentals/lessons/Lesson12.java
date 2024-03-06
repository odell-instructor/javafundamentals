package com.fundamentals.lessons;

/* Lesson 12 - Constructors and Encapsulation */
public class Lesson12 {

    // Class fields (Attributes)
    private String firstName, lastName;

    // default constructor
    public Lesson12() {
        System.out.println("Default Constructor called");
    }

    public Lesson12(String firstName) {
        //System.out.println("First Name: "+firstName);
        this.firstName = firstName;
    }

    public Lesson12(String firstName , String lastName) {
        //System.out.println("First Name: " + firstName);
        //System.out.println("Last Name: " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Lesson12 myLesson = new Lesson12("Roger", "O'Dell");
        myLesson.sendMessage("Welcome to Lesson 12");
        System.out.println(myLesson.getFirstName());
    }

} // end class
