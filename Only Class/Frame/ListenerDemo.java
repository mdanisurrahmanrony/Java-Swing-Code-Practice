package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerDemo extends JFrame {

    private Container c;
    
    private JButton redButton,greenButton,blueButton;

    ListenerDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("ComboBox Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        //creating and adding button1
        redButton = new JButton("RED");
        redButton.setBounds(50,50,100,50);
        c.add(redButton);
        
        //creating and adding button2
        greenButton = new JButton("GREEN");
        greenButton.setBounds(50,110,100,50);
        c.add(greenButton);
        
        //creating and adding button3
        blueButton = new JButton("BLUE");
        blueButton.setBounds(50,170,100,50);
        c.add(blueButton);       
        
        //Adding Action Listener
        
        greenButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.green);
            }
            
        });
        blueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.blue);
            }
            
        });
        redButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.red);
            }
            
        });
        
    }

    public static void main(String[] args) {
        ListenerDemo frame = new ListenerDemo();
        frame.setVisible(true);
    }
}

