package Frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo extends JFrame implements ActionListener{
    private CardLayout card;
    private Container c;
    private JButton prevButton, nextButton;
    private  JPanel panel;
    private ImageIcon icon;
    private JLabel label;
        
    SlideShowDemo (){
        initComponents();
        showImage();
    }
    
    public void showImage(){
        String[] imageNames = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg"};
        for (String n:imageNames){
            icon = new ImageIcon("src/Frame/Image Folder/"+n);
            
            //Resizing the  image
            Image iamge = icon.getImage();
            Image newImage=iamge.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);
            label = new JLabel(icon);
            panel.add(label);
        }       
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Slide Show Demo Project");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        card =  new CardLayout();
        
        panel =  new JPanel(card);
        panel.setBounds(10,10,560,380);
        c.add(panel);

        prevButton  = new JButton("Previous");
        prevButton.setBounds(10,400,100,50);
        c.add(prevButton);
        
        nextButton  = new JButton("Next");
        nextButton.setBounds(470,400,100,50);
        c.add(nextButton);  
        prevButton.addActionListener(this);
        nextButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prevButton){
            card.previous(panel);
        }
        if(e.getSource()==nextButton){
            card.next(panel);
        }
    }
    
    public static void main(String[] args) {
        SlideShowDemo frame = new SlideShowDemo();
        frame.setVisible(true);
    }

}

