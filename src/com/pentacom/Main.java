package com.pentacom;

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
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);

        //Enhanced for loop
        for (int number : numbers){
            System.out.println(number);
        }

//        String [] names = {"ALi", "Maria", "Dave"};
//        System.out.println(Arrays.toString(names));
//        System.out.println(names.length);
    }}

