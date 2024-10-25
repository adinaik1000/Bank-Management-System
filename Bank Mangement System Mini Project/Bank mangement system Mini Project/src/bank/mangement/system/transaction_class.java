package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class transaction_class extends JFrame implements ActionListener {
    JButton button1,button2,button3,button4,button5,button6,button7;
    String pin;
    transaction_class(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("Please Select Your Transaction");
        label1.setForeground(Color.WHITE);
        label1.setBounds(505,270,380,35);
        label1.setFont(new Font("System",Font.BOLD,21));
        image.add(label1);

        button1 = new JButton("DEPOSIT");
        button1.setForeground(Color.WHITE);
        button1.setBounds(480,381,130,28);
        button1.setBackground((new Color(65,125,128)));
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("FAST CASH");
        button2.setForeground(Color.WHITE);
        button2.setBounds(480,416,130,28);
        button2.setBackground((new Color(65,125,128)));
        button2.addActionListener(this);
        image.add(button2);

        button3 = new JButton("PIN CHANGE");
        button3.setForeground(Color.WHITE);
        button3.setBounds(480,450,130,28);
        button3.setBackground((new Color(65,125,128)));
        button3.addActionListener(this);
        image.add(button3);

        button4 = new JButton("CASH WITHDRAWAL");
        button4.setForeground(Color.WHITE);
        button4.setBounds(692,385,150,28);
        button4.setBackground((new Color(65,125,128)));
        button4.addActionListener(this);
        image.add(button4);

        button5 = new JButton("MINI STATEMENT");
        button5.setForeground(Color.WHITE);
        button5.setBounds(692,418,150,28);
        button5.setBackground((new Color(65,125,128)));
        button5.addActionListener(this);
        image.add(button5);

        button6 = new JButton("BALANCE ENQUIRY");
        button6.setForeground(Color.WHITE);
        button6.setBounds(692,452,150,28);
        button6.setBackground((new Color(65,125,128)));
        button6.addActionListener(this);
        image.add(button6);

        button7 = new JButton("EXIT");
        button7.setForeground(Color.WHITE);
        button7.setBounds(692,485,150,28);
        button7.setBackground((new Color(65,125,128)));
        button7.addActionListener(this);
        image.add(button7);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==button7) {
            System.exit(0);
        }else if (e.getSource()==button4) {
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource() == button6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource() == button2) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==button3) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==button5) {
            new Mini(pin);

        }
    }

    public static void main(String[] args) {
        new transaction_class("");

    }
}