package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton button1,button2;
    Withdrawal(String pin){
        this.pin = pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1000,900);
        add(image);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setForeground(Color.WHITE);
        label1.setBounds(190,295,380,35);
        label1.setFont(new Font("System",Font.BOLD,20));
        image.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT TO WITHDRAW");
        label2.setForeground(Color.WHITE);
        label2.setBounds(205,325,550,35);
        label2.setFont(new Font("System",Font.BOLD,14));
        image.add(label2);

        textField = new JTextField(15);
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(190,360,370,30);
        textField.setFont(new Font("Railway",Font.BOLD,25));
        image.add(textField);

        button1 = new JButton("WITHDRAW");
        button1.setForeground(Color.WHITE);
        button1.setBounds(474,450,100,30);
        button1.setBackground((new Color(65,125,128)));
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("BACK");
        button2.setForeground(Color.WHITE);
        button2.setBounds(474,487,100,30);
        button2.setBackground((new Color(65,125,128)));
        button2.addActionListener(this);
        image.add(button2);




        setLayout(null);
        setSize(1000,900);
        setLocation(350,10);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want To Withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where Pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrwal', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new transaction_class(pin);

                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if (e.getSource()==button2){
            setVisible(false);
            new transaction_class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
