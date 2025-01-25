package ex_07_labexercise_Conditions;

import java.util.Scanner;

public class Lab0039_ifelseifelsetraingle {
    public static void main(String[] args) {
        //find the triangale
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side one length");
        int side1 = sc.nextInt();

        System.out.println("enter the side second length");
        int side2 = sc.nextInt();

        System.out.println("enter the side third length");
        int side3 = sc.nextInt();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("invlid number");
        } else {


            if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("equaliteral");//same three side
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("isoscelene");
            }//same only two side
            else {
                System.out.println("scalene");//three side different


            }

        }
    }
}
