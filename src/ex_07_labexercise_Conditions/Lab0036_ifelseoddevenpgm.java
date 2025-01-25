package ex_07_labexercise_Conditions;

import java.util.Scanner;

public class Lab0036_ifelseoddevenpgm {
    public static void main(String[] args) {
        //input in integer
        //out in string
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd ");
        }
        sc.close();//close scanner1
    }
}
