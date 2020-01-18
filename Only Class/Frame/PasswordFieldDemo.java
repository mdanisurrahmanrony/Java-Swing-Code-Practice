package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordFieldDemo extends JFrame{
    private Container c;
    private JPasswordField pf;
    private Font f;
    PasswordFieldDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",Font.BOLD,25);
        
        pf=new JPasswordField();
        pf.setEchoChar('*');
        pf.setForeground(Color.GREEN);
        pf.setBackground(Color.lightGray);
        pf.setFont(f);
        pf.setBounds(50,20,150,50);
        c.add(pf);
    }
    
    public static void main(String[] args) {
        PasswordFieldDemo frame = new PasswordFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("PasswordField Demo");
    }
}
