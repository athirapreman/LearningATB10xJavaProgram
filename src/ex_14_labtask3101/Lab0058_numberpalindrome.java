package ex_14_labtask3101;

import java.util.Scanner;

public class Lab0058_numberpalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;           // Get the last digit
            reversed = reversed * 10 + digit;  // Append the digit to reversed
            number = number / 10;              // Remove the last digit
        }

        // Check if palindrome
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}