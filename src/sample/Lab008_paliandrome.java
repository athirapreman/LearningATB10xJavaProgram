package sampleprojects;

public class Lab008_paliandrome {
    public static void main(String[] args) {
        String name="naman";
        boolean ispaliandrome=true;
        int length = name.length();

        for (int i = 0; i < length / 2; i++) {
            if (name.charAt(i) != name.charAt(length - 1 - i)) {
                ispaliandrome = false;
                break;
            }
        }

        // Output the result
        if (ispaliandrome) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }
}
