package hust.soict.globalict.aims.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAccumulator extends JFrame {
	private JTextField tfInput;
	private JTextField tfOutput;
	private int sum = 0;

	public SwingAccumulator() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2, 2));

		cp.add(new JLabel("Enter an Integer: "));

		tfInput = new JTextField(10);
		cp.add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		cp.add(new JLabel("The Accumlate sum is: "));

		tfOutput = new JTextField(10);
		tfOutput.setEditable(false);
		cp.add(tfOutput);

		setTitle("Swing accumlation");
		setSize(320, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingAccumulator();
	}

	private class TFInputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}
	}

}
