package sampleprojects;

import java.util.Scanner;

public class Lab014_largestinthreenumbersmathmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("enter the third number");
        int num3 = scanner.nextInt();
        int largest=Math.max(num1,Math.max(num2,num3));
        System.out.println("the largest number is "+largest);
    }
}
