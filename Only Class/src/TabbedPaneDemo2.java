import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo2 extends JFrame{
    
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1, panel2, panel3;
    private JLabel label1, label2, label3;
    private ImageIcon homeIcon,helpIcon,editIcon;

    TabbedPaneDemo2() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(800, 300, 450, 450);
        this.setTitle("JTabbed Pane Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        tp = new JTabbedPane(/*JTabbedPane.BOTTOM*/);
        //tp.setTabPlacement(JTabbedPane.BOTTOM);
        tp.setBounds(50,50,300,300);
        c.add(tp);
        
        homeIcon = new ImageIcon("src/Tabbed Pane Icon/Home.png");
        helpIcon = new ImageIcon("src/Tabbed Pane Icon/Help.png");
        editIcon = new ImageIcon("src/Tabbed Pane Icon/Edit.png");
        
        label1 = new JLabel("This is label1");
        label2 = new JLabel("This is label2");
        label3 = new JLabel("This is label3");
        
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.green);
        panel2 = new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.GRAY);
        panel3 = new JPanel();
        panel3.add(label3);
        panel3.setBackground(Color.MAGENTA);
        
        tp.addTab("Home", homeIcon, panel1, "Hello I am panel1 tab");
        tp.addTab("Help", helpIcon, panel2);
        tp.addTab("Edit", panel3);
    }
    
    public static void main(String[] args) {
        TabbedPaneDemo2 frame = new TabbedPaneDemo2();
        frame.setVisible(true);
    }

}