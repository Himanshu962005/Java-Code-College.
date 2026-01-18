// Write a Java program to convert kilometers to miles.

import java.util.Scanner;

class Main73 { // KmToMiles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in Kilometers : ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in Miles = " + miles);
        sc.close();
    }
}