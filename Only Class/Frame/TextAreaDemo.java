package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaDemo extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    TextAreaDemo(){
        initComponents();
    }
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        f = new Font("Arial",Font.BOLD,20);
        ta = new JTextArea("This is a text area");
        ta.setBounds(50,50,300,200);
        ta.setFont(f);
        ta.setForeground(Color.black);
        ta.setBackground(Color.lightGray);
        c.add(ta);
    }
    public static void main(String[] args) {
        TextAreaDemo frame = new TextAreaDemo();
        frame.setVisible(true);
        frame.setBounds(500,200,1200,700);
        frame.setTitle("TexArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
