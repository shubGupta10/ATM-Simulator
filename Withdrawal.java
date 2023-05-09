import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.*;


    public class Withdrawal extends JFrame implements ActionListener {

        JButton withdraw, back;
        JTextField amount;

        String pinumber;
        Withdrawal(String pinnumber){

            this.pinumber = pinnumber;


            setSize(1920, 1080);
            setVisible(true);
            setLayout(null);


            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);


            JLabel image = new JLabel(i3);
            image.setBounds(0,0, 900, 900);
            image.setLocation(300, 0);
            add(image);



            JLabel text = new JLabel("Enter the amount you to want to withdraw:");
            text.setBounds(170, 300, 400, 20);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("System", Font.BOLD, 16));
            image.add(text);

            amount = new JTextField();
            amount.setFont(new Font("Raleway", Font.BOLD, 22));
            amount.setBounds(170, 350, 320, 25);
            image.add(amount);


            withdraw= new JButton("Withdraw");
            withdraw.setBounds(180, 485, 150, 30);
            withdraw.addActionListener(this);
            image.add(withdraw );



            back = new JButton("Back");
            back.setBounds(350, 485, 150, 30);
            back.addActionListener(this);
            image.add(back);




        }


        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == withdraw){
                String number = amount.getText();
                Date date = new Date();
                if(number.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");

                }else {
                    try {
                        Conn conn = new Conn();
                        String query = "insert into Bank values('" + pinumber + "', '" + date + "', ' Withdrawal', '" + number + "')";
                        conn.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Rs "+number+" withdrawal Successfully");
                        setVisible(false);
                        new Transaction(pinumber).setVisible(true);
                    } catch (Exception E){
                        E.printStackTrace();
                        System.out.println(E);
                    }
                }
            } else if (e.getSource() == back) {

                setVisible(false);
               // new Transaction(pinumber).setVisible(true);
            }

        }





    public static void main(String[] args){

        new Withdrawal("");
    }
}
