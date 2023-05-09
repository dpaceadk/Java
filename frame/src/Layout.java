
import javax.swing.*;
import java.awt.*;

class Layout {
    JFrame frame = new JFrame();
    public void render(){
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 =new JPanel();
        p1.setBackground(Color.CYAN);
        frame.add(p1,BorderLayout.EAST);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.CYAN);
        frame.add(p2,BorderLayout.WEST);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.CYAN);
        frame.add(p3,BorderLayout.NORTH);
        JPanel p4 = new JPanel();
        p4.setBackground(Color.CYAN);
        frame.add(p4,BorderLayout.SOUTH);
        JPanel p5 = new JPanel();
        p5.setBackground(Color.GREEN);
        frame.add(p5,BorderLayout.CENTER);
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p3.add(new JButton("Click me"));
        p3.add(new JButton("Click me"));
        p3.add(new JButton("Click me"));
        p3.add(new JButton("Click me"));

        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        p1.add(new JButton("Click me"));
        p1.add(new JButton("Click me"));
        p1.add(new JButton("Click me"));

        p5.setLayout(new GridLayout(2,2));
        p5.add(new JButton("Click me"));
        p5.add(new JButton("Click me"));
        p5.add(new JButton("Click me"));









    }
}
