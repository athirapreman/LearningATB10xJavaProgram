package ex_14_labtask3101;

import java.util.Scanner;

public class Lab0059_visavalidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age ");
        int age= sc.nextInt();

        System.out.println("enter the status of visa ");
        String visastatus= sc.next();
        if (age<18) {
            System.out.println("wont allow to travel");}

         else if(visastatus.equalsIgnoreCase("invalid")) {
             System.out.println("u cant travel");
         }
        else {
            System.out.println("u can travel");
        }

    }









}
