package com.pentacom.JavaBasics;

public class Methods {
    public static void main(String[] args) {
        //methods
        ///built-in methods e.g. println() is a method
        ///user pre-defined methods

        String nome = "Giraff";
        boolean testNome = nome.startsWith("G") && nome.endsWith("e");
        System.out.println(testNome);

        ///user pre-defined methods
    char [] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D' };

        //calling/invoking the method defined below
    int count = countOccurrences(letters, 'D');
        System.out.println(count);
    }

        //"public" is an access-modifier which makes the method accessible by other classes
        //"static" means the method belongs to a class
        //"int" is the return type of this method
    public static int countOccurrences(char [] letters, char searchLetter) {
        System.out.println(letters);
        System.out.println(searchLetter);
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
}}

