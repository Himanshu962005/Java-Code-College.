// Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard(Marks are out of 100)?

import java.util.Scanner;

class Main70 { // CBSEPercentage.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int subjects = 5;
        System.out.println("Enter marks for 5 subjects(out of 100)");
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + " : ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        float percentage = (totalMarks / 500.0f) * 100;
        System.out.println("\nTotal Marks = " + totalMarks + "/500");
        System.out.println("Percentage = " + percentage + "%");
        sc.close();
    }
}