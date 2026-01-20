// Write a Java program to find whether a year entered by the user is a leap year or not.

import java.util.Scanner;

class Main88 { // LeapYear.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}