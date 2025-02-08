package sampleprojects;

import java.util.Scanner;

public class Lab009_positiveornegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number= scanner.nextInt();
        if(number>0){
            System.out.println("The number is positive number ");
        }else if(number==0){
            System.out.println("it is neither positive nor negative. ");
        }else{
            System.out.println("negative");
        }
        scanner.close();
    }
}
