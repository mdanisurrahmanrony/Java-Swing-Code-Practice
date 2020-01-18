package Frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxDemo1 extends JFrame{
    private Container c;
    private JComboBox cb;
    private String[] progLanguage = {"C","C++","Java","PHP","Python"};
    ComboBoxDemo1(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("ComboBox Demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        cb = new JComboBox(progLanguage);
        cb.setBounds(50,150,100,50);
        cb.setEditable(true);   //For Making Combo Box Editable
        //cb.setSelectedIndex(3);     //For select index of Item at first
        cb.setSelectedItem("PHP");     //For select Item directly at first
        cb.addItem("Fortran");      //For adding new option
        cb.addItem("BASIC");      //For adding new option
        cb.removeItem("Fortran");       //For deleting item by name
        cb.removeItemAt(1);       //For deleting item by index (Here C++ item has been deleted)
        c.add(cb);        
        System.out.println("Total item = "+cb.getItemCount());      //For count the number of Combo Box Item
        //cb.removeAllItems();    //For delete all items
    }
    public static void main(String[] args) {
        ComboBoxDemo1 frame = new ComboBoxDemo1();
        frame.setVisible(true);
    }
}
