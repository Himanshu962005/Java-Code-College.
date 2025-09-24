// Method Overriding.
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // Display I and J.
    void show() {
        System.out.println("I and J : " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Display K – This Overrides Show() In A.
    void show() {
        System.out.println("K : " + k);
    }
}

class Main37 {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // This Calls Show() In B.
    }
}