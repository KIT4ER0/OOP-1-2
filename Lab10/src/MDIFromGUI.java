import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, mi1;
    private JMenuItem mi2, mi3, mi4, mi5, mi6;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File"); m2 = new JMenu("Edit"); m3 = new JMenu("View");
        mi1 = new JMenu("New");             mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");        mi4 = new JMenuItem("Exit");
        mi5 = new JMenuItem("Window");      mi6 = new JMenuItem("Message");
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        
        fr.setJMenuBar(mb);
        mb.add(m1);     mb.add(m2);     mb.add(m3);
        m1.add(mi1);    m1.add(mi2);    m1.addSeparator();
        m1.add(mi3);    m1.addSeparator();      m1.add(mi4);
        mi1.add(mi5);   mi1.add(mi6);
        desktopPane.setBackground(Color.black);
        
        frame1.setSize(200, 200);   frame1.setLocation(50, 50);
        frame1.setVisible(true);    desktopPane.add(frame1);
        
        frame2.setSize(200, 200);   frame2.setLocation(300, 100);
        frame2.setVisible(true);    desktopPane.add(frame2);
        
        frame3.setSize(300, 200);   frame3.setLocation(600, 100);
        frame3.setVisible(true);    desktopPane.add(frame3);
        
        fr.add(desktopPane);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
