import java.util.Scanner;

public class Main54 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Principal Amount(P) : ");
            double P = sc.nextDouble();
            System.out.print("Enter Rate of interest(R) : ");
            double R = sc.nextDouble();
            System.out.print("Enter time in year(T) : ");
            double T = sc.nextDouble();
            double SI = (P * R * T) / 100;
            System.out.println("Simple Interest = " + SI);
        }
    }
}