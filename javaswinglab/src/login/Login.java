package login;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String args[]){
        JFrame jf = new JFrame("Login page");


        //FOr username field.
        JLabel jl = new JLabel("Username: ");
        jl.setBounds(10,150,70,30);

        JTextField jtf =new JTextField();
        jtf.setBounds(90,150,200,30);

    //For password field.
        JLabel jlp = new JLabel("Password: ");
        jlp.setBounds(10,205,70,30);

        JPasswordField jtp =new JPasswordField();
        jtp.setBounds(90,205,200,30);



//        For login button
        JButton jb = new JButton("Login");
        jb.setBounds(140,250,100,30);

        jf.add(jl);
        jf.add(jlp);
        jf.add(jtf);
        jf.add(jtp);
        jf.add(jb);

        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jtf.getText();
                String password = new String(jtp.getPassword());
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","R@bindr@23");
                    PreparedStatement st = (PreparedStatement)conn.prepareStatement("SELECT name, password from Student where name=? and password=?");
                    st.setString(1,username);
                    st.setString(2,password);
                    ResultSet rs = st.executeQuery();
                    System.out.println("hello world");
                    System.out.println(rs);
                }

                catch(SQLException | ClassNotFoundException sqlException){
                    System.out.println("Wrong");
                    sqlException.printStackTrace();

                }
            }
        });
    }
}
