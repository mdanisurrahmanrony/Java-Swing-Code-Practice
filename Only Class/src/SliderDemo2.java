import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SliderDemo2 extends JFrame{
    
    private Container c;
    private JLabel redLabel, greenLabel, blueLabel, previewLabel;
    private JSlider redSlider, greenSlider, blueSlider;
    private JTextField redTf,greenTf,blueTf;
    private JPanel panel;
        
    SliderDemo2 (){
        initComponents();        
    }


    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 350);
        this.setTitle("Slider Project With Listener");

        c = this.getContentPane(); 
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        redLabel = new JLabel("Red");
        redLabel.setBounds(50,50,80,50);
        c.add(redLabel);
        
        redSlider = new JSlider(0,255,0);
        redSlider.setBounds(90,50,300,50);
        c.add(redSlider);
        
        redTf = new JTextField();
        redTf.setHorizontalAlignment(JTextField.CENTER);
        redTf.setBounds(400,50,120,50);
        c.add(redTf);
        
        greenLabel = new JLabel("Green");
        greenLabel.setBounds(50,110,80,50);
        c.add(greenLabel);
        
        greenSlider = new JSlider(0,255,0);
        greenSlider.setBounds(90,110,300,50);
        c.add(greenSlider);
        
        greenTf = new JTextField();
        greenTf.setHorizontalAlignment(JTextField.CENTER);
        greenTf.setBounds(400,110,120,50);
        c.add(greenTf);
        
        blueLabel = new JLabel("Blue");
        blueLabel.setBounds(50,170,80,50);
        c.add(blueLabel);
        
        blueSlider = new JSlider(0,255,0);
        blueSlider.setBounds(90,170,300,50);
        c.add(blueSlider);
        
        blueTf = new JTextField();
        blueTf.setHorizontalAlignment(JTextField.CENTER);
        blueTf.setBounds(400,170,120,50);
        c.add(blueTf);
        
        panel = new JPanel();
        panel.setBounds(550,50,200,170);
        panel.setBackground(Color.GREEN);
        c.add(panel);
        
        previewLabel = new JLabel("Preview");
        previewLabel.setBounds(630,210,100,50);
        c.add(previewLabel);
                
    }
    
    public static void main(String[] args) {
        SliderDemo2 frame = new SliderDemo2();
        frame.setVisible(true);
    }

}

