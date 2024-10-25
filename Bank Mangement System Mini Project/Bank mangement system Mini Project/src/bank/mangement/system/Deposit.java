package bank.mangement.system;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton button1,button2;

    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1000,900);
        add(image);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setBounds(190,300,380,35);
        label1.setFont(new Font("System",Font.BOLD,18));
        image.add(label1);

        textField = new JTextField(15);
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(190,350,370,30);
        textField.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(textField);

        button1 = new JButton("DEPOSIT");
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
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == button1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want To Deposit");
                } else {
                    Con c = new Con();
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "','Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "RS." + amount + " Deposited Successfully");
                    setVisible(false);
                    new transaction_class(pin);
                }
            } else if (e.getSource() == button2) {
                setVisible(false);
                new transaction_class(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Deposit("");
    }


}

