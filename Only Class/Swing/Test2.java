package Swing;

import javax.swing.JOptionPane;

public class Test2 {
    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null,"Enter your first name: ", "This is a Tite",JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null,"Enter your last name: ", "This is a Tite");
        String name=f_name+" "+l_name;
        JOptionPane.showMessageDialog(null, "Your full name is: " +name);
        
    }
}
