package com.pentacom;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //SWITCH CASE

//        Scanner newScanner = new Scanner(System.in);
//
//        System.out.println("Would you like to install new update?");
//            String myResponse = newScanner.nextLine();
//
//        switch (myResponse) {
//
//                case "Yes":
//                case "Y":
//                    System.out.println("Installation in progress, please wait...");
//                    break;
//                case "No":
//                case "N":
//                    System.out.println("Installation cancelled. Aborting...");
//                    break;
//                default:
//                    System.out.println("Please enter a valid response: ");
//            }

        //ARRAYS
    //Specifying the length of array

//        int [] numbers = new int[4];
//
//        numbers[0] = 1;
//        numbers[1] = 5;
//        numbers[2] = 8;
//        numbers[3] = 12;


        //Not specify length of array
        int [] numbers = {2, 0, 5, 8, 7};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[3]);

        //Normal for loop
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }


        //intellij shortcut--> type " numbers.fori" then hit TAB
//        for (int i = 0; i < numbers.length; i++) {
//
//        }

        //Reversed loop  //intellij shortcut--> type " numbers.forr" then hit TAB
//        for (int i = numbers.length - 1; i >= 0; i--) {
//
//        }

        //Enhanced for loop
//        for (int number : numbers){
//            System.out.println(number);
//        }

        //break keyword
//        for (int number : numbers){
//            if (number == 5){
//                break;
//            }
//            System.out.println(number);
//        }


        String [] names = {"ALi", "Aaron", "Dave", "Basel", "Nairobi"};

        //continue keyword; if name starts with "A", then skip the next instruction and go to the start of the for loop

//        for (String name : names){
//            if (name.startsWith("A")){
//                continue;
//            }
//            System.out.println(name);
//        }

//        System.out.println(Arrays.toString(names));
//        System.out.println(names.length);

        //Advanced way to loop through an array
//        Arrays.stream(numbers).forEach(System.out::println);

        //while loop, evaluates a boolean expression

//        int count = 0;
//        while (count <= 14) {
//            System.out.println("Count: " + count);
//            count++;
//        }

        //do while loop; execute at least once the code in the "do" no matter if condition in while is true or false
//        int count = 54;
//        do {
//            System.out.println("Count: " + count);
//            count++;
//        }
//        while (count <= 20);

        //Scanner class --> take user input from the console

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = myScanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you? ");
        int age = myScanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age > 18){
            System.out.println("You are an adult :)");
        }
        else{
            System.out.println("You are not an adult");
        }
//
    }}

