package Lab002_jun1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab004_agecateogry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur age");
      int age= sc.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("You are a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an Adult.");
        } else if (age >= 65) {
            System.out.println("You are a Senior Citizen.");
        } else {
            System.out.println("Invalid age input.");
        }

        // Close the scanner to avoid memory leaks

    }
}




