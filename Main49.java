import javax.swing.*;
import java.awt.*;

public class Main49 extends JFrame {
    public Main49() {
        setTitle("Sum Program");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int value1 = 10;
        int value2 = 20;
        int sum = value1 + value2;
        String s = "Sum : " + sum;
        g.drawString(s, 50, 100);
    }

    public static void main(String[] args) {
        new Main49();
    }
}