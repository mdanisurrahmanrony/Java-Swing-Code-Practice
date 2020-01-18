package Frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayOutDemo2 extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private BoxLayout box;
        
    BoxLayOutDemo2 (){
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 670, 500);
        this.setTitle("BoxLayout Demo");

        c = this.getContentPane();
        
        //BoxLayout(Conntainer c, int axis)
        
        //box = new BoxLayout(c,BoxLayout.Y_AXIS);    //For Vertically Button Add
        box = new BoxLayout(c,BoxLayout.X_AXIS);    //For Horizontally Button Add
        c.setLayout(box);
        c.setBackground(Color.cyan);

        btn1  = new JButton("1");
        btn2  = new JButton("2");
        btn3  = new JButton("3");
        btn4  = new JButton("4");
        btn5  = new JButton("5");
        
        c.add(btn1);
        c.add(Box.createHorizontalStrut(10));   //Creating gap between buttons Horizontally (Here between button1 and button2)
        //c.add(Box.createVerticalStrut(10));   //Creating gap between buttons Vertically (Here between button1 and button2)
        c.add(btn2);
        c.add(Box.createHorizontalStrut(10));   //Creating gap between buttons Horizontally (Here between button2 and button3)
        //c.add(Box.createVerticalStrut(10));   //Creating gap between buttons Vertically (Here between button2 and button3)
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);                
    }

    public static void main(String[] args) {
        BoxLayOutDemo2 frame = new BoxLayOutDemo2();
        frame.setVisible(true);
    }

}

