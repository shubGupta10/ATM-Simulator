import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUp2 extends JFrame implements ActionListener {

    long random;


    JTextField pantextfield , aadhartextfield;
    JComboBox Religion, Category,Income, EQ, Occupation;

    JRadioButton  yes, no, yes2, no2;

    String formno;

     SignUp2(String formno){
         this.formno = formno;

        setSize(1920, 1080);
        setVisible(true);
        setLayout(null);


        setTitle("Application Form: Page 2");

        getContentPane().setBackground(Color.LIGHT_GRAY);


        JLabel label1 = new JLabel("Page 2: Additional Details");
        label1.setBounds(420, 10, 700, 45 );
        label1.setFont(new Font("Raleway", Font.BOLD, 35));
        label1.setForeground(Color.BLACK);
        add(label1);



        JLabel religion = new JLabel("Religion:");
        religion.setBounds(200, 80, 150, 40);
        religion.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
        religion.setForeground(Color.BLACK);
        add(religion);



        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christain", "Other"};
        Religion = new JComboBox(valReligion);
        Religion.setBounds(500, 95, 450, 30);
        Religion.setBackground(Color.WHITE);
        add(Religion);



         JLabel category = new JLabel("Category:");
         category.setBounds(200, 150, 150, 40);
         category.setForeground(Color.BLACK);
         category.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         add(category);




         String valcategory[] = {"SC", "ST", "Gen", "OBC", "Other"};
         Category = new JComboBox(valcategory);
         Category.setBounds(500, 155, 450, 30);
         Category.setBackground(Color.WHITE);
         add(Category);





         JLabel income = new JLabel("Income:");
         income.setBounds(200, 220, 120, 40);
         income.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         income.setForeground(Color.BLACK);
         add(income);



         String valincome[] = {"Null", "< 2,50,000", "< 5,50,000", " Upto 10,50,000"};
         Income = new JComboBox(valincome);
         Income.setBounds(500, 225, 450, 30);
         Income.setBackground(Color.WHITE);
         Income.setForeground(Color.BLACK);
         add(Income);



         JLabel educational = new JLabel("Educational");
         educational.setBounds(200, 290, 200, 40);
         educational.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         educational.setForeground(Color.BLACK);
         add(educational);

         JLabel qualification = new JLabel("Qualification:");
         qualification.setBounds(200, 330, 200, 40);
         qualification.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         qualification.setForeground(Color.BLACK);
         add(qualification);



         String valEQ[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
         EQ = new JComboBox(valEQ);
         EQ.setBounds(500, 320, 450, 30);
         EQ.setBackground(Color.WHITE);
         add(EQ);

         JLabel occupation = new JLabel("Occupation:");
         occupation.setBounds(200, 400, 200, 40);
         occupation.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         occupation.setForeground(Color.BLACK);
         add(occupation);




         String valOccupation[] = {"Dentist", "Businessman", "Self-Employed", "Teacher", "Engineer", "Student", "Others"};
         Occupation = new JComboBox(valOccupation);
         Occupation.setBounds(500, 405, 450, 30);
         Occupation.setBackground(Color.WHITE);
         add(Occupation);


         JLabel pan = new JLabel("PAN Number:");
         pan.setBounds(200, 470, 250, 40);
         pan.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         pan.setForeground(Color.BLACK);
         add(pan);


         pantextfield = new JTextField("");
         pantextfield.setBounds(500, 480, 450, 30 );
         add(pantextfield);



         JLabel Aadhar = new JLabel("Aadhar Number:");
         Aadhar.setBounds(200, 540, 250, 40);
         Aadhar.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         Aadhar.setForeground(Color.BLACK);
         add(Aadhar);


         aadhartextfield = new JTextField("");
         aadhartextfield.setBounds(500, 550, 450, 30 );
         add(aadhartextfield);


         JLabel Srcitizen = new JLabel("Senior Citizen:");
         Srcitizen.setBounds(200, 610, 250, 40);
         Srcitizen.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         Srcitizen.setForeground(Color.BLACK);
         add(Srcitizen);


         yes = new JRadioButton("Yes");
         yes.setBounds(500, 610, 100, 50 );
         yes.setBackground(Color.LIGHT_GRAY);
         yes.setForeground(Color.BLACK);
         add(yes);

         no = new JRadioButton("No");
         no.setBounds(650, 610, 120, 50);
         no.setBackground(Color.LIGHT_GRAY);
         no.setForeground(Color.BLACK);
         add(no);


         ButtonGroup groupbutton = new ButtonGroup();
         groupbutton.add(yes);
         groupbutton.add(no);




         JLabel ExistingAccount = new JLabel("Existing Account:");
         ExistingAccount.setBounds(200, 680, 300, 40);
         ExistingAccount.setFont(new Font("Raleway", Font.CENTER_BASELINE, 30));
         ExistingAccount.setForeground(Color.BLACK);
         add(ExistingAccount);


         yes2 = new JRadioButton("Yes");
         yes2.setBounds(500, 680, 100, 50);
         yes2.setBackground(Color.LIGHT_GRAY);
         yes2.setForeground(Color.BLACK);
         add(yes2);


         no2 = new JRadioButton("No");
         no2.setBounds(650, 680, 120, 50);
         no2.setBackground(Color.LIGHT_GRAY);
         no2.setForeground(Color.BLACK);
         add(no2);



         JButton next2 = new JButton("Next");
         next2.setBounds(880, 730, 100, 35);
         next2.setBackground(Color.BLACK);
         next2.setForeground(Color.WHITE);
         next2.setFont(new Font("Raleway", Font.BOLD, 20));
         next2.addActionListener(this);
         add(next2);


    }


    @Override
    public void actionPerformed(ActionEvent e) {


         String formno = "" + random;
        String sReligion = (String) Religion.getSelectedItem();
        String sCategory = (String) Category.getSelectedItem();
        String sIncome = (String) Income.getSelectedItem();
        String sEQ = (String) EQ.getSelectedItem();
        String sOccupation = (String) Occupation.getSelectedItem();
        String seniocitizen = null;
        if (yes.isSelected()) {
            seniocitizen = "Yes";
        } else if (no.isSelected()) {
            seniocitizen = "No";
        }

        String existingaccount = null;
        if (yes2.isSelected()) {
            existingaccount = "Yes";
        } else if (no2.isSelected()) {
            existingaccount = "No";
        }


        String sPAN = pantextfield.getText();
        String sAadhar = aadhartextfield.getText();


        try {

            Conn c = new Conn();
            String query = "insert into signup2 values('"+formno+"', '" + sReligion + "', '" + sCategory + "', '" + sIncome + "', '" + sEQ + "', '" + sOccupation + "', '" + seniocitizen + "', '" + existingaccount + "', '" + sPAN + "', '" + sAadhar + "')";
            c.s.executeUpdate(query);

            setVisible(false);
            new SignUp3(formno).setVisible(true);



        } catch (Exception E) {
            E.printStackTrace();
            System.out.println(E);
        }


    }


    public static void main(String[] args) {
        new SignUp2("");
    }

}
