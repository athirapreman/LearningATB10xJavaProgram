package ex_14_labtask3101;

import java.util.Scanner;

public class Lab0053_labtaskarmstrongnumber {

        public static boolean isArmstrong(int number) {
            int originalNumber = number;
            int sum = 0;
            int numDigits = String.valueOf(number).length();

            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numDigits);
                number /= 10;
            }

            return sum == originalNumber;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // User input
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Output result
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }

            scanner.close();
        }
    }