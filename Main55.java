import java.awt.*;
import javax.swing.*;

public class Main55 extends JFrame {
	JButton b1, b2, b3, b4;

	public Main55() {
		setLayout(new BorderLayout());
		b1 = new JButton("East");
		add(b1, BorderLayout.EAST);
		b2 = new JButton("West");
		add(b2, BorderLayout.WEST);
		b3 = new JButton("North");
		add(b3, BorderLayout.NORTH);
		b4 = new JButton("South");
		add(b4, BorderLayout.SOUTH);
		setSize(400, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main55();
	}
}