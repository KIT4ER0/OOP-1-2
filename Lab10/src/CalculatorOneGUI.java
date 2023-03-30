import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;
    public CalculatorOneGUI(){
        fr = new JFrame("Calculator");
        p = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn1 = new JButton("add");
        btn2 = new JButton("Subtract");
        btn3 = new JButton("Multiply");
        btn4 = new JButton("Divide");
        
        fr.setLayout(new GridLayout(4,0));
        p.setLayout(new FlowLayout());
        p.add(btn1);    p.add(btn2);    p.add(btn3);    p.add(btn4);
        fr.add(txt1);   fr.add(txt2);   fr.add(p);  fr.add(txt3);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
