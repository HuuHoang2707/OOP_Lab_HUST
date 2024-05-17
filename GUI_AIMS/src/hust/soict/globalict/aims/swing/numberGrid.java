package hust.soict.globalict.aims.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class numberGrid extends JFrame{
    private JButton[] btnNumber = new JButton[10];
    private JButton btnDel, btnReset;
    private JTextField tfDisplay;
    Stack<String> st = new Stack<>();

    public numberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(
            ComponentOrientation.RIGHT_TO_LEFT);
        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout()); 
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(400, 400);
        setVisible(true);

    }

    void addButtons(JPanel a) {
        ButtonListener btnListener = new ButtonListener();
        for (int i = 1; i <= 9; ++i) {
            btnNumber[i] = new JButton("" + i);
            a.add(btnNumber[i]);
            btnNumber[i].addActionListener(btnListener);
        }

        btnDel = new JButton("DEL");
        a.add(btnDel);
        btnDel.addActionListener(btnListener);

        btnNumber[0] = new JButton("" + 0);
        a.add(btnNumber[0]);
        btnNumber[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        a.add(btnReset);
        btnDel.addActionListener(btnListener);

    }

    public static void main (String[] args) {
        new numberGrid();
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.charAt(0) >= '0' && button.charAt(0) <='9') {
                tfDisplay.setText(tfDisplay.getText() + button);
                st.push(tfDisplay.getText());
            }
            else if (button.equals("DEL")) {
                st.pop();
                tfDisplay.setText("" + st.peek());
            }
            else {
                tfDisplay.setText("");
            }
        }

    }
}
