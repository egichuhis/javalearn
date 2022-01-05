package com.pentacom.JavaBasics;

import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9};
        String [] names = {"ALi", "Aaron", "Dave", "Basel", "Nairobi"};
        //Normal for loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

      //  intellij shortcut--> type " numbers.fori" then hit TAB
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

       // Reversed loop
        // intellij shortcut--> type " numbers.forr" then hit TAB
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        //Enhanced for loop
        for (int number : numbers){
            System.out.println(number);
        }

       // break keyword
        for (int number : numbers){
            if (number == 5){
                break;
            }
            System.out.println(number);
        }

        //continue keyword; if name starts with "A", then skip the next instruction and go to the start of the for loop

        for (String name : names){
            if (name.startsWith("A")){
                continue;
            }
            System.out.println(name);
        }

        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        //Advanced way to loop through an array
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
