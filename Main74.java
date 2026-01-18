// Write a Java program to detect whether a number entered by the user is integer or not.

import java.util.Scanner;

class Main74 { // CheckInteger.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value : ");
        if (sc.hasNextInt()) {
            System.out.println("The entered value is an integer.");
        } else {
            System.out.println("The entered value is not an integer.");
        }
        sc.close();
    }
}