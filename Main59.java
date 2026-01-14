class A {
    int a;
    double b;
    String c;

    A() {
        a = 100;
        b = 45.32;
        c = "Himanshu Legendary Coder";
        System.out.println(a + " " + b + " " + c);
    }

    A(int x) {
        a = x;
        System.out.println(a + " ");
    }

    A(double y, String z) {
        b = y;
        c = z;
        System.out.println(b + " " + c);
    }
}

class Main59 { // Constructor Overloading.
    public static void main(String args[]) {
        new A();
        new A(10);
        new A(76.33, "Valtryek");
    }
}