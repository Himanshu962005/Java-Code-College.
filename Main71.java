// Write a program to sum three numbers in Java.

import java.util.Scanner;

class Main71 { // SumThreeNumbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}