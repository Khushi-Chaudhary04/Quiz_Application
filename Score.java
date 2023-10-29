import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
    JLabel qno;

    public Score(String name, int score) {
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);

        // ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        // setIconImage(i.getImage());

        image.setBounds(0, 200, 300, 250);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        JLabel heading = new JLabel("Thank You " + name + " For Playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        JLabel lblscore = new JLabel("Your Score is : " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(lblscore);

        JButton submit = new JButton("Exit");
        submit.setBounds(380, 270, 120, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setResizable(false);
        setLocation(575, 250);
        setTitle("Quiz Application");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Score("user", 0);
    }
}
