// 1. Username Validator 
// A company wants to validate usernames entered by users.
// Write a program that:
// Accepts a username.
// Checks whether it contains any spaces.
// Counts the total number of characters.
// Converts the username to uppercase.
// Displays whether the username is a palindrome.

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        if (username.contains(" ")) {
            System.out.println("The username contains spaces.");
        } else {
            System.out.println("The username does not contain spaces.");
        }

        System.out.println("Total number of characters: " + username.length());
        System.out.println("Username in uppercase: " + username.toUpperCase());

        String reverse = new StringBuilder(username).reverse().toString();

        if (username.equalsIgnoreCase(reverse)) {
            System.out.println("The username is a palindrome.");
        } else {
            System.out.println("The username is not a palindrome.");
        }

        
    }
}