package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ActionListenerDemo2 extends JFrame {

    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    ActionListenerDemo2() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        tf1.setForeground(Color.magenta);
        tf1.setBackground(Color.green);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 150, 200, 50);
        tf2.setFont(f);
        tf2.setForeground(Color.magenta);
        tf2.setBackground(Color.green);
        tf2.setHorizontalAlignment(JTextField.CENTER);

        c.add(tf2);

        Handler handler = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == tf1) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1 = " + s);
                }
            } else {

                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2 = " + s);
                }
            }
        }
    }

    public static void main(String[] args) {
        ActionListenerDemo2 frame = new ActionListenerDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("ActionListener Demo");
    }
}
