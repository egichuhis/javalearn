package com.pentacom.JavaBasics;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
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

    }
}
