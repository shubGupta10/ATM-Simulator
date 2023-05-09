import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Transaction extends JFrame implements ActionListener {

    JButton deposit, withdrawal, fastcash, ministatement, pinchange, balanceEnquiry, exit;

    String pinnumber;
    Transaction(String pinnumber){
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


        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawal = new JButton("Withdrawal");
        withdrawal.setBounds(355, 415, 150, 30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);


        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);


        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);


        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(355, 485, 150, 30);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);



    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == exit){
            setVisible(false);
        } else if (e.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (e.getSource() == withdrawal) {
            setVisible(false);
            new Withdrawal(pinnumber).setVisible(true);
        } else if (e.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if (e.getSource() == pinchange) {
            new PinChange(pinnumber).setVisible(true);
        } else if (e.getSource() == balanceEnquiry) {
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if (e.getSource() == ministatement) {
            new MiniStatement(pinnumber).setVisible(true);
        }
    }




    public static void main(String[] args){

        new Transaction("");

    }


}
