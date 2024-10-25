package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6; JCheckBox c7;
    JButton button1,button2;
    String formno;
    Signup3(String formno){
        super("APPLICATION FROM");
        this.formno =formno;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo5.png.jpg"));
        Image i2 = i1.getImage().getScaledInstance(190,110,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10,10,190,110);
        add(image);

        JLabel label1 = new JLabel("Page 3...");
        label1.setBounds(750,720,400,50);
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        add(label1);

        JLabel label2 = new JLabel("|| Account Details ||");
        label2.setBounds(350,40,450,50);
        label2.setFont(new Font("Airal",Font.BOLD,25));
        add(label2);

        JLabel label3 = new JLabel("Account Type :");
        label3.setBounds(60,145,150,30);
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        add(label3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(133,211,211));
        r1.setBounds(70,190,140,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(133,211,211));
        r2.setBounds(400,180,195,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(133,211,211));
        r3.setBounds(70,240,140,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(133,211,211));
        r4.setBounds(400,236,220,30);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel label4 = new JLabel("Card Number :");
        label4.setBounds(60,300,150,30);
        label4.setFont(new Font("Raleway",Font.BOLD,18));
        add(label4);

        JLabel label5 = new JLabel("(Your 16-digit card Number)");
        label5.setBounds(60,327,200,30);
        label5.setFont(new Font("Raleway",Font.BOLD,12));
        add(label5);

        JLabel label6 = new JLabel("XXXX-XXXX-XXXX-9990");
        label6.setBounds(350,300,250,30);
        label6.setFont(new Font("Raleway",Font.BOLD,18));
        add(label6);

        JLabel label7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        label7.setBounds(348,325,400,30);
        label7.setFont(new Font("Raleway",Font.BOLD,12));
        add(label7);

        JLabel label8 = new JLabel("PIN :");
        label8.setBounds(60,380,100,30);
        label8.setFont(new Font("Raleway",Font.BOLD,18));
        add(label8);

        JLabel label9 = new JLabel("XXXX");
        label9.setBounds(350,377,100,30);
        label9.setFont(new Font("Raleway",Font.BOLD,18));
        add(label9);

        JLabel label10 = new JLabel("(4-digit Password)");
        label10.setBounds(60,405,200,30);
        label10.setFont(new Font("Raleway",Font.BOLD,12));
        add(label10);


        JLabel label11 = new JLabel("Services Required :");
        label11.setBounds(60,470,190,30);
        label11.setFont(new Font("Raleway",Font.BOLD,18));
        add(label11);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,17));
        c1.setBackground(new Color(133,211,211));
        c1.setBounds(70,510,140,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,17));
        c2.setBackground(new Color(133,211,211));
        c2.setBounds(340,510,190,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,17));
        c3.setBackground(new Color(133,211,211));
        c3.setBounds(70,560,190,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,17));
        c4.setBackground(new Color(133,211,211));
        c4.setBounds(340,560,190,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,17));
        c5.setBackground(new Color(133,211,211));
        c5.setBounds(70,610,190,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,17));
        c6.setBackground(new Color(133,211,211));
        c6.setBounds(340,610,190,30);
        add(c6);

        c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.");
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        c7.setBackground(new Color(133,211,211));
        c7.setBounds(70,673,640,30);
        add(c7);

        JLabel label12 = new JLabel("From No :");
        label12.setBounds(645,10,100,30);
        label12.setFont(new Font("Raleway",Font.BOLD,16));
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setBounds(720,12,100,30);
        label13.setFont(new Font("Raleway",Font.BOLD,16));
        add(label13);

        button1 = new JButton("Submit");
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(250,710,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Cancel");
        button2.setFont(new Font("Raleway",Font.BOLD,14));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(450,710,100,30);
        button2.addActionListener(this);
        add(button2);

        getContentPane().setBackground(new Color(133, 211, 211));
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        }else if (r2.isSelected()){
            atype = "Fixed Deposit Account";
        }else if (r3.isSelected()){
            atype = "Current Account";
        }else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        }
        if (c2.isSelected()){
            fac = fac+"Internet Banking ";
        }
        if (c3.isSelected()){
            fac = fac+"Mobile Banking ";
        }
        if (c4.isSelected()){
            fac = fac+"Email Alerts ";
        }
        if (c5.isSelected()){
            fac = fac+"Cheque Book ";
        }
        if (c6.isSelected()){
            fac = fac+"E-Statement ";
        }

        try{
            if (e.getSource()==button1){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the Details");
                }else {
                    Con c1 = new Con();
                    String q1 = "insert into signup3 values('"+formno+"', '"+atype+"', '"+cardno+"', '"+pin+"', '"+fac+"')";
                    String q2 = "insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==button2) {
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}