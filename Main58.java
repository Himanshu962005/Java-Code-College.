class Main58 { // Method Overloading.
    void add(int a, int b) {
        System.out.println("Sum of two number = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three number = " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of two doubles = " + (a + b));
    }

    public static void main(String args[]) {
        Main58 obj = new Main58();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(5.5, 4.5);
    }
}