package sampleprojects;

import java.util.Scanner;

public class Lab015_smallestoftwonumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("enter the third number");
        int num3 = scanner.nextInt();
        int largest = Math.min(num1, Math.min(num2, num3));
        System.out.println("the smallest number is " + largest);

    }
}