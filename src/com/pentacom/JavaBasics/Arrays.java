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
        for (int num : nums) System.out.println(num);
        System.out.println(nums[3]);
        System.out.println(numbers[0]);
    }
}
