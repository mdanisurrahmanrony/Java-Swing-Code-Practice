package Swing;

import javax.swing.JOptionPane;

public class Test3 {
    public static void main(String[] args) {
        int choice=JOptionPane.showConfirmDialog(null, "Do you want to quite this program? ", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            System.exit(0);;
        }
        else        {
            System.out.println("You have clicked no option");
        }
    }
}
