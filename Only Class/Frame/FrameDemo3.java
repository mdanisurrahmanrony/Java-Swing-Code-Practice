package Frame;
import javax.swing.JFrame;
public class FrameDemo3 extends JFrame{
    FrameDemo3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,50,400,300);
        setTitle("This is a Title");
    }
    public static void main(String[] args) {        
        FrameDemo3 frame=new FrameDemo3();
        frame.setVisible(true);        
        frame.setResizable(false);
    }
  
}
