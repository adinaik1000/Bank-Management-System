package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;


    Login(){
        super("Bank Management System");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo5.png.jpg"));
        Image i2 = i1.getImage().getScaledInstance(110,60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(160,42,110,60);
        add(image);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(285,30,450,80);
        add(label1);

        label2 = new JLabel("Card No :");
        label2.setFont(new Font("Railway",Font.BOLD,28));
        label2.setForeground(Color.BLACK);
        label2.setBounds(150,140,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(320,143,260,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN :");
        label3.setFont(new Font("Railway",Font.BOLD,28));
        label3.setForeground(Color.BLACK);
        label3.setBounds(150,190,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(320,195,260,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.BLACK);
        button1.setBounds(310,250,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.BLACK);
        button2.setBounds(440,250,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.BLACK);
        button3.setBounds(310,300,230,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/Background3.png.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(890,470, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0,0,890,470);
        add(iimage);


        setLayout(null);
        setSize(890,470);
        setLocation(445,140);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if (e.getSource()==button1){
                Con c = new Con();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where Card_Number = '"+cardno+"' and Pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new transaction_class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }



            } else if (e.getSource()== button2){
                textField2.setText("");
                passwordField3.setText("");

            } else if (e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        }catch (Exception E) {
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Login(); }
}