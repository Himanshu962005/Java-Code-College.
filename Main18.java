class Rectangle {
    int length, width; // Declaration Of Variables.

    void getdata(int x, int y) // Definition Of Method.
    {
        length = x;
        width = y;
    }

    int rectArea() // Definition Of Another Method.
    {
        int area = length * width;
        return (area);
    }
}

class Main18 // Class With Main Method.
{
    public static void main(String args[]) {
        int area1, area2;
        Rectangle rect1 = new Rectangle(); // Creating Objects.
        Rectangle rect2 = new Rectangle();
        rect1.length = 15; // Accessing Variables.
        rect1.width = 10;
        area1 = rect1.length * rect1.width;
        rect2.getdata(20, 12); // Accessing Methods.
        area2 = rect2.rectArea();
        System.out.println("Area1 = " + area1);
        System.out.println("Area2 = " + area2);
    }
}
