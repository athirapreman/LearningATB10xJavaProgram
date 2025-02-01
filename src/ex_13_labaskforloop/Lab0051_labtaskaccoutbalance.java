package ex_13_labaskforloop;

import java.util.Scanner;

public class Lab0051_labtaskaccoutbalance {
    public static void main(String[] args) {
        int accountbalance=10000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your money to withdraw");
        int withdrawmoney= scanner.nextInt();
        if(withdrawmoney<0){
            System.out.println("the amount should be  greater than zero");
        }else if(withdrawmoney%100!=0){
            System.out.println("amount should be multiple of 100");
        }else if(withdrawmoney>accountbalance)
        {
            System.out.println("insufficinent balance");
        }else{
            accountbalance=accountbalance-withdrawmoney;
            System.out.println("the account balance is "+accountbalance);
        }

        }

        }




