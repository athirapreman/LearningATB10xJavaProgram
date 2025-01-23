package ex_05_labexcercises_Ternaryoperator;

public class Lab0027_Ternaryoperatorfindlargestinthree {
    public static void main(String[] args) {
        int a=10,b=12,c=-21;
        int largest=(a>=b)?((a>=c)?a:b):((b>=c)?b:c);
        System.out.println(largest);
    }
}
