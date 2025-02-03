package sampleprojects;

import java.util.Scanner;

public class Lab012_vowelorconstant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
    }else{
            System.out.println(ch + " is a constant.");

        }
}}
