package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayOutDemo extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private GridLayout gl;
        
    GridLayOutDemo (){
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 670, 500);
        this.setTitle("GridLayout Demo");

        c = this.getContentPane();
       
        gl = new GridLayout(2,2,5,5);   //2,2 means number of row and column. 5,5 for horizontal and vertical gap.
        c.setLayout(gl);        

        btn1  = new JButton("1");
        btn2  = new JButton("2");
        btn3  = new JButton("3");
        btn4  = new JButton("4");
        btn5  = new JButton("5");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
                        
    }

    public static void main(String[] args) {
        GridLayOutDemo frame = new GridLayOutDemo();
        frame.setVisible(true);
    }

}

