package com.pentacom.JavaBasics;

public class Arrays {
    public static void main(String[] args) {
        //ARRAYS
        //Specifying the length of array

        int [] numbers = new int[4];

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 8;
        numbers[3] = 12;


        //Not specify length of array
        int [] nums = {2, 0, 5, 8, 7};
        System.out.println((nums));
        System.out.println(numbers[3]);
    }
}
