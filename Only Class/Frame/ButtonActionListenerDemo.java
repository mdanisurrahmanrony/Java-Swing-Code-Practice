package Frame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListenerDemo extends JFrame {    
    private Container c;
    private JTextField tf;
    private JButton btn1,btn2;
    private Font f;
    private Cursor cursor;
    ButtonActionListenerDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        f= new Font("Arial",Font.BOLD,18);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        tf  = new JTextField();
        tf.setFont(f);
        tf.setCursor(cursor);
        tf.setForeground(Color.BLUE);
        tf.setBackground(Color.lightGray);
        tf.setBounds(150,50,200,50);
        c.add(tf);
        
//        btn1=new JButton("Submit");
//        btn1.setFont(f);
//        btn1.setCursor(cursor);
//        btn1.setForeground(Color.BLUE);
//        btn1.setBackground(Color.lightGray);
//        btn1.setBounds(100,200,100,50);
//        c.add(btn1);
        
        btn2=new JButton("Clear");
        btn2.setFont(f);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.blue);
        btn2.setBackground(Color.lightGray);
        btn2.setBounds(150,110,100,50);
        c.add(btn2);
        
        btn2.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                tf.setText("");
            }
    });     
    }
    
    public static void main(String[] args) {
        ButtonActionListenerDemo frame = new ButtonActionListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("JButton ActionListener Demo");
    }
}
