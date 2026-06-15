// 3. Word Match System
// A recruitment portal receives two skill keywords from a candidate.
// Write a program that:
// Accepts two strings.
// Checks whether they are anagrams.
// Displays both strings in uppercase.
// Shows the total length of each string.
// Prints a suitable message based on the result.


import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("String 1 (Uppercase): " + str1.toUpperCase());
        System.out.println("String 2 (Uppercase): " + str2.toUpperCase());

        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

       
    }
}