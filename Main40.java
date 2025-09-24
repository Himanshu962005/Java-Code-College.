// Dynamic Method Dispatch.
class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    // Override Callme().
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    // Override Callme().
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

class Main40 {
    public static void main(String args[]) {
        A a = new A(); // Object Of Type A.
        B b = new B(); // Object Of Type B.
        C c = new C(); // Object Of Type C.
        A r; // Obtain A Reference Of Type A.
        r = a; // R Refers To An A Object.
        r.callme(); // Calls A's Version Of Callme.
        r = b; // R Refers To A B Object.
        r.callme(); // Calls B's Version Of Callme.
        r = c; // R Refers To A C Object.
        r.callme(); // Calls C's Version Of Callme.
    }
}