package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerDemo2 extends JFrame implements ActionListener{

    private Container c;
    
    private JButton redButton,greenButton,blueButton;

    ListenerDemo2() {
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
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==redButton){
           c.setBackground(Color.red);
       }
       else if(e.getSource()==blueButton){
           c.setBackground(Color.blue);
       }
       else{
           c.setBackground(Color.green);
       }
    }

    public static void main(String[] args) {
        ListenerDemo2 frame = new ListenerDemo2();
        frame.setVisible(true);
    }
    
}

