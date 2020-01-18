package Frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayOutDemo extends JFrame {

    private Container c;
    private JButton buttons[];
    private BoxLayout box;
        
    BoxLayOutDemo (){
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 670, 500);
        this.setTitle("BoxLayout Demo");

        c = this.getContentPane();
        
        //BoxLayout(Conntainer c, int axis)
        
        box = new BoxLayout(c,BoxLayout.Y_AXIS);    //For Vertically Button Add
       //box = new BoxLayout(c,BoxLayout.X_AXIS);    //For Horizontally Button Add
        c.setLayout(box);
        c.setBackground(Color.cyan);
        
        buttons = new JButton[9];
        
        for (int i=0 ; i<9 ; i++){
            buttons[i] = new JButton("" + (i+1));
            c.add(buttons[i]);
        }
                
    }

    public static void main(String[] args) {
        BoxLayOutDemo frame = new BoxLayOutDemo();
        frame.setVisible(true);
    }

}
