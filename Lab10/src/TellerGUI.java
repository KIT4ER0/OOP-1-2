import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel l1, l2;
    private JTextField txt1, txt2;
    private JButton btn1, btn2, btn3;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();    p2 = new JPanel();    p3 = new JPanel();
        l1 = new JLabel("Balance"); l2 = new JLabel("Amount");
        txt1 = new JTextField("6000");  txt2 = new JTextField();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        
        fr.setLayout(new GridLayout(4, 1));
        p1.setLayout(new GridLayout(1, 2));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new FlowLayout());
        p1.add(l1);     p1.add(txt1);   
        p2.add(l2);     p2.add(txt2);
        p3.add(btn1);   p3.add(btn2);   p3.add(btn3);
        fr.add(p1);     fr.add(p2);     fr.add(p3);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
