package ex_05_labexcercises_Ternaryoperator;

public class Lab0031a_task {
    public static void main(String[] args) {
        String firstno_string = args[0];
        int firstno = Integer.parseInt(firstno_string);
        String secondno_string = args[1];
        int secondno = Integer.parseInt(secondno_string);
        int largest=(firstno>secondno)?firstno:secondno;
        System.out.println(largest);
    }
}