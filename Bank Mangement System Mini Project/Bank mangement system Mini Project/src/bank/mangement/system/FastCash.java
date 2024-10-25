package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton button1,button2,button3,button4,button5,button6,button7;
    String pin;

    FastCash(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("Select Your Withdrawal Amount");
        label1.setForeground(Color.WHITE);
        label1.setBounds(500,270,380,35);
        label1.setFont(new Font("System",Font.BOLD,21));
        image.add(label1);

        button1 = new JButton("Rs. 100");
        button1.setForeground(Color.WHITE);
        button1.setBounds(480,381,130,28);
        button1.setBackground((new Color(65,125,128)));
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("Rs. 500");
        button2.setForeground(Color.WHITE);
        button2.setBounds(480,416,130,28);
        button2.setBackground((new Color(65,125,128)));
        button2.addActionListener(this);
        image.add(button2);

        button3 = new JButton("Rs. 1000");
        button3.setForeground(Color.WHITE);
        button3.setBounds(480,450,130,28);
        button3.setBackground((new Color(65,125,128)));
        button3.addActionListener(this);
        image.add(button3);

        button4 = new JButton("Rs. 2000");
        button4.setForeground(Color.WHITE);
        button4.setBounds(692,385,150,28);
        button4.setBackground((new Color(65,125,128)));
        button4.addActionListener(this);
        image.add(button4);

        button5 = new JButton("Rs. 5000");
        button5.setForeground(Color.WHITE);
        button5.setBounds(692,418,150,28);
        button5.setBackground((new Color(65,125,128)));
        button5.addActionListener(this);
        image.add(button5);

        button6 = new JButton("Rs. 10000");
        button6.setForeground(Color.WHITE);
        button6.setBounds(692,452,150,28);
        button6.setBackground((new Color(65,125,128)));
        button6.addActionListener(this);
        image.add(button6);

        button7 = new JButton("BACK");
        button7.setForeground(Color.WHITE);
        button7.setBounds(692,485,150,28);
        button7.setBackground((new Color(65,125,128)));
        button7.addActionListener(this);
        image.add(button7);


        setLayout(null);
        setSize(1000,900);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button7) {
           setVisible(false);
           new transaction_class(pin);
       }else {
           String amount = ((JButton)e.getSource()).getText().substring(4);
           Con c = new Con();
           Date date = new Date();
           try{
               ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
               int balance = 0;
               while (resultSet.next()){
                   if (resultSet.getString("type").equals("Deposit")){
                       balance += Integer.parseInt(resultSet.getString("amount"));
                   }else {
                       balance -= Integer.parseInt(resultSet.getString("amount"));
                   }
               }String num ="17";

               if(e.getSource() != button7 &&  balance < Integer.parseInt(amount)){
                   JOptionPane.showMessageDialog(null, "Insufficient Balance");
                   return;
               }

               c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawal', '"+amount+"')");
               JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");
           }catch (Exception E){
               E.printStackTrace();
           }
           setVisible(false);
           new transaction_class(pin);
       }
    }

    public static void main(String[] args) {
        new FastCash("");

    }
}
