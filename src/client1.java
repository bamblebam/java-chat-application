import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class client1 extends JFrame implements ActionListener {
    ////
    JPanel p1;
    JTextField t1;
    JButton b1;
    JTextArea a1;

    client1() {

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting/icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(5, 17, 30, 30);
        p1.add(l1);

        l1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("chatting/icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(40, 5, 60, 60);
        p1.add(l2);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("chatting/icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l5 = new JLabel(i9);
        l5.setBounds(290, 20, 30, 30);
        p1.add(l5);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("chatting/icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l6 = new JLabel(i12);
        l6.setBounds(350, 20, 35, 30);
        p1.add(l6);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("chatting/icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(13, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel l7 = new JLabel(i15);
        l7.setBounds(410, 20, 13, 25);
        p1.add(l7);

        JLabel l3 = new JLabel("Gaitonde");
        l3.setFont(new Font("SAN _SERIF", Font.BOLD, 18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(110, 15, 100, 18);
        p1.add(l3);

        JLabel l4 = new JLabel("Active Now");
        l4.setFont(new Font("SAN _SERIF", Font.PLAIN, 14));
        l4.setForeground(Color.WHITE);
        l4.setBounds(110, 35, 100, 20);
        p1.add(l4);

        a1 = new JTextArea();
        a1.setBounds(5, 75, 440, 570);
        a1.setBackground(Color.PINK); // To check text-area
        add(a1);

        t1 = new JTextField();
        t1.setBounds(5, 655, 310, 40);
        t1.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(t1);

        b1 = new JButton("Send");
        b1.setBounds(320, 655, 123, 40);
        b1.setBackground(new Color(7, 94, 84));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(b1);

        // getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setSize(450, 700);
        setLocation(400, 50);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new client1().setVisible(true);

    }

}
