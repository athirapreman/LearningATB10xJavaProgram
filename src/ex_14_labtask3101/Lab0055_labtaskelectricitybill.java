package ex_14_labtask3101;

import java.util.Scanner;

public class Lab0055_labtaskelectricitybill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double billAmount = 0.0;

        // Calculate bill based on unit slabs
        if (units <= 100) {
            billAmount = units * 0.50;
        } else if (units <= 200) {
            billAmount = (100 * 0.50) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            billAmount = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        } else {
            billAmount = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        }

        // Display the bill amount
        System.out.printf("The total electricity bill is: Rs. %.2f%n", billAmount);

        scanner.close();
    }
}



