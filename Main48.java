import javax.swing.*;
import java.awt.*;

public class Main48 extends JFrame {
    public Main48() {
        setTitle("Hello Java");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello Java", 50, 100);
    }

    public static void main(String[] args) {
        new Main48();
    }
}