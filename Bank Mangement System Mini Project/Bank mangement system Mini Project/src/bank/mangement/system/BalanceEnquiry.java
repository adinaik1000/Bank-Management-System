package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label2;
    JButton button1;
    BalanceEnquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1000,900);
        add(image);

        JLabel label1 = new JLabel("Your Current Balance is Rs");
        label1.setForeground(Color.WHITE);
        label1.setBounds(190,295,380,35);
        label1.setFont(new Font("System",Font.BOLD,25));
        image.add(label1);

        JLabel label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setBounds(205,325,550,35);
        label2.setFont(new Font("System",Font.BOLD,14));
        image.add(label2);

        button1 = new JButton("Back");
        button1.setForeground(Color.WHITE);
        button1.setBounds(474,518,100,30);
        button1.setBackground((new Color(65,125,128)));
        button1.addActionListener(this);
        image.add(button1);

        int balance = 0;
        try{
            Con c = new Con();
            ResultSet resultset = c.statement.executeQuery("Select * from bank where pin= '"+pin+"'");
            while(resultset.next()){
                if (resultset.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultset.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultset.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1000,900);
        setLocation(350,10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    setVisible(false);
    new transaction_class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
