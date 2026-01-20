/* Calculate income tax paid by an employee to the government as per the slabs mentioned below :
Income Slab        Tax
2.5L - 5.0L        5%
5.0L - 10.0L       20%
Above 10.0L        30%
*/

import java.util.Scanner;

class Main86 { // IncomeTax.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income : ");
        float income = sc.nextFloat();
        float tax = 0;
        if (income <= 2.5f) {
            tax = 0;
        } else if (income <= 5f) {
            tax = (income - 2.5f) * 0.05f;
        } else if (income <= 10f) {
            tax = (2.5f * 0.05f) + (income - 5f) * 0.20f;
        } else {
            tax = (2.5f * 0.05f) + (5f * 0.20f) + (income - 10f) * 0.30f;
        }
        System.out.println("Income Tax = " + tax);
        sc.close();
    }
}