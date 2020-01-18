package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class TestFieldDemo2 extends JFrame{
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    TestFieldDemo2(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        f=new Font("Arial",Font.ITALIC + Font.BOLD,18);
        
        tf1 = new JTextField();
        tf1.setBounds(50,50,200,50);
        tf1.setFont(f);
        tf1.setForeground(Color.magenta);
        tf1.setBackground(Color.green);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(50,150,200,50);
        tf2.setFont(f);
        tf2.setForeground(Color.magenta);
        tf2.setBackground(Color.green);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
        
    }
    
    public static void main(String[] args) {
        TestFieldDemo2 frame = new TestFieldDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("JTextfField Demo");
    }
}
