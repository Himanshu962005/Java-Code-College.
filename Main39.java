// Methods With Differing Type Signatures Are Overloaded – Not Overridden.
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // Display I And J.
    void show() {
        System.out.println("I and J : " + i + " " + j);
    }
}

// Create A Subclass By Extending Class A.
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Overload Show().
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Main39 {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show("This is k : "); // This Calls Show() In B.
        subOb.show(); // This Calls Show() In A.
    }
}