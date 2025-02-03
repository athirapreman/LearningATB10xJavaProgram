package sampleprojects;

import java.util.Scanner;

public class Lab003_multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int n= scanner.nextInt();
        for (int i = 0; i <=10 ; i++) {
            int mul=i*n;
            System.out.println(n+"*"+i+"="+mul);

        }


    }
}
