// Write a program to sum first n even numbers using while loop.

import java.util.Scanner;

class Main91 { // SumEvenWhile.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int sum = 0, i = 0;
        while (i < n) {
            sum += 2 * i;
            i++;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}