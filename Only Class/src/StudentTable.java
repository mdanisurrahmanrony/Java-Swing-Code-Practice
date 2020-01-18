import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends JFrame{
    
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private Container c;
    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gpaLabel;
    private JTextField fnTf, lnTf, phoneTf, gpaTf;
    private JButton addButton, updateButton, deleteButton, clearButton;
    private String[] columns = {"First Name", "Last Name", "Phone Number", "GPA"};
    private String[] rows = new String[4];
    
    StudentTable() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(780, 690);
        this.setLocationRelativeTo(null);
        this.setTitle("Student Table");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        Font font = new Font("Arial", Font.BOLD, 20);
        
        titleLabel = new JLabel("Student Registration");
        titleLabel.setBounds(140, 10, 250, 50);
        titleLabel.setFont(font);
        c.add(titleLabel);
        
        fnLabel = new JLabel("First Name ");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        c.add(fnLabel);
        
        fnTf = new JTextField();
        fnTf.setBounds(120,80,200,30);
        fnTf.setFont(font);
        c.add(fnTf);
        
        addButton = new JButton("Add");
        addButton.setBounds(400,80,120,30);
        addButton.setFont(font);
        c.add(addButton);
        
        lnLabel = new JLabel("Last Name ");
        lnLabel.setBounds(10,130, 150, 30);
        lnLabel.setFont(font);
        c.add(lnLabel);
        
        lnTf = new JTextField();
        lnTf.setBounds(120,130,200,30);
        lnTf.setFont(font);
        c.add(lnTf);
        
        updateButton = new JButton("Update");
        updateButton.setBounds(400,130,120,30);
        updateButton.setFont(font);
        c.add(updateButton);
        
        phoneLabel = new JLabel("Phone ");
        phoneLabel.setBounds(10,180, 150, 30);
        phoneLabel.setFont(font);
        c.add(phoneLabel);
        
        phoneTf = new JTextField();
        phoneTf.setBounds(120,180,200,30);
        phoneTf.setFont(font);
        c.add(phoneTf);
        
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400,180,120,30);
        deleteButton.setFont(font);
        c.add(deleteButton);
        
        gpaLabel = new JLabel("GPA ");
        gpaLabel.setBounds(10,230, 150, 30);
        gpaLabel.setFont(font);
        c.add(gpaLabel);
        
        gpaTf = new JTextField();
        gpaTf.setBounds(120,230,200,30);
        gpaTf.setFont(font);
        c.add(gpaTf);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(400,230,120,30);
        clearButton.setFont(font);
        c.add(clearButton);
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(10,360,740,265);
        c.add(scroll);
        
    }
    
    public static void main(String[] args) {
        StudentTable frame = new StudentTable();
        frame.setVisible(true);
    }

}