package sampleprojects;

import java.util.Scanner;

public class Lab007_reverseanumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int n= scanner.nextInt();
        int reverse=0;
        for (int i =0; i <=n ; i++) {
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;

        }
        System.out.println(reverse);
    }
}
