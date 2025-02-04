package Lab002_jun1;

import java.util.Scanner;

public class Lab003_TypeofWebsite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the url");
        String url= sc.nextLine();
        switch (url){
            case ".com":
                System.out.println("The website type is: Commercial website");
                break;
            case ".org":
                System.out.println("The website type is: Non-profit organization");
                break;
            case ".edu":
                System.out.println("The website type is: Educational institution");
                break;
            case ".net":
                System.out.println("The website type is: Network-related website");
                break;
        }

    }
}
