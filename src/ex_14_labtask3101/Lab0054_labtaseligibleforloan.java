package ex_14_labtask3101;

import java.util.Scanner;

public class Lab0054_labtaseligibleforloan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        System.out.println("enter your salary");
        double salary = scanner.nextDouble();
        System.out.println("enter your credit score");
        double cs = scanner.nextDouble();
        if (age > 0 && age < 80 && age >= 18) {
            if (salary > 0 && salary >= 30000) {
                if (cs > 0 && cs > 650 && cs < 850) {
                    System.out.println("eligible");
                } else {
                System.out.println("you are not eligible for loan");
            }       } else {
            System.out.println("Ineligible: Salary must be at least 30,000.");
        }
    } else {
        System.out.println("Ineligible: Age must be between 18 and 80.");
    }
        }
    }
