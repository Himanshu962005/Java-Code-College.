import java.util.*;

class Main57 {
    public static void main(String args[]) {
        int a[][] = new int[3][3], b[][] = new int[3][3], c[][] = new int[3][3], i, j, k;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number in First Matrix...");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print("Enter number in pocket [" + i + "][" + j + "] : ");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter Number in Second Matrix...");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print("Enter number in pocket [" + i + "][" + j + "] : ");
                    b[i][j] = sc.nextInt();

                }
            }
            System.out.println("First Matrix...");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Second Matrix...");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Matrix Multiplication...");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}