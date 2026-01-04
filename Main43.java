// PackageTest3.java

import package2.CLASSB;

class CLASSC extends CLASSB {
    int n = 20;

    void displayC() {
        System.out.println("Class C");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}

class Main43 {
    public static void main(String args[]) {
        CLASSC objectC = new CLASSC();
        objectC.displayB();
        objectC.displayC();
    }
}