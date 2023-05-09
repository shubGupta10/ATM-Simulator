import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton rs100, rs500, rs1000, rs2000, rs5000, rs10000, back;

    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;

        setSize(1920, 1080);
        setLayout(null);
        //setUndecorated(true);
        setVisible(true);


        getContentPane().setBackground(Color.GRAY);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setSize(900,900);
        image.setLocation(300,0);
        add(image);


        JLabel text = new JLabel("Select Withdrawal amount:");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(text);

        rs100 = new JButton("Rs 100");
        rs100.setBounds(170, 415, 150, 30);
        rs100.addActionListener(this);
        image.add(rs100);

        rs500 = new JButton("Rs 500");
        rs500.setBounds(355, 415, 150, 30);
        rs500.addActionListener(this);
        image.add(rs500);


        rs1000 = new JButton("Rs 1000");
        rs1000.setBounds(170, 450, 150, 30);
        rs1000.addActionListener(this);
        image.add(rs1000);


        rs2000 = new JButton("Rs 2000");
        rs2000.setBounds(355, 450, 150, 30);
        rs2000.addActionListener(this);
        image.add(rs2000);

        rs5000 = new JButton("Rs 5000");
        rs5000.setBounds(170, 485, 150, 30);
        rs5000.addActionListener(this);
        image.add(rs5000);


        rs10000 = new JButton("Rs 10000");
        rs10000.setBounds(355, 485, 150, 30);
        rs10000.addActionListener(this);
        image.add(rs10000);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);



    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            String amount = ((JButton) ae.getSource()).getText().substring(3); //k
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from Bank where pin = '" + pinnumber + "'");

            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
                //String num = "17";

                Date date = new Date();
                c.s.executeUpdate("insert into Bank values('" + pinnumber + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");

                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args){

        new FastCash("");

    }


}

