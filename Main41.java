// InterfaceTest.java.
interface Area // Interface Defined.
{
    final static float pi = 3.14f;

    float compute(float x, float y);
}

class Rectangle implements Area // Interface Implemented.
{
    public float compute(float x, float y) {
        return (x * y);
    }
}

class Circle implements Area // Another Implementation.
{
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

class Main41 // InterfaceTest.
{
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area; // Interface Object.
        area = rect; // Area Refers To Rect Object.
        System.out.println("Area of Rectangle = " + (int) area.compute(10, 20));
        area = cir; // Area Refers To Cir Object.
        System.out.println("Area of Circle = " + (int) area.compute(10, 0));
    }
}