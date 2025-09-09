class Super {
    public void method() {
        System.out.println("Method Super");
    }
}

class Sub extends Super {
    public void method() {
        System.out.println("Method Sub");
    }
}

class Main26 {
    public static void main(String[] args) {
        Super A = new Sub(); // Sub's Object Reference Assigned Super Type Reference Variable.
        A.method(); // Sub's Version Of Method Will Be Called At Runtime.
    }
}