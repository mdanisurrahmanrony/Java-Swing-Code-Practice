package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxDemo3 extends JFrame {

    private Container c;
    private JCheckBox javaCheckBox, cCheckBox, MYSQLCheckBox;
    private Font f;
    private ButtonGroup grp; //For selecting only one
    private JLabel label;

    CheckBoxDemo3() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("CheckBox Demo");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        grp = new ButtonGroup(); //For selecting only one

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);

        javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(50, 100, 100, 30);
        javaCheckBox.setBackground(Color.green);
        javaCheckBox.setFont(f);
        c.add(javaCheckBox);

        cCheckBox = new JCheckBox("C Programming");
        cCheckBox.setBounds(50, 130, 200, 30);
        cCheckBox.setBackground(Color.green);
        cCheckBox.setFont(f);
        c.add(cCheckBox);

        MYSQLCheckBox = new JCheckBox("MySQL");
        MYSQLCheckBox.setBounds(50, 160, 160, 30);
        MYSQLCheckBox.setBackground(Color.green);
        MYSQLCheckBox.setFont(f);
        c.add(MYSQLCheckBox);

        grp.add(javaCheckBox); //For selecting only one
        grp.add(cCheckBox); //For selecting only one
        grp.add(MYSQLCheckBox); //For selecting only one

        label = new JLabel("You haven't selected anything");
        label.setBounds(50, 200, 400, 30);
        label.setFont(f);
        c.add(label);
        
        Handler handler = new Handler();
        javaCheckBox.addItemListener(handler);
        cCheckBox.addItemListener(handler);
        MYSQLCheckBox.addItemListener(handler);
    }
    
    class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource()==javaCheckBox){
                label.setText("You have selected Java");
            }
            else if(e.getSource()==cCheckBox){
                label.setText("You have selected C Programming");
            }
            else{
                label.setText("You have selected MySQL");
            }
        }
        
    }
    
        public static void main(String[] args) {
        CheckBoxDemo3 frame = new CheckBoxDemo3();
        frame.setVisible(true);
    }
}
