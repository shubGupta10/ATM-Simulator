import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUp extends JFrame  implements ActionListener {

    long random;
    JTextField nametextfield, fnametextfield, dobtextfield, emailtextfield, addresstextfield, citytextfield, statetextfield, pincodetextfield;
    JButton next;
    JRadioButton male, female, married, Unmarried, Other;
    JDateChooser dateChooser;

    JLabel dob;

    SignUp(){

        setSize(1920, 1080);
        setVisible(true);
        setLayout(null);
//rgb(73, 32, 110)
        //getContentPane().setBackground(new Color(73, 32, 110));

        getContentPane().setBackground(Color.LIGHT_GRAY);

        Random rannum = new Random();
        long random = Math.abs(rannum.nextLong() % 9000L + 1000L);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + random);
        label1.setForeground(Color.BLACK);
        label1.setBounds(400, 15, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 40));
        add(label1);

        JLabel label2 = new JLabel("Page 1: Personal Details");
        label2.setForeground(Color.BLACK);
        label2.setBounds(500, 70, 600, 40);
        label2.setFont(new Font("Raleway", Font.BOLD, 30));
        add(label2);

        JLabel name = new JLabel("Name:");
        name.setForeground(Color.BLACK);
        name.setBounds(320, 150, 100, 40);
        name.setFont(new Font("Raleway", Font.BOLD, 25));
        add(name);

        nametextfield = new JTextField("");
        nametextfield.setBounds(550, 150, 400, 31);
        nametextfield.setFont(new Font("Ariel", Font.CENTER_BASELINE, 20));
        add(nametextfield);


        JLabel fname = new JLabel("Father's Name:");
        fname.setForeground(Color.BLACK);
        fname.setBounds(320, 200, 200, 40);
        fname.setFont(new Font("Raleway", Font.BOLD, 25));
        add(fname);


        fnametextfield = new JTextField("");
        fnametextfield.setBounds(550, 200, 400, 31);
        fnametextfield.setFont(new Font("Ariel", Font.CENTER_BASELINE, 20));
        add(fnametextfield);

        dob = new JLabel("Date of Birth:");
        dob.setForeground(Color.BLACK);
        dob.setBounds(320, 250, 200, 40);
        dob.setFont(new Font("Raleway", Font.BOLD, 25));
        add(dob);

         dateChooser = new JDateChooser();
        dateChooser.setBounds(550, 250, 400, 40);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);



        JLabel gender = new JLabel("Gender:");
        gender.setForeground(Color.BLACK);
        gender.setBounds(320, 300, 100, 40);
        gender.setFont(new Font("Raleway", Font.BOLD, 25));
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(550, 300, 60, 40);
        male.setBackground(Color.LIGHT_GRAY);
        male.setForeground(Color.BLACK);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(700, 300, 120, 50 );
        female.setBackground(Color.LIGHT_GRAY);
        female.setForeground(Color.BLACK);
        add(female);


        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);


        JLabel email = new JLabel("Email Address:");
        email.setForeground(Color.BLACK);
        email.setBounds(320, 350, 200, 50);
        email.setFont(new Font("Raleway", Font.BOLD, 25));
        add(email);


        emailtextfield = new JTextField("");
        emailtextfield.setBounds(550, 350, 400, 31);
        emailtextfield.setFont(new Font("Ariel", Font.CENTER_BASELINE, 20));
        add(emailtextfield);


        JLabel maritalstatus = new JLabel("Marital Status:");
        maritalstatus.setForeground(Color.BLACK);
        maritalstatus.setBounds(320, 400, 200, 40);
        maritalstatus.setFont(new Font("Raleway", Font.BOLD, 25));
        add(maritalstatus);


        married = new JRadioButton("Married");
        married.setBounds(550, 400, 100, 50);
        married.setBackground(Color.LIGHT_GRAY);
        married.setForeground(Color.BLACK);
        add(married);

        Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(700, 400, 150, 50);
        Unmarried.setBackground(Color.LIGHT_GRAY);
        Unmarried.setForeground(Color.BLACK);
        add(Unmarried);

        //i disabled it, will use it later
        Other = new JRadioButton("Single");
        Other.setBounds(880,400, 200, 50);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setForeground(Color.BLACK);
        add(Other);



        ButtonGroup marriedgroup = new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(Unmarried);
        marriedgroup.add(Other);

        JLabel address = new JLabel("Address:");
        address.setForeground(Color.BLACK);
        address.setBounds(320, 450, 200, 40);
        address.setFont(new Font("Raleway", Font.BOLD, 25));
        add(address);

        addresstextfield = new JTextField("");
        addresstextfield.setBounds(550, 450, 400, 31);
        addresstextfield.setFont(new Font("Ariel", Font.CENTER_BASELINE, 20));
        add(addresstextfield);

        JLabel city = new JLabel("City:");
        city.setForeground(Color.BLACK);
        city.setBounds(320, 500, 180, 40);
        city.setFont(new Font("Raleway", Font.BOLD, 25));
        add(city);

        citytextfield = new JTextField("");
        citytextfield.setBounds(550, 500, 400, 31);
        citytextfield.setFont(new Font("Ariel", Font.CENTER_BASELINE, 20));
        add(citytextfield);

        JLabel state = new JLabel("State:");
        state.setForeground(Color.BLACK);
        state.setBounds(320, 550, 180, 40);
        state.setFont(new Font("Raleway", Font.BOLD, 25));
        add(state);


        statetextfield = new JTextField("");
        statetextfield.setBounds(550, 550, 400, 31);
        statetextfield.setFont(new Font("Ariel", Font.CENTER_BASELINE, 20));
        add(statetextfield);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setForeground(Color.BLACK);
        pincode.setBounds(320, 600, 180, 40);
        pincode.setFont(new Font("Raleway", Font.BOLD, 25));
        add(pincode);


        pincodetextfield = new JTextField("");
        pincodetextfield.setBounds(550, 600, 400, 31);
        pincodetextfield.setFont(new Font("Ariel", Font.CENTER_BASELINE, 20));
        add(pincodetextfield);


        JButton next = new JButton("Next");
        next.setBounds(820, 700, 130, 30);
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = "" + random;
        String name = nametextfield.getText();
        String fname = fnametextfield.getText();
        String dob =  ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";

        } else if (female.isSelected()){
            gender = "Female";
        }


        String email = emailtextfield.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        } else if(Unmarried.isSelected()){
            marital = "Unmarried";

        } else if (Other.isSelected()){
            marital = "Single";
        }


        String address = addresstextfield.getText();
        String city = citytextfield.getText();
        String state = statetextfield.getText();
        String pincode = pincodetextfield.getText();


        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else{
                Conn c = new Conn();
                String query =  "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
                c.s.executeUpdate(query);
            }



            setVisible(false);
            new SignUp2(formno).setVisible(true);


        } catch (Exception E){
            System.out.println(E);
        }



    }


   // "String'"+variable+""'String"



    public static void main(String[] args){

        new SignUp();
    }



}
