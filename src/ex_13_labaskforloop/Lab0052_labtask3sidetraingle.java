package ex_13_labaskforloop;

import java.util.Scanner;

public class Lab0052_labtask3sidetraingle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side 1");
        float side1= scanner.nextFloat();
        System.out.println("enter the side 2");
        float side2= scanner.nextFloat();
        System.out.println("enter the side 3");
        float side3= scanner.nextFloat();
        if((side1+side2>side3)&&(side2+side3>side1)&&(side1+side3>side2)){
            System.out.println("it is a vlid trainagle");
        }else{
            System.out.println("it is not a valid trainagle");
        }
    }
}
