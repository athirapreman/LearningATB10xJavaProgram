package ex_05_labexcercises_Ternaryoperator;

public class Lab0030_Ternaryoperatorinputfromusergrade {

        public static void main(String[] args) {
            String mark_string = args[2];
            int mark = Integer.parseInt(mark_string);
            String grade=(mark>=90)?"A":(mark>=80&&mark<=89)?"B":(mark>=70&&mark<=79)?"C":(mark>=60&&mark<=69)?"D":"F";
            System.out.println(grade);
        }}


