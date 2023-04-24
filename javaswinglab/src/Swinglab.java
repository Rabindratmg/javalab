import javax.swing.*;

public class Swinglab {
    public static void main(String[] args){
        JFrame f= new JFrame();
        JButton b = new JButton("Login");
        b.setBounds(200,200,400,400);
        f.add(b);
        f.setSize(100,100);
        f.setVisible(true);
    }
}
