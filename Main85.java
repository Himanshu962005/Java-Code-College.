// Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

import java.util.Scanner;

class Main85 { // PassFail.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Subject 1 : ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks of Subject 2 : ");
        int m2 = sc.nextInt();
        System.out.print("Enter Marks of Subject 3 : ");
        int m3 = sc.nextInt();
        float avg = (m1 + m2 + m3) / 3.0f;
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Student is PASS");
        } else {
            System.out.println("Student is FAIL");
        }
        sc.close();
    }
}