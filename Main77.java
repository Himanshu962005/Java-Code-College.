// Use comparison operators to find out whether a given number is greater than the user entered number or not.

import java.util.Scanner;

class Main77 { // CompareNumbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenNumber = 50;
        System.out.print("Enter a Number : ");
        int userNumber = sc.nextInt();
        if (givenNumber > userNumber) {
            System.out.println("Given Number is Greater");
        } else {
            System.out.println("Given Number is not Greater");
        }
        sc.close();
    }
}