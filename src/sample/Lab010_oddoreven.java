package sampleprojects;

import java.util.Scanner;

public class Lab010_oddoreven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number ");
        int oddoreven= scanner.nextInt();
        if(oddoreven%2==0){
            System.out.println("it is even number ");
        }else {
            System.out.println("it is odd number ");
        }
    }
}
