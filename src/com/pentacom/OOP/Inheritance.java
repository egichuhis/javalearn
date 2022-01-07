package com.pentacom.OOP;

//If you want anything which should belong to class make it static!!
class Product {

    //Attributes (State)
    //If you don't want the data to be written into objects directly, you can make the attributes private

//    int pid;
//    String name;
//    int price;

    //Changed to-->

    int pid; //the id cannot be written directly but through a method
    String name;
    int price;

    //Constructor
    Product(){
        System.out.println(">> Product Object Constructed");
        }

        //Methods (Behavior)
    //To write data in Product Object we have this Method
    void setProductDetails(int pid, String name, int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    //an indirect way to set the product "id" of a private attribute, using a method
    ///Setters, special method to set the attribute , when marked private
    void setPid(int pid){
        this.pid = pid; //"this" (LHS) means reference to current object & RHS belongs to method
    }

    ///Getters special method to get the attribute , when marked private
    int getPid(){
        return pid;
    }

    //To read data from Product Object
    void showProductDetails(){
        System.out.println("--Product ID:\t" + pid+"---------");
        System.out.println("Product Name:\t" + name);
        System.out.println("Product Price:\t" + price);
        System.out.println("-------------------------------------------------------");
    }
}

class Mobile extends Product { //IS-A Relation, Mobile IS-A Product, Mobile is Child, Product is Parent
    //Additional attributes of Mobile other than Product attributes
    String os;
    int ram;
    int sdCardSize;

    Mobile() {
        System.out.println(">> Mobile Object Constructed");
    }

    //we have redefined the same method from the parent into the child with different inputs
    //we now have 2 methods, one from parent and from child
    //both methods are different as in based on inputs (even though name is same
    //METHOD OVERLOADING: same method, different inputs
    void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.os = os;
        this.sdCardSize = sdCardSize;
    }

    //Let's redefine showProductDetails as well
    //2 methods, one from parent and one from child with same signatures.
    //child methods will be executed and not the parent method -->
    //METHOD OVERRIDING
    void showProductDetails() {
        System.out.println("--Product ID:\t" + pid + "---------");
        System.out.println("Product Name:\t" + name);
        System.out.println("Product Price:\t" + price);
        System.out.println("Product os:\t" + os);
        System.out.println("Product SDCardSize:\t" + sdCardSize);
        System.out.println("Product RAM:\t" + ram);
        System.out.println("-------------------------------------------------------");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //create an object : Product
        //"product" is not an object, it's a reference variable which holds the hashcode of the object in hex notation

//        Product product = new Product();

       // System.out.printf("Product is: "+product);

        //writing data into object
//        product.setProductDetails(12, "iPhoneX", 80000);
        //show product details
//        product.showProductDetails();

//        Product product1 = new Product();
//        product1.setPid(201); //error since attribute "id" is set to private & cannot be accessed
//        product1.price = 140000;
//        product1.name = "MacBook M1";
//        product1.showProductDetails();
//        product1.getPid();

        //Requesting to get Mobile Object constructed
        Mobile mobile = new Mobile();
        ///Product object (Parent) gets constructed before the Mobile object (Child) --> Rule to Inheritance (Object to Object)
        mobile.setProductDetails(124, "Samsung Galaxy", 5000);
        mobile.showProductDetails();
    }
}
