package ex_16_stringfunctions;

import java.sql.SQLOutput;

public class Lab_63functioncharAtequalignore {
    public static void main(String[] args) {
        String name="ATHIRA PREMAN";
        String name2="athira  preman";
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.length());
        System.out.println(name2.length());
    }
}
