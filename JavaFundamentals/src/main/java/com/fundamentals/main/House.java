package com.fundamentals.main;

public class House {
    protected String entranceDoorColor;
    protected String foundationType;
    protected String roofStyle;
    protected int totalWindows;

    public House() {
        this("Cinder Blocks", "Grey");
    }

    public House(String foundationType , String doorColor) {
        this(foundationType, doorColor, "Cedar Shingle", 30);
    }

    public House(String foundationType , String doorColor ,
                 String roofStyle , int totalWindows) {
        this.foundationType = foundationType;
        entranceDoorColor = doorColor;
        this.roofStyle = roofStyle;
        this.totalWindows = totalWindows;
    }

    public String getEntranceDoorColor() {
        return entranceDoorColor;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public String getRoofStyle() {
        return roofStyle;
    }

    public int getTotalWindows() {
        return totalWindows;
    }

    public void doorFunction() {
        System.out.println("This door opens.");
    }

    /* Overloaded method - Can only happen when
    * the method signature is different between the
    * defined method by name. The signature of a
    * method is the name + the data types that represent
    * the parameter argument. The return type is not
    * part of the signature for overloading.  */
    public void doorFunction(String doorColor) {
        System.out.println("This " + doorColor +
                " door opens");
    }

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.doorFunction(myHouse.getEntranceDoorColor());
    }

}
