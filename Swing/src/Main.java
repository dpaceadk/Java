import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Hello world");
        JButton button=new JButton("Click me");
        button.setBounds(100,100,100,50);
        frame.add(button);
       //JTextField textField=new JTextField("enter your name");
       // textField.setBounds(100,150,100,50);
        //frame.add(textField);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.RED);
    }
}