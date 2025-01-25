package ex_05_labexcercises_Ternaryoperator;

public class Lab0029_Ternaryoperatorinputfromuser {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        String category =(age>=18)?"can vote":"cant vote";
        System.out.println(category);
    }


}
