package com.pentacom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Would you like to install new update? ");
        String myResponse = newScanner.nextLine();

        switch (myResponse) {

            case "Yes":
            case "Y":
                System.out.println("Installation in progress, please wait...");
                break;
            case "No":
            case "N":
                System.out.println("Installation cancelled. Aborting...");
                break;
            default:
                System.out.println("Please enter a valid response: ");
        }
    }
}
