import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo extends JFrame{
    
    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane scroll;
    private String[] cols = {"ID", "Name", "CGPA"};
    private String[][] rows = {{"101", "RONY", "4.00"},
                              {"102", "Sajib", "3.25"},
                              {"103", "Ishrat", "3.80"},
                              {"104", "Kamal", "2.95"},
                              {"102", "Sajib", "3.25"},
                              {"103", "Ishrat", "3.80"},
                              {"104", "Kamal", "2.95"},
                              {"102", "Sajib", "3.25"},
                              {"103", "Ishrat", "3.80"},
                              {"104", "Kamal", "2.95"},
                              {"101", "RONY", "4.00"},
                              {"102", "Sajib", "3.25"},
                              {"103", "Ishrat", "3.80"},
                              {"101", "RONY", "4.00"},
                              {"102", "Sajib", "3.25"},
                              {"103", "Ishrat", "3.80"},
                            };

    TableDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(800, 300, 750, 450);
        this.setTitle("Table Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        font = new Font("Arial",Font.BOLD,22);

        label = new JLabel("Students Details");
        label.setBounds(250,20,200,50);
        label.setFont(font);
        c.add(label);
        
        table = new JTable(rows,cols);
        table.setSelectionBackground(Color.cyan);       //Add Color Option in Rows
        //table.setEnabled(false);      //Stop edit option
        
        scroll = new JScrollPane(table);
        scroll.setBounds(50,80,600,150);
        c.add(scroll);
    }
    
    public static void main(String[] args) {
        TableDemo frame = new TableDemo();
        frame.setVisible(true);
    }

}