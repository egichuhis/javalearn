package com.pentacom.JavaBasics;

import java.time.LocalDate;

public class JavaBasicsLearn {

    public static void main(String[] args) {

//        Lens lensOne = new Lens("Sony",
//                                "85mm",
//                                true);
//
//        Lens lensTwo = new Lens("Nikon",
//                "65mm",
//                false);
//
//        Lens lensThree = new Lens("Canon",
//                "75mm",
//                true);
//
//        System.out.println("Lens 1");
//        System.out.println(lensOne.brand);
//        System.out.println(lensOne.focalLength);
//        System.out.println(lensOne.isPrime);
//        System.out.println();
//
//        System.out.println("Lens 2");
//        System.out.println(lensTwo.brand);
//        System.out.println(lensTwo.focalLength);
//        System.out.println(lensTwo.isPrime);
//        System.out.println();
//
//        System.out.println("Lens 3");
//        System.out.println(lensThree.brand);
//        System.out.println(lensThree.focalLength);
//        System.out.println(lensThree.isPrime);
//        System.out.println();

    Passport ukPassport = new Passport("1234", "United Kingdom", LocalDate.of(2025, 12, 24));
    Passport usPassport = new Passport("9999", "United States", LocalDate.of(2030, 10, 12));

        System.out.println();
        System.out.println("COUNTRY: " + ukPassport.country);
        System.out.println("PASSPORT NO: " + ukPassport.number);
        System.out.println("EXPIRY DATE: " + ukPassport.expiryDate);
        System.out.println();

        System.out.println("COUNTRY: " +usPassport.country);
        System.out.println("PASSPORT NO: " +usPassport.number);
        System.out.println("EXPIRY DATE: " + usPassport.expiryDate);
 }

 static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
 }


//Classes and Objects
///a class is a blueprint for creating objects, like a template, the objects can have different attributes
//    static class Lens {
//        String brand;
//        String focalLength;
//        boolean isPrime;
//
//        //In Java, a constructor is a block of code similar to the method. It is called when an instance of the
//    //class is created. At the time of calling constructor, memory for the object is allocated in the memory
//    //It is a special type of method used to initialize the object.
//    //Every time an object is created using the new() keyword, at least one constructor is called
//    //constructor name must be the same as its class name
//        Lens(String brand,
//             String focalLength,
//             boolean isPrime){
//
//            //'this' refers to the current instance of the current class
//            this.brand = brand;
//            this.focalLength = focalLength;
//            this.isPrime = isPrime;
//        }
//}

}

