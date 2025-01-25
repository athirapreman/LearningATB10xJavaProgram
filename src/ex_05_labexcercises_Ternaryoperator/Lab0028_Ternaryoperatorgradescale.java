package ex_05_labexcercises_Ternaryoperator;

public class Lab0028_Ternaryoperatorgradescale {
    public static void main(String[] args) {
        int mark=87;
        String grade=(mark>=90)?"A":(mark>=80&&mark<=89)?"B":(mark>=70&&mark<=79)?"C":(mark>=60&&mark<=69)?"D":"F";
        System.out.println(grade);
}}
