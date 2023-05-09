import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.module.ResolutionException;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

    JButton back;
    JLabel  text;

    MiniStatement(String pinnumber){

        setTitle("MINI STATEMENT");


        setLayout(null);

        setSize(400, 600);
        setVisible(true);
        setLocation(20,20);




         text = new JLabel();
        text.setBounds(20, 140, 400, 200);
        add(text);

        JLabel bank = new JLabel("Indian Bank"); //l2
        bank.setBounds(150, 20, 100, 20);
        add(bank);


        JLabel mini = new JLabel(); //l3
        mini.setBounds(20, 80, 300, 20);
        add(mini);


        JLabel card = new JLabel();//l4
        card.setBounds(20, 80, 300, 20);
        add(card);


        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pinnumber+"' " );
             while(rs.next()){
                 card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4));
             }

        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }



        try{
            int bal = 0;
            Conn c1  = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM Bank where pin = '"+pinnumber+"'");
            while(rs.next()){
                text.setText(text.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            card.setText("Your total Balance is Rs "+bal);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

        setLayout(null);

        back = new JButton("Exit");
        back.setBounds(20, 500, 100, 25);
        back.addActionListener(this);
        add(back);





    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    public static void main(String[] args){

        new MiniStatement("");
    }
}
