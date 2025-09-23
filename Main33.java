// Demonstrate An Inner Class.
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // This Is An Inner Class.
    class Inner {
        void display() {
            System.out.println("Display : Outer_x = " + outer_x);
        }
    }
}

class Main33 {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}