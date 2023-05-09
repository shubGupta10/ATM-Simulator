import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SignUp3 extends JFrame implements ActionListener {



    JRadioButton r1,r2,r3,r4;

    JCheckBox  s1,s2,s3,s4,s5,s6,s7;

    JButton submit ,cancel;


    String formno;
    SignUp3(String formno){

        this.formno = formno;

        setSize(1920, 1080);
        setVisible(true);
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setBounds(500, 20, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD,30 ));
        add(l1);



        JLabel type = new JLabel("Account Type");
        type.setBounds(150, 120, 200, 40);
        type.setFont(new Font("Raleway", Font.BOLD,25 ));
        add(type);


        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 18));
        //r1.setBackground(Color.WHITE);
        r1.setBounds(155, 180, 250, 30);
        add(r1);



        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 18));
        //r1.setBackground(Color.WHITE);
        r2.setBounds(400, 180, 410, 30);
        add(r2);


        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 18));
        //r1.setBackground(Color.WHITE);
        r3.setBounds(155, 230, 250, 30);
        add(r3);



        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 18));
        //r1.setBackground(Color.WHITE);
        r4.setBounds(400, 230, 410, 30);
        add(r4);


        ButtonGroup groupbutton = new ButtonGroup();
        groupbutton.add(r1);
        groupbutton.add(r2);
        groupbutton.add(r3);
        groupbutton.add(r4);



        JLabel card = new JLabel("Card Number:");
        card.setBounds(150, 300, 180, 40);
        card.setFont(new Font("Raleway", Font.BOLD, 25));
        add(card);


        JLabel dummycardnumber = new JLabel("XXXX-XXXX-XXXX-4102");
        dummycardnumber.setFont(new Font("Raleway", Font.BOLD, 25));
        dummycardnumber.setBounds(450, 305, 400, 30);
        add(dummycardnumber);



        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(150, 336, 400, 20);
        add(carddetail);





        JLabel pin = new JLabel("PIN:");
        pin.setBounds(150, 370, 180, 40);
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        add(pin);



        JLabel pindetail = new JLabel("Your 4 Digit Card Number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(150, 405, 400, 20);
        add(pindetail);


        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 25));
        pinnumber.setBounds(450, 375, 400, 30);
        add(pinnumber);






        JLabel services = new JLabel("Services Required:");
        services.setBounds(150, 450, 250, 40);
        services.setFont(new Font("Raleway", Font.BOLD, 25));
        add(services);



        //tick krne waale boxes
        s1 = new JCheckBox("ATM CARD");
        s1.setFont(new Font("Raleway", Font.BOLD, 18));
        s1.setBounds(150, 500, 220, 30);;
        add(s1);


        s2 = new JCheckBox("Internet Banking");
        s2.setFont(new Font("Raleway", Font.BOLD, 18));
        s2.setBounds(400, 500, 220, 30);;
        add(s2);



        s3 = new JCheckBox("Mobile Banking");
        s3.setFont(new Font("Raleway", Font.BOLD, 18));
        s3.setBounds(150, 550, 230, 30);;
        add(s3);



        s4 = new JCheckBox("Email & SMS Alerts");
        s4.setFont(new Font("Raleway", Font.BOLD, 18));
        s4.setBounds(400, 550, 220, 30);;
        add(s4);



        s5 = new JCheckBox("Check Book");
        s5.setFont(new Font("Raleway", Font.BOLD, 18));
        s5.setBounds(150, 600, 230, 30);;
        add(s5);



        s6 = new JCheckBox("E-Statement");
        s6.setFont(new Font("Raleway", Font.BOLD, 18));
        s6.setBounds(400, 600, 230, 30);;
        add(s6);



        s7 = new JCheckBox("I hereby declares that the entered details are correct in the best of my knowledge");
        s7.setFont(new Font("Raleway", Font.BOLD, 18));
        s7.setBounds(150, 680, 830, 30);;
        add(s7);





        submit = new JButton("Submit");
        submit.setBounds(200, 730, 100, 30);
        submit.setBackground(Color.black);
        submit.setFont(new Font("Raleway", Font.BOLD, 18));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);



        cancel = new JButton("Cancel");
        cancel.setBounds(400, 730, 100, 30);
        cancel.setBackground(Color.black);
        cancel.setFont(new Font("Raleway", Font.BOLD, 18));
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);



    }




    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == submit){
            String type = null;
            if(r1.isSelected()){
                type ="Saving Account";
            } else if (r2.isSelected()) {
                type = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                type = "Current Account";
            } else if (r4.isSelected()) {
                type = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

            String pinnumber = "" + Math.abs((random.nextLong() % 9000L)+ 1000L);


            String facility = "";
            if(s1.isSelected()){
                facility = facility + " ATM CARD";
            } else if (s2.isSelected()) {
                facility = facility + "Internet Banking";
            } else if (s3.isSelected()) {
                facility = facility + "Mobile Banking";
            } else if (s4.isSelected()) {
                facility = facility + "Email & SMS Alert";
            } else if (s5.isSelected()) {
                facility = facility + "Check Book";
            } else if (s6.isSelected()) {
                facility = facility + "E-Statement";
            }



            try{

               if(type.equals("")){
                   JOptionPane.showMessageDialog(null, "Account Type is Required");
               } else  {
                   Conn conn = new Conn();
                   String query1 = "insert into SignUp3 values('"+formno+"', '"+type+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"' )";
                   String query2 = "insert into login values('"+formno+"','"+cardnumber+"', '"+pinnumber+"' )";

                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);


                   JOptionPane.showMessageDialog(null, "Card Number" + cardnumber + "\n Pin: "+ pinnumber );
               }


               setVisible(false);
               new Deposit(pinnumber).setVisible(false);

            } catch(Exception E){
                E.printStackTrace();
                System.out.println(E);
            }

        } else if (e.getSource() == cancel) {


            setVisible(false);
            new Login().setVisible(true);
        }


    }




    public static void main(String[] args){

        new SignUp3("");

    }


}
