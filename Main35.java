// A Simple Example of Inheritance.
// Create A Superclass.
class A {
    int i, j;

    void showij() {
        System.out.println("i and j : " + i + " " + j);
    }
}

// Create A Subclass By Extending Class A.
class B extends A {
    int k;

    void showk() {
        System.out.println("k : " + k);
    }

    void sum() {
        System.out.println("i+j+k : " + (i + j + k));
    }
}

// SimpleInheritance.
class Main35 {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();
        // The Superclass May Be Used By Itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb : ");
        superOb.showij();
        System.out.println();
        /*
         * The Subclass Has Access To All Public Members Of
         * Its Superclass.
         */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in subOb : ");
        subOb.sum();
    }
}