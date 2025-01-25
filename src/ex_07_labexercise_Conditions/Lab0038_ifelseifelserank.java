package ex_07_labexercise_Conditions;

import java.util.Scanner;

public class Lab0038_ifelseifelserank {
    public static void main(String[] args) {
        //grade calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mark");
        int mark= sc.nextInt();
        if(mark>=90&&mark<=100)
        {
            System.out.println("A");
        } else if (mark>=80&&mark<=89) {
            System.out.println("B");
            
        }
        else
        {
            System.out.println("failed");
        }
    }
}

