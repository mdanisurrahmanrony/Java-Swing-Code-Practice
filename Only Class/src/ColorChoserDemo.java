import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChoserDemo extends JFrame{
    
    private Container c;
    private JButton bt;

    ColorChoserDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(800, 300, 500, 400);
        this.setTitle("ColorChoser Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        bt = new JButton("Choose a color");
        bt.setBounds(100,50,150,50);
        c.add(bt);
        
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Color color = JColorChooser.showDialog(null, "Select a color", Color.yellow);
                c.setBackground(color);
            }
        });
    }
    
    public static void main(String[] args) {
        ColorChoserDemo frame = new ColorChoserDemo();
        frame.setVisible(true);
    }

}