import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main67 extends JFrame implements ActionListener { // RegistrationForm.
    JTextField tfName, tfUsername, tfDob, tfEmail, tfMobile;
    JPasswordField pfPassword;
    JRadioButton rbMale, rbFemale;
    JButton btnRegister, btnClear;

    Main67() {
        setTitle("User Registration Form");
        setSize(450, 400);
        setLayout(new GridLayout(9, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Labels.
        add(new JLabel("Full Name : "));
        tfName = new JTextField();
        add(tfName);
        add(new JLabel("Username : "));
        tfUsername = new JTextField();
        add(tfUsername);
        add(new JLabel("Password : "));
        pfPassword = new JPasswordField();
        add(pfPassword);
        add(new JLabel("Gender : "));
        JPanel genderPanel = new JPanel();
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);
        add(genderPanel);
        add(new JLabel("Date of Birth : "));
        tfDob = new JTextField("DD/MM/YYYY");
        add(tfDob);
        add(new JLabel("Email ID : "));
        tfEmail = new JTextField();
        add(tfEmail);
        add(new JLabel("Mobile Number : "));
        tfMobile = new JTextField();
        add(tfMobile);
        btnRegister = new JButton("Register");
        btnClear = new JButton("Clear");
        add(btnRegister);
        add(btnClear);
        btnRegister.addActionListener(this);
        btnClear.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            String name = tfName.getText();
            String user = tfUsername.getText();
            if (name.isEmpty() || user.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill All Required Fields");
            } else {
                JOptionPane.showMessageDialog(this, "Registration Successful!");
            }
        }
        if (e.getSource() == btnClear) {
            tfName.setText("");
            tfUsername.setText("");
            pfPassword.setText("");
            tfDob.setText("");
            tfEmail.setText("");
            tfMobile.setText("");
        }
    }

    public static void main(String[] args) {
        new Main67();
    }
}