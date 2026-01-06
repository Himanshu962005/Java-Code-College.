import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main50 extends JFrame implements ActionListener { // Calculator Basic.
    JTextField t1, t2;
    JLabel result;

    public Main50() { // Calculator Basic.
        setTitle("Basic Calculator");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1 = new JTextField(8);
        t2 = new JTextField(8);
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        result = new JLabel("Result : ");
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(result);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            String cmd = e.getActionCommand();
            int res = 0;
            switch (cmd) {
                case "+":
                    res = a + b;
                    break;
                case "-":
                    res = a - b;
                    break;
                case "*":
                    res = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        result.setText("Division not possible");
                        return;
                    }
                    res = a / b;
            }
            result.setText("Result : " + res);
        } catch (Exception ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Main50(); // Calculator Basic.
    }
}