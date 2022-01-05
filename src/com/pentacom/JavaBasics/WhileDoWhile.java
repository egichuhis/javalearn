package com.pentacom.JavaBasics;

public class WhileDoWhile {
    public static void main(String[] args) {
        //while loop, evaluates a boolean expression

        int count = 0;
        while (count <= 14) {
            System.out.println("Count: " + count);
            count++;
        }

        //do while loop; execute at least once the code in the "do" no matter if condition in while is true or false
        int county = 54;
        do {
            System.out.println("Count: " + count);
            count++;
        }
        while (county <= 20);
    }
}
