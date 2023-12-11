package Koor;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class Example1 extends JFrame {
    private static final long serialVersionUID = -4939544011287453046L;
    public JButton btnActivateMe = new JButton("Activate me!");
    private JButton btnClickMe = new JButton("click me");
    private JButton btnPushMe = new JButton("Push me!");

    public Example1() {
        super("Implémentation d'interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        btnClickMe.addActionListener(new BtnClickMeListener());
        btnPushMe.addActionListener(new BtnPushMeListener());
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        Example1 demo = new Example1();
        demo.setVisible(true);
    }
}
