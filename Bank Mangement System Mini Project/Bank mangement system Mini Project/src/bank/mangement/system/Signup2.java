package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox1, comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textField1, textField2;
    JRadioButton r1,r2; JRadioButton r3,r4;
    JButton button1;
    String formno;
    Signup2(String formno){
        super("APPLICATION FROM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo5.png.jpg"));
        Image i2 = i1.getImage().getScaledInstance(190,110,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10,10,190,110);
        add(image);

        this.formno = formno;

        JLabel label1 = new JLabel("Page 2...");
        label1.setBounds(750,720,400,50);
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        add(label1);

        JLabel label2 = new JLabel("|| Addtional Details ||");
        label2.setBounds(350,40,450,50);
        label2.setFont(new Font("Airal",Font.BOLD,25));
        add(label2);

        JLabel label3 = new JLabel("Religion :");
        label3.setBounds(105,150,450,50);
        label3.setFont(new Font("Raleway",Font.BOLD,19));
        add(label3);

        String religion[] = {"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHER"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox1.setBounds(350,160,320,30);
        add(comboBox1);

        JLabel label4 = new JLabel("Category :");
        label4.setBounds(105,200,450,50);
        label4.setFont(new Font("Raleway",Font.BOLD,19));
        add(label4);

        String category[] = {"GENERAL","OBC","SC","ST","VJNT","OTHER"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox2.setBounds(350,210,320,30);
        add(comboBox2);

        JLabel label5 = new JLabel("Income :");
        label5.setBounds(105,250,450,50);
        label5.setFont(new Font("Raleway",Font.BOLD,19));
        add(label5);

        String income[] = {"NULL","<1,50,000","<2,50,000","5,00,000","UPTP 10,00,000","ABOVE 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox3.setBounds(350,260,320,30);
        add(comboBox3);

        JLabel label6 = new JLabel("Educational :");
        label6.setBounds(105,300,450,50);
        label6.setFont(new Font("Raleway",Font.BOLD,19));
        add(label6);

        String educational[] = {"NON-GRADUATE","GRADUATE","POST-GRADUATE","OTHERS",};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox4.setBounds(350,310,320,30);
        add(comboBox4);

        JLabel label7 = new JLabel("Occupation :");
        label7.setBounds(105,360,450,50);
        label7.setFont(new Font("Raleway",Font.BOLD,19));
        add(label7);

        String occupation[] = {"SALARIED","SELF-EMPLOYED","BUSINESS","STUDENT","RETIRED PERSON","OTHER"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Ralway",Font.BOLD,14));
        comboBox5.setBounds(350,370,320,30);
        add(comboBox5);

        JLabel label8 = new JLabel("PAN Number :");
        label8.setBounds(105,418,450,50);
        label8.setFont(new Font("Raleway",Font.BOLD,19));
        add(label8);

        textField1 = new JTextField(15);
        textField1.setBounds(350,426,320,30);
        textField1.setFont(new Font("Arial",Font.BOLD,14));
        add(textField1);

        JLabel label9 = new JLabel("Aadhar Number :");
        label9.setBounds(105,471,450,50);
        label9.setFont(new Font("Raleway",Font.BOLD,19));
        add(label9);

        textField2 = new JTextField(15);
        textField2.setBounds(350,481,320,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        JLabel label10 = new JLabel("Senior Citizen :");
        label10.setBounds(105,532,450,50);
        label10.setFont(new Font("Raleway",Font.BOLD,19));
        add(label10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,542,90,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(490,542,90,30);
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel label11 = new JLabel("Existing Account :");
        label11.setBounds(105,590,450,50);
        label11.setFont(new Font("Raleway",Font.BOLD,19));
        add(label11);

        r3 = new JRadioButton("YES");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,600,90,30);
        add(r3);

        r4 = new JRadioButton("NO");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(490,600,90,30);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        JLabel label12 = new JLabel("From No :-");
        label12.setBounds(645,10,100,30);
        label12.setFont(new Font("Raleway",Font.BOLD,19));
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setBounds(740,12,100,30);
        label13.setFont(new Font("Raleway",Font.BOLD,19));
        add(label13);


        button1 = new JButton("NEXT");
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(660,650,100,35);
        button1.addActionListener(this);
        add(button1);

        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox1.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textField1.getText();
        String addhar = textField2.getText();

        String scitizen = null;
        if((r1.isSelected())){
            scitizen = "YES";
        }else if ((r2.isSelected())){
            scitizen = "NO";
        }
        String eaccount = null;
        if((r3.isSelected())){
            eaccount = "YES";
        }else if ((r4.isSelected())){
            eaccount = "NO";
        }

        try {
            if (textField1.getText().equals("") || textField2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Details");
            }else {
                Con c1 = new Con();
                String q = "insert into signup2 values('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+pan+"', '"+addhar+"', '"+scitizen+"', '"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }

}