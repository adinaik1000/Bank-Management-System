package bank.mangement.system;

import com.mysql.cj.protocol.Message;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2; JRadioButton r3,r4,r5;
    JTextField textField4,textField5,textField8,textField10,textField11,textField12,textField13;
    JDateChooser dateChooser;
    JButton button1;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo5.png.jpg"));
        Image i2 = i1.getImage().getScaledInstance(190,110,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10,10,190,110);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(220,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1...");
        label2.setBounds(750,720,400,50);
        label2.setFont(new Font("Raleway",Font.BOLD,20));
        add(label2);

        JLabel label3 = new JLabel("|| Personal Details ||");
        label3.setBounds(350,60,450,50);
        label3.setFont(new Font("Airal",Font.BOLD,23));
        add(label3);

        JLabel label4 = new JLabel("Name :");
        label4.setBounds(120,150,450,50);
        label4.setFont(new Font("Raleway",Font.BOLD,19));
        add(label4);

        textField4 = new JTextField(15);
        textField4.setBounds(320,160,400,30);
        textField4.setFont(new Font("Arial",Font.BOLD,14));
        add(textField4);

        JLabel label5 = new JLabel("Father's Name :");
        label5.setBounds(120,205,450,50);
        label5.setFont(new Font("Raleway",Font.BOLD,19));
        add(label5);

        textField5 = new JTextField(15);
        textField5.setBounds(320,218,400,30);
        textField5.setFont(new Font("Arial",Font.BOLD,14));
        add(textField5);


        JLabel label6 = new JLabel("Gender :");
        label6.setBounds(120,255,450,50);
        label6.setFont(new Font("Raleway",Font.BOLD,19));
        add(label6);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(320,268,90,30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(490,268,90,30);
        add(r2);


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel label7 = new JLabel("Date of Birth :");
        label7.setBounds(120,305,450,50);
        label7.setFont(new Font("Raleway",Font.BOLD,19));
        add(label7);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(320,315,400,30);
        add(dateChooser);

        JLabel label8 = new JLabel("Email address :");
        label8.setBounds(120,355,450,50);
        label8.setFont(new Font("Raleway",Font.BOLD,19));
        add(label8);

        textField8 = new JTextField(15);
        textField8.setBounds(320,368,400,30);
        textField8.setFont(new Font("Arial",Font.BOLD,14));
        add(textField8);


        JLabel label9 = new JLabel("Marital Status :");
        label9.setBounds(120,405,450,50);
        label9.setFont(new Font("Raleway",Font.BOLD,19));
        add(label9);


        r3 = new JRadioButton("MARRIED");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(320,416,100,30);
        add(r3);

        r4 = new JRadioButton("UNMARRIED");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(490,416,150,30);
        add(r4);

        r5 = new JRadioButton("OTHER");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(695,416,90,30);
        add(r5);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);
        buttonGroup2.add(r5);

        JLabel label10 = new JLabel("Address :");
        label10.setBounds(120,455,450,50);
        label10.setFont(new Font("Raleway",Font.BOLD,19));
        add(label10);

        textField10 = new JTextField(15);
        textField10.setBounds(320,462,400,30);
        textField10.setFont(new Font("Arial",Font.BOLD,14));
        add(textField10);

        JLabel label11 = new JLabel("City :");
        label11.setBounds(120,510,450,50);
        label11.setFont(new Font("Raleway",Font.BOLD,19));
        add(label11);

        textField11 = new JTextField(15);
        textField11.setBounds(320,519,400,30);
        textField11.setFont(new Font("Arial",Font.BOLD,14));
        add(textField11);

        JLabel label12 = new JLabel("Pin Code :");
        label12.setBounds(120,568,450,50);
        label12.setFont(new Font("Raleway",Font.BOLD,19));
        add(label12);

        textField12 = new JTextField(15);
        textField12.setBounds(320,580,400,30);
        textField12.setFont(new Font("Arial",Font.BOLD,14));
        add(textField12);

        JLabel label13 = new JLabel("State :");
        label13.setBounds(120,630,450,50);
        label13.setFont(new Font("Raleway",Font.BOLD,19));
        add(label13);

        textField13 = new JTextField(15);
        textField13.setBounds(320,640,400,30);
        textField13.setFont(new Font("Arial",Font.BOLD,14));
        add(textField13);

        button1 = new JButton("NEXT");
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(660,695,80,30);
        button1.addActionListener(this);
        add(button1);














        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textField4.getText();
        String fname = textField5.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "MALE";
        }else if (r2.isSelected()){
            gender ="FEMALE";
        }
        String email = textField8.getText();
        String marital = null;
        if(r3.isSelected()){
            marital = "MARRIED";
        }else if (r4.isSelected()){
            marital = "UNMARRIED";
        } else if (r5.isSelected()){
            marital = "OTHER";
        }
        String address = textField10.getText();
        String city = textField11.getText();
        String pincode = textField12.getText();
        String state = textField13.getText();

        try{
            if("".equals(textField4.getText())){
                JOptionPane.showMessageDialog(null,"Please Fill The All Details Properly");
            }else {
                if ("".equals(textField5.getText())) {
                    JOptionPane.showMessageDialog(null, "Please Fill The All Details Properly");
                } else {
                    if ("".equals(textField8.getText())) {
                        JOptionPane.showMessageDialog(null, "Please Fill The All Details Properly");
                    } else {
                        if ("".equals(textField10.getText())) {
                            JOptionPane.showMessageDialog(null, "Please Fill The All Details Properly");
                        } else {
                            if ("".equals(textField11.getText())) {
                                JOptionPane.showMessageDialog(null, "Please Fill The All Details Properly");
                            } else {
                                if ("".equals(textField12.getText())) {
                                    JOptionPane.showMessageDialog(null, "Please Fill The All Details Properly");
                                } else {
                                    if ("".equals(textField13.getText())) {
                                        JOptionPane.showMessageDialog(null, "Please Fill The All Details Properly");
                                    } else {

                                        Con con1 = new Con();
                                        String q = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + pincode + "', '" + state + "')";
                                        con1.statement.executeUpdate(q);
                                        new Signup2(formno);
                                        setVisible(false);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Signup();
    }
}