package com.pentacom.OOP;

//If you want anything which should belong to class make it static!!
class Product {

    //Attributes (State)
    int pid;
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
        product1.pid = 200;
        product1.price = 140000;
        product1.name = "MacBook M1";
        product1.showProductDetails();
    }
}
