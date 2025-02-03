package sampleprojects;

import java.util.Scanner;

public class Lab006_factorial {
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int n= scanner.nextInt();
        int factorial=1;
        for (int i = 1; i <=n ; i++) {
             factorial=factorial*i;


        }
        System.out.println(factorial);
        }
    }

