import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main68 extends JFrame implements ActionListener { // EventDelegationDemo.
    JButton btnClick;
    JLabel lblMessage;

    Main68() {
        setTitle("Event Delegation Model Demo");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnClick = new JButton("Click Me");
        lblMessage = new JLabel("Waiting for Event...");
        add(btnClick);
        add(lblMessage);
        // Registering Listener with the Source.
        btnClick.addActionListener(this);
        setVisible(true);
    }

    // Event Handling Method.
    public void actionPerformed(ActionEvent e) {
        lblMessage.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new Main68();
    }
}