package ex_09_labexercise_forloop;

public class Lab0043_forloopbreak {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i==5){

                break;
            }
            System.out.println(i);
        }
    }
}
