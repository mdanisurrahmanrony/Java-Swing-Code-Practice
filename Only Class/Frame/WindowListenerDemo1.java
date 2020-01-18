package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowListenerDemo1 extends JFrame {

    private Container c;
    
    WindowListenerDemo1() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("Window Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        this.addWindowListener(new WindowListener(){        //Add WindowListener with frame
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
            System.out.println("Window Iconified");                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
            
        });
    }

    public static void main(String[] args) {
        WindowListenerDemo1 frame = new WindowListenerDemo1();
        frame.setVisible(true);
    }

}
