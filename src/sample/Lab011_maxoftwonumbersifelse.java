package sampleprojects;

import java.util.Scanner;

public class Lab011_maxoftwonumbersifelse {
    public static void main(String[] args) {
        //using if else
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the fisrt number ");
        int firstnumber= scanner.nextInt();
        System.out.println("enter the second number ");
        int secondnumber= scanner.nextInt();
        if(firstnumber>secondnumber){
            System.out.println(firstnumber);
        }else{
            System.out.println(secondnumber);
        }

    }
}

