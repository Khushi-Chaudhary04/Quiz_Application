
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// extending the Jframe class for the frame and implmenting ActionListener interface 
public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    String name;
    JTextField tfname;

    public Login() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpeg"));
        JLabel image = new JLabel(i1);

        image.setBounds(0, 0, 600, 500);
        add(image);

        // adding heading
        JLabel heading = new JLabel("Simple Minds");
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setBounds(750, 60, 300, 45);
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter Your Name ");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        // Adding Rules button
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        // Adding Back Button
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setResizable(false);
        setTitle("Quiz Application ");
        setSize(1200, 500);
        setLocation(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        setIconImage(i.getImage());

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            new Rules(name);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();

    }

}