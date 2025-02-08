package sampleprojects;

import java.util.Scanner;

public class Lab016_smallestintwonumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
    int num1= scanner.nextInt();
        System.out.println("enter the second number");
    int num2= scanner.nextInt();
    int min=Math.min(num1,num2);
        System.out.println("min number is "+min);
}
}