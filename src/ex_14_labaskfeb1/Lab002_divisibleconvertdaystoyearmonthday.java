package Lab002_jun1;

import java.util.Scanner;

public class Lab002_divisibleconvertdaystoyearmonthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Calculate years
        int years = totalDays / 365;

        // Calculate remaining days after subtracting years
        int remainingDaysAfterYears = totalDays % 365;

        // Calculate months from remaining days
        int months = remainingDaysAfterYears / 30;

        // Calculate remaining days after subtracting months
        int days = remainingDaysAfterYears % 30;

        // Output the result
        System.out.println(totalDays + " days is equivalent to: ");
        System.out.println(years + " years, " + months + " months, and " + days + " days.");

        // Close the scanner
        scanner.close();
    }
}

