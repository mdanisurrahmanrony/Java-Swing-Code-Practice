package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo3 extends JFrame {
    private Container c;
    private JLabel userLabel,  passLabel;
    private ImageIcon img;
    private Font f;
    LabelDemo3(){
        initComponents();
    }
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        img = new ImageIcon(getClass().getResource("tsst.jpg"));        
        
        
        f=new Font("Arial",Font.BOLD,14);
        
        userLabel = new JLabel(img);
        userLabel.setText("Enter your user name: ");
        userLabel.setBounds(50,30,img.getIconWidth(),img.getIconHeight());
        userLabel.setFont(f);
        userLabel.setForeground(Color.BLUE);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.LIGHT_GRAY);
        userLabel.setToolTipText("Enter your USERNAME");
        c.add(userLabel);
        
        //System.out.println(" "+userLabel.getText());
        String s=userLabel.getToolTipText();
        System.out.println(" "+s);
        
        //passLabel=new JLabel (s);
        passLabel=new JLabel ("Enter your  password: ");
        passLabel.setBounds(50,80,160,50);
        passLabel.setFont(f);
        passLabel.setForeground(Color.BLUE);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.LIGHT_GRAY);
        passLabel.setToolTipText("Enter your password");
        c.add(passLabel);
        
         System.out.println(" "+passLabel.getText());
        
    }
    public static void main(String[] args) {
        LabelDemo3 frame = new LabelDemo3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Label Demo");
    }
}
