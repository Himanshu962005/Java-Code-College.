import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main66 extends JFrame implements ActionListener { // SimpleInterestGUI.
    JTextField tfPrincipal, tfRate, tfTime, tfResult;
    JButton btnCalculate, btnClear;

    public Main66() {
        // Frame Settings.
        setTitle("Simple Interest Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Components.
        JLabel lblPrincipal = new JLabel("Principal : ");
        JLabel lblRate = new JLabel("Rate of Interest : ");
        JLabel lblTime = new JLabel("Time(Years) : ");
        JLabel lblResult = new JLabel("Simple Interest : ");
        tfPrincipal = new JTextField();
        tfRate = new JTextField();
        tfTime = new JTextField();
        tfResult = new JTextField();
        tfResult.setEditable(false);
        btnCalculate = new JButton("Calculate");
        btnClear = new JButton("Clear");
        // Add Components.
        add(lblPrincipal);
        add(tfPrincipal);
        add(lblRate);
        add(tfRate);
        add(lblTime);
        add(tfTime);
        add(lblResult);
        add(tfResult);
        add(btnCalculate);
        add(btnClear);
        // Button Actions.
        btnCalculate.addActionListener(this);
        btnClear.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            try {
                double p = Double.parseDouble(tfPrincipal.getText());
                double r = Double.parseDouble(tfRate.getText());
                double t = Double.parseDouble(tfTime.getText());
                double si = (p * r * t) / 100;
                tfResult.setText(String.valueOf(si));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please Enter Valid Numbers");
            }
        }
        if (e.getSource() == btnClear) {
            tfPrincipal.setText("");
            tfRate.setText("");
            tfTime.setText("");
            tfResult.setText("");
        }
    }

    public static void main(String[] args) {
        new Main66();
    }
}