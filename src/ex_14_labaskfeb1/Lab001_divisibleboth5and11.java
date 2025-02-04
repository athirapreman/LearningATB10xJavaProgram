package Lab002_jun1;

import java.util.Scanner;

public class Lab001_divisibleboth5and11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");
        int number= scanner.nextInt();
        if(number%5==0&&number%11==0)
        {
            System.out.println("it is divisible by both 5 and 11");
        }else{
            System.out.println("not divisible by both 5 and 11");
        }
    }
}
