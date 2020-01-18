package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutdemo extends JFrame {

    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BorderLayout bLayout;
    
    BorderLayoutdemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 670, 500);
        this.setTitle("BorderLayout Demo");

        c = this.getContentPane();
        bLayout = new BorderLayout(10/*For Horizontal Border Layout Gap*/ ,5/*For Vertical Border Layout Gap*/);
//        bLayout.setHgap(10);    //Another Method For Horizontal Border Layout Gap
//        bLayout.setVgap(10);    //Another Method For Vertical Border Layout Gap
        c.setLayout(bLayout);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        
        c.add(btn1, BorderLayout.NORTH);
        c.add(btn2, BorderLayout.WEST);
        c.add(btn3, BorderLayout.CENTER);
        c.add(btn4, BorderLayout.EAST);
        c.add(btn5, BorderLayout.SOUTH);
        
    }

    public static void main(String[] args) {
        BorderLayoutdemo frame = new BorderLayoutdemo();
        frame.setVisible(true);
    }

}
