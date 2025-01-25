package ex_05_labexcercises_Ternaryoperator;

public class Lab0031_Ternaryoperatormultiinputfromuser {
    public static void main(String[] args) {
        String name = args[0];

        String age_string = args[1];
        int age = Integer.parseInt(age_string);
        String salary_string = args[2];
        int salary = Integer.parseInt(salary_string);

        System.out.println("Name- "+name +" "+"\nAge-"+ age +"\nSalary- " +salary);
    }
}