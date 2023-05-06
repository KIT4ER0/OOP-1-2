
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;

public class StudentView implements ActionListener, WindowListener{
    
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel lb1, lb2, lb3;
    private JButton btn1, btn2;
    private JTextField f1, f2, f3;
    private Student student;
    private File f;
    
    public StudentView(){
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        lb1 = new JLabel("ID: ");
        lb2 = new JLabel("Name: ");
        lb3 = new JLabel("Money :");
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        student = new Student();
        f = new File("StudentM.dat");
        
        f3.setEnabled(false);
        fr.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3, 2));
        p2.setLayout(new FlowLayout());
        
        p1.add(lb1);
        p1.add(f1);
        p1.add(lb2);
        p1.add(f2);
        p1.add(lb3);
        p1.add(f3);
        p2.add(btn1);
        p2.add(btn2);
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.SOUTH);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new StudentView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btn1)){
            student.setMoney(student.getMoney() + 100);
        }
        else if(e.getSource().equals(btn2)){
            if(student.getMoney() <= 0){
                student.setMoney(0);
            }
            else{
                student.setMoney(student.getMoney() - 100);
            }
        }
        f3.setText(String.valueOf(student.getMoney()));
        student.setID(Integer.parseInt(f1.getText()));
        student.setName(f2.getText());
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if(f.exists()){
            try{
                FileInputStream fin = new FileInputStream("StudentM.dat");
                ObjectInputStream oin = new ObjectInputStream(fin);
                student = (Student)oin.readObject();
                f1.setText(student.getID() + "");
                f2.setText(student.getName());
                f3.setText(student.getMoney() + "");
                oin.close();
                fin.close();
            }catch(IOException | ClassNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
       try{
           FileOutputStream fout = new FileOutputStream("StudentM.dat");
           ObjectOutputStream oout = new ObjectOutputStream(fout);
           oout.writeObject(student);
           oout.close();
           fout.close();
       }catch(IOException ex){
           ex.printStackTrace();
       }
    }
    
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
