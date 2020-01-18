
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerDemo2 extends JFrame implements ChangeListener{
    
    private Container c;
    private JSpinner spinner;
    private JLabel label;

    SpinnerDemo2() {
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
        spinner.addChangeListener(this);
        
        label = new JLabel("Current value : 10");
        label.setBounds(100,200,150,50);
        c.add(label);        

    }
    
    
    @Override
    public void stateChanged(ChangeEvent e) {
        String number = spinner.getValue().toString();
        int value = Integer.parseInt(number);
        label.setText("Current value : "+value) ;
   }

    public static void main(String[] args) {
        SpinnerDemo2 frame = new SpinnerDemo2();
        frame.setVisible(true);
    }

}