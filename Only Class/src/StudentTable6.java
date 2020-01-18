
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentTable6 extends JFrame implements ActionListener {

    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private Container c;
    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gpaLabel;
    private JTextField fnTf, lnTf, phoneTf, gpaTf;
    private JButton addButton, updateButton, deleteButton, clearButton;
    private String[] columns = {"First Name", "Last Name", "Phone Number", "GPA"};
    private String[] rows = new String[4];

    StudentTable6() {
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

        Font font = new Font("Arial", Font.BOLD, 18);

        titleLabel = new JLabel("Student Registration");
        titleLabel.setBounds(140, 10, 250, 50);
        titleLabel.setFont(font);
        c.add(titleLabel);

        fnLabel = new JLabel("First Name ");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(120, 80, 200, 30);
        fnTf.setFont(font);
        c.add(fnTf);

        addButton = new JButton("Add");
        addButton.setBounds(400, 80, 120, 30);
        addButton.setFont(font);
        c.add(addButton);

        lnLabel = new JLabel("Last Name ");
        lnLabel.setBounds(10, 130, 150, 30);
        lnLabel.setFont(font);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(120, 130, 200, 30);
        lnTf.setFont(font);
        c.add(lnTf);

        updateButton = new JButton("Update");
        updateButton.setBounds(400, 130, 120, 30);
        updateButton.setFont(font);
        c.add(updateButton);

        phoneLabel = new JLabel("Phone ");
        phoneLabel.setBounds(10, 180, 150, 30);
        phoneLabel.setFont(font);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(120, 180, 200, 30);
        phoneTf.setFont(font);
        c.add(phoneTf);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 180, 120, 30);
        deleteButton.setFont(font);
        c.add(deleteButton);

        gpaLabel = new JLabel("GPA ");
        gpaLabel.setBounds(10, 230, 150, 30);
        gpaLabel.setFont(font);
        c.add(gpaLabel);

        gpaTf = new JTextField();
        gpaTf.setBounds(120, 230, 200, 30);
        gpaTf.setFont(font);
        c.add(gpaTf);

        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 230, 120, 30);
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
        scroll.setBounds(10, 360, 740, 265);
        c.add(scroll);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                int numberofRow = table.getSelectedRow();

                String f_name = model.getValueAt(numberofRow, 0).toString();
                String l_name = model.getValueAt(numberofRow, 1).toString();
                String phone = model.getValueAt(numberofRow, 2).toString();
                String gpa = model.getValueAt(numberofRow, 3).toString();

                fnTf.setText(f_name);
                lnTf.setText(l_name);
                phoneTf.setText(phone);
                gpaTf.setText(gpa);

            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {

            rows[0] = fnTf.getText();
            rows[1] = lnTf.getText();
            rows[2] = phoneTf.getText();
            rows[3] = gpaTf.getText();
            model.addRow(rows);

        } else if (e.getSource() == clearButton) {

            fnTf.setText("");
            lnTf.setText("");
            phoneTf.setText("");
            gpaTf.setText("");

        } else if (e.getSource() == deleteButton) {

            int numberOfRow = table.getSelectedRow();
            if (numberOfRow >= 0) {
                model.removeRow(numberOfRow);
            } else {
                JOptionPane.showMessageDialog(null, "No row has been selected or no row exists");
            }
        }
        else  if(e.getSource() == updateButton){
            
            int numberOfRow = table.getSelectedRow();
            
            String f_name = fnTf.getText();
            String l_name = lnTf.getText();
            String phone = phoneTf.getText();
            String gpa = gpaTf.getText();
            
            model.setValueAt(f_name, numberOfRow, 0);
            model.setValueAt(l_name, numberOfRow, 1);
            model.setValueAt(phone, numberOfRow, 2);
            model.setValueAt(gpa, numberOfRow, 3);
        }
    }

    public static void main(String[] args) {
        StudentTable6 frame = new StudentTable6();
        frame.setVisible(true);
    }

}
