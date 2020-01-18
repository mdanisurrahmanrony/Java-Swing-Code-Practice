package togglebuttondemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ToggleButtonDemo2 extends JFrame  implements ActionListener{
    
    private Container c;
    private JButton prevButton, nextButton;
    private JToggleButton tb;    
    private JLabel label;
    private ImageIcon onIcon, offIcon;
        
    ToggleButtonDemo2 (){
        initComponents();        
    }


    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("ToggleButton Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        onIcon = new ImageIcon("src/On.png");
        offIcon = new ImageIcon("src/Off.png");
        
        tb = new JToggleButton(offIcon);
        tb.setBounds(50,50,90,90);
        c.add(tb);
        
        label = new JLabel("Hello there");
        label.setVisible(false);
        label.setBounds(50,150,150,50);
        c.add(label);
        
        tb.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(tb.isSelected()){
            tb.setIcon(onIcon);
            label.setVisible(true);
        }
        else{
            
            tb.setIcon(offIcon);
            label.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        ToggleButtonDemo2 frame = new ToggleButtonDemo2();
        frame.setVisible(true);
    }

}

