import static java.lang.Math.*;

public class Main44 {
    public void circle(double r) {
        double area = PI * r * r;
        System.out.println("The Area of Circle is : " + area);
    }

    public static void main(String[] args) {
        Main44 obj = new Main44();
        obj.circle(2.3);
    }
}