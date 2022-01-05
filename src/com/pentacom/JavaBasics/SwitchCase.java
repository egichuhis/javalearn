package com.pentacom.JavaBasics;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        //SWITCH CASE

        Scanner newScanner = new Scanner(System.in);

        System.out.println("Would you like to install new update?");
            String myResponse = newScanner.nextLine();

        switch (myResponse) {
            case "Yes", "Y" -> System.out.println("Installation in progress, please wait...");
            case "No", "N" -> System.out.println("Installation cancelled. Aborting...");
            default -> System.out.println("Please enter a valid response: ");
        }
    }
}
