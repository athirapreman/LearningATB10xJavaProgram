package sampleprojects;

import java.util.Scanner;

public class Lab002_sumoffirstNnaturalnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= scanner.nextInt();

        int sum=0;
        for (int i = 0; i<=n; i++) {
            sum = sum + i;

        }
            System.out.println(sum);

        }
    }

