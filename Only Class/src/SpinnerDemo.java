
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SpinnerDemo extends JFrame {
    
    private Container c;
    private JSpinner spinner;

    SpinnerDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(800, 300, 450, 450);
        this.setTitle("JSpinner Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        SpinnerNumberModel value =  new SpinnerNumberModel(10,0,30,1);
                
        spinner = new JSpinner(value);
        spinner.setBounds(100,100,70,50);
        c.add(spinner);

    }

    public static void main(String[] args) {
        SpinnerDemo frame = new SpinnerDemo();
        frame.setVisible(true);
    }

}
