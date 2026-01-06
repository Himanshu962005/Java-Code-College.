import java.util.Scanner;

class Main53 {
    public static void main(String args[]) {
        int n, count = 0;
        System.out.print("Enter any number : ");
        try (Scanner ref = new Scanner(System.in)) {
            n = ref.nextInt();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print("Prime Number");
            else
                System.out.print("Not Prime Number");
        }
    }
}