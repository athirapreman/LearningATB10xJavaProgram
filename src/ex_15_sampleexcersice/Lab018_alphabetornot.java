package sampleprojects;

import java.util.Scanner;

public class Lab018_alphabetornot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the charcter");
        char ch = scanner.next().charAt(0);
        if(Character.isLetter(ch)){

            System.out.println("it is alphabet");


        }else
        {
            System.out.println("not alphabet");
        }
    }
}
