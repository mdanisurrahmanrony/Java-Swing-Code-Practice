package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class VowelCounterUsingKeyListener extends JFrame {

    private Container c;
    private JTextField tf;
    private JTextArea inputTextArea;
    private JLabel promptLabel, vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
    private JScrollPane scroll;
    int totalVowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;

    VowelCounterUsingKeyListener() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Counting Vowel App Using KeyListener");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        promptLabel = new JLabel("Enter the Text : ");
        promptLabel.setBounds(10, 20, 100, 30);
        c.add(promptLabel);

        inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);

        scroll = new JScrollPane(inputTextArea);
        scroll.setBounds(110, 20, 450, 100);
        c.add(scroll);

        vowelLabel = new JLabel();
        vowelLabel.setBounds(110, 150, 250, 30);
        c.add(vowelLabel);

        aLabel = new JLabel();
        aLabel.setBounds(110, 190, 150, 30);
        c.add(aLabel);

        eLabel = new JLabel();
        eLabel.setBounds(110, 230, 150, 30);
        c.add(eLabel);

        iLabel = new JLabel();
        iLabel.setBounds(110, 270, 150, 30);
        c.add(iLabel);

        oLabel = new JLabel();
        oLabel.setBounds(110, 310, 150, 30);
        c.add(oLabel);

        uLabel = new JLabel();
        uLabel.setBounds(110, 350, 150, 30);
        c.add(uLabel);

        inputTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getSource()==inputTextArea){
                    if(ke.VK_A==ke.getKeyCode()){
                        letter_a++;
                        totalVowel++;
                    }
                    if(ke.VK_E==ke.getKeyCode()){
                        letter_e++;
                        totalVowel++;
                    }
                    if(ke.VK_I==ke.getKeyCode()){
                        letter_i++;
                        totalVowel++;
                    }
                    if(ke.VK_O==ke.getKeyCode()){
                        letter_o++;
                        totalVowel++;
                    }
                    if(ke.VK_U==ke.getKeyCode()){
                        letter_u++;
                        totalVowel++;
                    }
                    vowelLabel.setText("Total number of vowels: "+totalVowel);
                    aLabel.setText("Total number of a: "+letter_a);
                    eLabel.setText("Total number of e: "+letter_e);
                    iLabel.setText("Total number of i: "+letter_i);
                    oLabel.setText("Total number of o: "+letter_o);
                    uLabel.setText("Total number of u: "+letter_u);
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
    }

    public static void main(String[] args) {
        VowelCounterUsingKeyListener frame = new VowelCounterUsingKeyListener();
        frame.setVisible(true);
    }

}
