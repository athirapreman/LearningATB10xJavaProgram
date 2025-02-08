package ex_14_labtask3101;

import java.util.Scanner;

public class Lab0056_labtasksalarybonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary and years of experience
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of experience: ");
        int yearsOfExperience = scanner.nextInt();

        double bonus = 0.0;

        // Bonus calculation logic
        if (yearsOfExperience < 1) {
            bonus = 0;
        } else if (yearsOfExperience <= 3) {
            bonus = salary * 0.05;
        } else if (yearsOfExperience <= 6) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.15;
        }

        // Display the calculated bonus
        System.out.printf("Your bonus is: Rs. %.2f%n", bonus);

        scanner.close();
    }
}

