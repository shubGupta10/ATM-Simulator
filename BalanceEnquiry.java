import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String pinnumber;

    JButton back;
    BalanceEnquiry(String pinnumber) {
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        image.setLocation(300, 0);
        add(image);


        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);


        //yha maine constructor ke andar hi ye kaam kiya joki hum ek button ke liye pe pehle krte the matlb constructor ke bahar banate the
        //mujhe chahiye ki jab main Frame kholu to wha pe mujhe balance show hona chahiye to ye kaam kr rha main


        int balance = 0;
        try {

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from Bank where pin = '" + pinnumber + "'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
            System.out.println(E);
        }


        JLabel text = new JLabel("Your Current Account balance Rs " + balance);
        text.setForeground(Color.white);
        text.setBounds(170, 300, 400, 30);
        image.add(text);


        setSize(1920, 1080);
        setLayout(null);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new Transaction(pinnumber).setVisible(true);

    }

    public static void main(String[] args){

        new BalanceEnquiry("");
    }


}
