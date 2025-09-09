class Rectangle {
    int length, width;

    Rectangle(int x, int y) // Defining Constructor.
    {
        length = x;
        width = y;
    }

    int rectArea() {
        return (length * width);
    }
}

class Main19 {
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(15, 10); // Calling Constructor.
        int area1 = rect1.rectArea();
        System.out.println("Area1 = " + area1);
    }
}
