package com.fundamentals.java;

public class CompanyInfo {

    private int id;
    private String name;
    static String company = "Your Company";
    static final String ADDRESS = "123 Main St.";

    public CompanyInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("id: "+ getId() + " Name: "+ getName() +" Company: "+company);
        System.out.println("Company Address: " + ADDRESS);
    }

    // Example of not allowing a constant to be changed.
    private void changeAddress() {
        // Uncomment to verify
        // ADDRESS = "125 Main St.";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
