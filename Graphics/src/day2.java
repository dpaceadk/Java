import javax.swing.*;

public class day2 {
    JFrame frame=new JFrame();
    UI box = new UI();
     void day2(){
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(box);

    }
}
