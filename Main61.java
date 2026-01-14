class Base {
    int x;

    Base(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Base X = " + x);
    }
}

class Derived extends Base {
    int y;

    Derived(int x, int y) {
        super(x);
        this.y = y;
    }

    void display() {
        System.out.println("Base X = " + x);
        System.out.println("Derived Y = " + y);
    }
}

class Main61 { // Inheritance.
    public static void main(String args[]) {
        Derived d1 = new Derived(100, 200);
        d1.display();
    }
}