import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hi");
        JTextField field=new JTextField("Username");
        field.setBounds(10,10,300,50);
        frame.add(field);
        JTextField lop=new JTextField("Password");
        lop.setBounds(10,60,300,50);
        frame.add(lop);
        JButton button=new JButton("Login");
        button.setBounds(100,160,100,50);
        frame.add(button);
        String[] fruits = {"Apple","Orange"};
        JComboBox combo=new JComboBox(fruits);
        combo.setBounds(10,110,300,50);
        frame.add(combo);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
