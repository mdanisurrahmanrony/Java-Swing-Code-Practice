import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MyMenu3 extends JFrame implements ActionListener{
    
    private ImageIcon cutIcon, newIcon;
    private JMenuBar menubar;
    private JMenu file,edit,help;
    private JMenuItem newItem,openItem,exitItem,cutItem,copyItem,pasteItem,selectAllItem;

    MyMenu3() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 100, 600, 500);
        this.setTitle("Menu Demo");
        
        cutIcon =new ImageIcon("src/images/cut.png");
        newIcon =new ImageIcon("src/images/newImage.png");
        
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        
        newItem = new JMenuItem("New");
        newItem.setIcon(newIcon);
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));    //Pressing Ctrl+N button of keyboard combinedly related action (New Form will be opened) will be taken without clicking
        
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");
        cutItem = new JMenuItem("Cut");
        cutItem.setIcon(cutIcon);
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        selectAllItem = new JMenuItem("Select All");
        
        file.add(newItem);
        file.add(openItem);
        file.add(exitItem);
        
        edit.add(cutItem);
        edit.addSeparator();
        
        edit.add(copyItem);
        edit.addSeparator();
        edit.add(pasteItem);
        edit.add(selectAllItem);
        
        newItem.addActionListener(this);
        exitItem.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == newItem){
            
            JFrame newFrame = new JFrame();
            newFrame.setVisible(true);
            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newFrame.setBounds(300,100,600,500);
            newFrame.setTitle("New Frame");
            
        }
        else if(e.getSource() == exitItem){
            
            System.exit(0);
            
        }
        
    }

    public static void main(String[] args) {
        MyMenu3 frame = new MyMenu3();
        frame.setVisible(true);
    }

}
