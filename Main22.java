class Nesting {
    int m, n;

    Nesting(int x, int y) // Constructor Method.
    {
        m = x;
        n = y;
    }

    int largest() {
        if (m >= n)
            return (m);
        else
            return (n);
    }

    void display() {
        int large = largest(); // Calling A Method.
        System.out.println("Largest value = " + large);
    }
}

class Main22 {
    public static void main(String args[]) {
        Nesting nest = new Nesting(50, 40);
        nest.display();
    }
}
