// Demonstrate When Constructors Are Called.
// Create A Super Class.
class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
}

// Create A Subclass By Extending Class A.
class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}

// Create Another Subclass By Extending B.
class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}

class Main36 {
    public static void main(String args[]) {
        new C();
    }
}