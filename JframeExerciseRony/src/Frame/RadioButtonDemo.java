package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioButtonDemo extends JFrame {

    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp; //For select only one button
    private Font f;
    private JTextArea ta;

    RadioButtonDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("Radio Button Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        f = new Font("Arial", Font.BOLD, 18);

        grp = new ButtonGroup(); //For select only one button

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 50);
        male.setFont(f);
        male.setBackground(Color.LIGHT_GRAY);
        //male.setSelected(true); //For internally select button that means prohtomei ekta  select hoye thaka
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(160, 50, 100, 50);
        female.setFont(f);
        female.setBackground(Color.LIGHT_GRAY);
        //female.setEnabled(false); //For disable a radio button
        c.add(female);

        grp.add(male); //For select only one button
        grp.add(female); //For select only one button

        ta = new JTextArea();
        ta.setBounds(40, 110, 300, 200);
        ta.setFont(f);
        ta.setBackground(Color.lightGray);
        c.add(ta);

        Handler handler = new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==male){                        //if(male.isSelected())
                ta.append("You have selected male\n");
            }
            else{
                ta.append("You have selected female\n");
            }
        }
    }

    public static void main(String[] args) {
        RadioButtonDemo frame = new RadioButtonDemo();
        frame.setVisible(true);
    }
}
