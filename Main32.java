import java.io.*;

class Main32 {
    public static void main(String[] args) {
        Float principalAmount = Float.valueOf(0); // Converting Number To Object.
        Float interestRate = Float.valueOf(0);
        int numYears = 0;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Principal Amount : ");
            System.out.flush();
            String principalString = in.readLine();
            principalAmount = Float.valueOf(principalString);
            // String Object To Number Object.
            System.out.print("Enter Interest Rate : ");
            System.out.flush();
            String interestString = in.readLine();
            interestRate = Float.valueOf(interestString);
            System.out.print("Enter Number of Years : ");
            System.out.flush();
            String yearsString = in.readLine();
            numYears = Integer.parseInt(yearsString); // Numeric String To Numbers.
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(1);
        }
        float value = loan(principalAmount.floatValue(), interestRate.floatValue(), numYears);
        printline();
        System.out.println(" Final Value = " + String.format("%.2f", value));
        printline();
    }

    // Method To Compute Final Value.
    static float loan(float p, float r, int n) {
        int year = 1;
        float sum = p;
        while (year <= n) {
            sum = sum * (1 + r);
            year = year + 1;
        }
        return sum;
    }

    // Method To Draw A Line.
    static void printline() {
        for (int i = 1; i <= 30; i++) {
            System.out.print("=");
        }
        System.out.println(" ");
    }

}
