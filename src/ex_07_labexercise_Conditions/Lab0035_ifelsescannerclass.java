package ex_07_labexercise_Conditions;

import java.util.Scanner;

public class Lab0035_ifelsescannerclass {
    public static void main(String[] args) {
        //int age =20;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("u can vote ");



        } else {
            System.out.println("u cant vote");
        }
    }
}
