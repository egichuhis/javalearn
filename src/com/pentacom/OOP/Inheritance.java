package com.pentacom.OOP;

//If you want anything which should belong to class make it static!!
class Product {

    //Attributes (State)
    //If you don't want the data to be written into objects directly, you can make the attributes private

//    int pid;
//    String name;
//    int price;

    //Changed to-->

    private int pid; //the id cannot be written directly but through a method
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
        System.out.println("------------------------------------------------------");
    }
}



public class Inheritance {
    public static void main(String[] args) {
        //create an object : Product
        //"product" is not an object, it's a reference variable which holds the hashcode of the object in hex notation

        Product product = new Product();

       // System.out.printf("Product is: "+product);

        //writing data into object
        product.setProductDetails(12, "iPhoneX", 80000);
        //show product details
        product.showProductDetails();

        Product product1 = new Product();
        product1.setPid(201); //error since attribute "id" is set to private & cannot be accessed
        product1.price = 140000;
        product1.name = "MacBook M1";
        product1.showProductDetails();
        product1.getPid();
    }
}
