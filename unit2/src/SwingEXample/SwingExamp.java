package SwingEXample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class SwingExamp  {
    public static void main(String args[]){
        JFrame frame = new JFrame("Registration page");
        JLabel jlabel = new JLabel("Full Name: ");
        jlabel.setBounds(100,50,200,50);
        frame.add(jlabel);
        JTextField jtext = new JTextField();
        jtext.setBounds(170,50,250,50);
        frame.add(jtext);
        ButtonGroup bgroup = new ButtonGroup();
        JRadioButton jcbm = new JRadioButton("Male",true);
        jcbm.setBounds(100,100,150,30);
        bgroup.add(jcbm);
        frame.add(jcbm);
        JRadioButton jcbf = new JRadioButton("Female");
        jcbf.setBounds(100,130,150,30);
        bgroup.add(jcbf);
        frame.add(jcbf);

        JMenuBar menubar = new JMenuBar();
        menubar.setBounds(100,150,150,50);
        JMenu jm =new JMenu("Courses Options");
        JCheckBoxMenuItem jc1 = new JCheckBoxMenuItem("CSIT");
        JCheckBoxMenuItem jc2 = new JCheckBoxMenuItem("BCA");


        jm.add(jc1);
        jm.add(jc2);
        menubar.add(jm);
        frame.add(menubar);

        String[] items = {"Items1","Items2","Items3","Items4"};
        JList<String> jlist = new JList<String>(items);
        JScrollPane jscroll = new JScrollPane(jlist);
        jscroll.setBounds(100,250,200,50);
        frame.add(jscroll);

        JButton button = new JButton("Register");
        button.setBounds(100,320,100,50);
        frame.add(button);

        JTextField output = new JTextField();
        output.setBounds(100,400,100,50);

        frame.add(output);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String fullname = jtext.getText();
                        output.setText(fullname);
                        System.out.println(fullname);
                    }
                }
        );

    }



}
