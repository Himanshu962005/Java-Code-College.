// Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

class Main97 { // FindElement.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.print("Enter Number to Search : ");
        int num = sc.nextInt();
        boolean found = false;
        for (int element : arr) {
            if (element == num) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Number is Present in Array.");
        else
            System.out.println("Number is not Present in Array.");
        sc.close();
    }
}