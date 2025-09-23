// Define An Inner Class Within A For Loop.
class Outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("Display : Outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

class Main34 {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}