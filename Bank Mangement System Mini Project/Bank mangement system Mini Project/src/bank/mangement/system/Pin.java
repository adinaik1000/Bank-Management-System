package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton button1,button2;
    JPasswordField passwordField1,passwordField2;
    String pin;
    Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setBounds(490,260,380,35);
        label1.setFont(new Font("System",Font.BOLD,18));
        image.add(label1);

        JLabel label2 = new JLabel("NEW PIN:");
        label2.setForeground(Color.WHITE);
        label2.setBounds(490,305,380,35);
        label2.setFont(new Font("System",Font.BOLD,16));
        image.add(label2);

        JLabel label3 = new JLabel("Re-Enter NEW PIN:");
        label3.setForeground(Color.WHITE);
        label3.setBounds(490,350,380,35);
        label3.setFont(new Font("System",Font.BOLD,16));
        image.add(label3);

        passwordField1 = new JPasswordField();
        passwordField1.setBackground(new Color(65, 125, 128));
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBounds(650,305,190,30);
        passwordField1.setFont(new Font("Railway",Font.BOLD,25));
        image.add(passwordField1);

        passwordField2 = new JPasswordField();
        passwordField2.setBackground(new Color(65, 125, 128));
        passwordField2.setForeground(Color.WHITE);
        passwordField2.setBounds(650,350,190,30);
        passwordField2.setFont(new Font("Railway",Font.BOLD,25));
        image.add(passwordField2);



        button1 = new JButton("CHANGE");
        button1.setForeground(Color.WHITE);
        button1.setBounds(692,452,150,28);
        button1.setBackground((new Color(65,125,128)));
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("BACK");
        button2.setForeground(Color.WHITE);
        button2.setBounds(692,485,150,28);
        button2.setBackground((new Color(65,125,128)));
        button2.addActionListener(this);
        image.add(button2);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {


            String pin1 = passwordField1.getText();
            String pin2 = passwordField2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN Does Not Match");
                return;
            }
            if (e.getSource() == button1) {
                if (passwordField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Entered New PIN");
                    return;
                }
                if (passwordField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Con c =new Con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);


                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new transaction_class(pin);

            } else if (e.getSource()==button2) {
                new transaction_class(pin);
                setVisible(false);

            }


        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Pin("");

    }
}
