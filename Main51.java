import java.util.Scanner;

class Main51 {
    public static void main(String[] args) {
        int n, s = 0, c, r;
        try (Scanner ref = new Scanner(System.in)) {
            System.out.print("Enter any number : ");
            n = ref.nextInt();
            c = n;
            while (n > 0) {
                r = n % 10;
                s = (s * 10) + r;
                n = n / 10;
            }
            if (c == s)
                System.out.println(c + " is a Palindrome Number");
            else
                System.out.println(c + " is not a Palindrome Number");
        }
    }
}