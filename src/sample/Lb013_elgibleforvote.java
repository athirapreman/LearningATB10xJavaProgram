package sampleprojects;

import java.util.Scanner;

public class Lb013_elgibleforvote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the age");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("elgible for vote");}
            else{
            System.out.println("not eligible");

            }
        }

}
