package sampleprojects;

import java.util.Scanner;

public class Lab011_maxoftwonumbersmathmax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");
        int num2= scanner.nextInt();
        int max=Math.max(num1,num2);
        System.out.println("max number is "+max);
    }
}
