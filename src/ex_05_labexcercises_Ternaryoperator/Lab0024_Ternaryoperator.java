package ex_05_labexcercises_Ternaryoperator;

public class Lab0024_Ternaryoperator {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int age = 10;
        String canIVote =  age >= 18 ? "Yes, You can vote" : "No, You can't Vote";
        System.out.println(canIVote);
    }
}
