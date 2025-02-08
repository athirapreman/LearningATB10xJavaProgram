package ex_14_labtask3101;

import java.util.Scanner;

public class Lab0057_labtasktotalsalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Basic Pay, HRA, DA, and Tax Deductions
        System.out.print("Enter your basic pay: ");
        double basicPay = scanner.nextDouble();

        // HRA and DA are percentages of Basic Pay
        double hra = basicPay * 0.20;  // 20% of Basic Pay
        double da = basicPay * 0.10;   // 10% of Basic Pay

        // Tax Calculation based on salary
        double taxDeduction = 0;
        if (basicPay <= 500000) {
            taxDeduction = 0;  // No tax for basic pay <= ₹5,00,000
        } else if (basicPay <= 1000000) {
            taxDeduction = basicPay * 0.05;  // 5% tax for salaries between ₹5,00,000 and ₹10,00,000
        } else {
            taxDeduction = basicPay * 0.20;  // 20% tax for salaries above ₹10,00,000
        }

        // Net Salary Calculation
        double netSalary = basicPay + hra + da - taxDeduction;

        // Output: Display the Net Salary
        System.out.printf("Net Salary: ₹%.2f%n", netSalary);

        scanner.close();
    }
}

