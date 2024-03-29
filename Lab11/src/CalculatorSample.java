import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    private double num1, num2;
    private String ans, operator;
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextField();
        btn1 = new JButton("7");    
        btn2 = new JButton("8");
        btn3 = new JButton("9");    
        btn4 = new JButton("+");
        btn5 = new JButton("4");    
        btn6 = new JButton("5");
        btn7 = new JButton("6");    
        btn8 = new JButton("-");
        btn9 = new JButton("1");    
        btn10 = new JButton("2");
        btn11 = new JButton("3");   
        btn12 = new JButton("X");
        btn13 = new JButton("0");   
        btn14 = new JButton("c");
        btn15 = new JButton("=");   
        btn16 = new JButton("/");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        
        
        fr.setLayout(new BorderLayout());
        fr.add(txt, BorderLayout.NORTH);
        p.setLayout(new GridLayout(4, 4));
        p.add(btn1);    
        p.add(btn2);    
        p.add(btn3);    
        p.add(btn4);
        p.add(btn5);    
        p.add(btn6);    
        p.add(btn7);    
        p.add(btn8);
        p.add(btn9);    
        p.add(btn10);    
        p.add(btn11);    
        p.add(btn12);
        p.add(btn13);    
        p.add(btn14);    
        p.add(btn15);    
        p.add(btn16);
        fr.add(p, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        Object s = ae.getSource();
        switch (ae.getActionCommand()){
            case "0" -> txt.setText(txt.getText() + "0");
            case "1" -> txt.setText(txt.getText() + "1");
            case "2" -> txt.setText(txt.getText() + "2");
            case "3" -> txt.setText(txt.getText() + "3");
            case "4" -> txt.setText(txt.getText() + "4");
            case "5" -> txt.setText(txt.getText() + "5");
            case "6" -> txt.setText(txt.getText() + "6");
            case "7" -> txt.setText(txt.getText() + "7");
            case "8" -> txt.setText(txt.getText() + "8");
            case "9" -> txt.setText(txt.getText() + "9");
        }
        if (s.equals(btn4)){
            num1 = Double.parseDouble(txt.getText());
            txt.setText("");
            operator = "+";
        }
        else if (s.equals(btn8)){
            num1 = Double.parseDouble(txt.getText());
            txt.setText("");
            operator = "-";
        }
        else if(s.equals(btn12)){
            num1 = Double.parseDouble(txt.getText());
            txt.setText("");
            operator = "*";
        }
        else if(s.equals(btn14)){
            num1 = 0;
            num2 = 0;
            operator = "";
            txt.setText("");
        }
        else if (s.equals(btn16)){
            num1 = Double.parseDouble(txt.getText());
            txt.setText("");
            operator = "/";
        }
        else if (s.equals(btn15)){
            num2 = Double.parseDouble(txt.getText());
            switch (operator){
                case "+" -> txt.setText(String.valueOf(num1 + num2));
                case "-" -> txt.setText(String.valueOf(num1 - num2));
                case "*" -> txt.setText(String.valueOf(num1 * num2));
                case "/" -> txt.setText(String.valueOf(num1 / num2));
            }
        }
    }
}