package ex_07_labexercise_Conditions;

import java.util.Scanner;

public class Lab0037_ifelseifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();

        System.out.println("enter the first number");
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("number one is greatest");
        } else if (num2>num1) {
            System.out.println("number two is greatest");
        }else {
            System.out.println("both are equal");
        }
    }
}
