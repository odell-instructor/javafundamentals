package com.fundamentals.main;

/* Child of the House class */
public class Condo extends House {
    private final String balconyType;

    public Condo(String balconyType) {
        this("Concrete", "Red", "Flat", 87, balconyType);
    }

    public Condo(String foundationType, String doorColor,
                 String roofStyle, int totalWindows, String balconyType) {
        super(foundationType, doorColor, roofStyle, totalWindows);
        this.balconyType = balconyType;
    }

    public String getBalconyType() {
        return balconyType;
    }

    public void maintenance() {
        System.out.println("Maintenance has been called.");
    }

    @Override
    public void doorFunction() {
        super.doorFunction(); // executes the house version
        System.out.println("The condo door is locked.");
    }

    public static void main(String[] args) {
        Condo myCondo = new Condo("Railed");
        System.out.println(myCondo.getEntranceDoorColor());
        System.out.println(myCondo.getFoundationType());
        myCondo.doorFunction();
        myCondo.doorFunction("Green");
    }

} // end class
