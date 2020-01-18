package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxDemo2 extends JFrame {

    private Container c;
    private JComboBox cb;
    private String[] progLanguage = {"C", "C++", "Java", "PHP", "Python"};
    private JLabel label;
    private JButton btn;

    ComboBoxDemo2() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("ComboBox Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        cb = new JComboBox(progLanguage);
        cb.setBounds(50, 150, 100, 50);
        cb.setEditable(true);   //For Making Combo Box Editable  
        cb.addItem("Fortran");      //For adding new option
        cb.addItem("BASIC");      //For adding new option
        c.add(cb);
        
        btn = new JButton("Show");
        btn.setBounds(50,250,80,50);
        c.add(btn);

        label = new JLabel();
        label.setBounds(160, 150, 200, 50);
        c.add(label);

        btn.addActionListener(new ActionListener() {     //cb.addActionListener(new ActionListener()     //For Adding Action Listener with Combo Box
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = cb.getSelectedItem().toString();
                label.setText("You have selected : "+s);
            }

        });
    }

    public static void main(String[] args) {
        ComboBoxDemo2 frame = new ComboBoxDemo2();
        frame.setVisible(true);
    }
}
