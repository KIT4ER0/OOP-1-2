
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class ChatDemo implements ActionListener, WindowListener{
    
    private JFrame fr;
    private JPanel p1;
    private JTextField field;
    private JTextArea window;
    private JButton btn1, btn2;
    private String txt;
    private File f;
    
    public ChatDemo(){
        fr = new JFrame();
        p1 = new JPanel();
        field = new JTextField(45);
        window = new JTextArea(20, 45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");
        f = new File("ChatDemo.dat");
        
        fr.setLayout(new BorderLayout());
        p1.setLayout(new FlowLayout());
        p1.add(btn1);
        p1.add(btn2);
        fr.add(window, BorderLayout.NORTH);
        fr.add(field, BorderLayout.CENTER);
        fr.add(p1, BorderLayout.SOUTH);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btn1)){
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            window.setText(window.getText() + date.format(LocalDateTime.now()) + ": " + field.getText() + "\n");
            field.setText("");
        }
        else if(e.getSource().equals(btn2)){
            window.setText("");
            field.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if(f.exists()){
            try(FileInputStream fr = new FileInputStream("ChatDemo.dat")){
                int i = fr.read();
                while(i != -1){
                    window.setText(window.getText() + (char)i);
                    i = fr.read();
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(FileOutputStream fout = new FileOutputStream("ChatDemo.dat")){
            for(int i =0; i < window.getText().length(); i++){
                fout.write(window.getText().charAt(i));
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new ChatDemo();
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
