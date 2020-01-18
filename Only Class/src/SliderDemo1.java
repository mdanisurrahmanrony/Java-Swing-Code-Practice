import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderDemo1 extends JFrame{
    
    private Container c;
    private JButton btn;
    private JSlider slider;
        
    SliderDemo1 (){
        initComponents();        
    }


    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 300);
        this.setTitle("Slider Demo");

        c = this.getContentPane(); 
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        slider = new JSlider(/*JSlider.VERTICAL, //For Vertical */0,20,0);   //Minimum, Maximum and Where knobs will stay
        slider.setBounds(100,50,300,50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);
                
    }
    
    public static void main(String[] args) {
        SliderDemo1 frame = new SliderDemo1();
        frame.setVisible(true);
    }

}

