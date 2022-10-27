package com.fundamentals.java;

public class CompanyInfo {

    int id;
    String name;
    static String company = "Your Company";
    static final String ADDRESS = "123 Main St.";

    void display() {
        System.out.println("id: "+id+ " Name: "+name+" Company: "+company);
        System.out.println("Company Address: " + ADDRESS);
    }

    // Example of not allowing a constant to be changed.
    private void changeAddress() {
        // Uncomment to verify
        // ADDRESS = "125 Main St.";
    }

}
