package ex_17_labtaskfeb5th;

public class Lab_073_muttable5 {
    public static void main(String[] args) {
        int number=5;
        int value;
        for (int i = 1; i <=10 ; i++) {
           value= number*i;
            System.out.println(i+"*"+number+"="+value);

        }
    }
}
/* int number = 7;
        int multiplier = 1;

        System.out.println("Multiplication Table of " + number + ":");

        // Using while loop to print the table
        while (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            multiplier++;
        }
    }
}*/