import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton signin, signup, clear;
    JTextField cardtextfield;
    JPasswordField pintextfield;
    Login(){

        setSize(1920, 1080);
        setLayout(null);

        setTitle("Automated Teller Machine");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel label = new JLabel(i3);
        label.setBounds(200, 30, 100, 100 );
        add(label);

        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel label2 = new JLabel("Welcome to the ATM");
        label2.setFont(new Font("Osward", Font.BOLD, 70));
        label2.setBounds(350, 60, 800, 60);
        add(label2);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Osward", Font.BOLD, 40));
        cardno.setBounds(270, 265, 300, 60);
        add(cardno);

        cardtextfield = new JTextField();
        cardtextfield.setFont(new Font("Osward", Font.BOLD, 25));
        cardtextfield.setBounds(520, 280, 450, 40);
        add(cardtextfield);


        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward", Font.BOLD, 40));
        pin.setBounds(270, 410, 300, 60);
        add(pin);

        pintextfield = new JPasswordField();
        pintextfield.setFont(new Font("Osward", Font.BOLD, 25));
        pintextfield.setBounds(520, 420, 450, 40);
        add(pintextfield);


        signin = new JButton("SIGN IN");
        signin.setFont(new Font("Osward", Font.BOLD, 25));
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.setBounds(520, 550, 150, 50);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("CLEAR");
        clear.setFont(new Font("Osward", Font.BOLD,25));
        clear.setBounds(810, 550, 150, 50);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);


        signup = new JButton("SIGN UP");
        signup.setBounds(520,650, 450, 50);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setFont(new Font("Osward", Font.BOLD, 25));
        signup.addActionListener(this);
        add(signup);






        setVisible(true);
    }


        @Override
        public void actionPerformed(ActionEvent e) {

        if(e.getSource() == clear){
            cardtextfield.setText("");
            pintextfield.setText("");
        } else if (e.getSource() == signin ) {
            Conn conn = new Conn();
            String cardnumber = cardtextfield.getText();
            String pinnumber = pintextfield.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' ";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number");
                }
            }catch (Exception E){
                E.printStackTrace();
                System.out.println(E);
            }
        } else if (e.getSource() == signup) {

            setVisible(false);
            new SignUp().setVisible(true);
        }

        }



    public static void main(String[] args){

        new Login();
        System.out.println("Running");
    }

}
