package ex_09_labexercise_forloop;

public class Lab0042_forloopevenodd {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; ++i) {
            if(i%2==0)
            {
                System.out.println("even"+i);

            }else{
                System.out.println("odd"+i);
            }
        }
    }
}
