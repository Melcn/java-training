package Koor;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class Example1 extends JFrame {
    private static final long serialVersionUID = -4939544011287453046L;

    private JButton btnClickMe = new JButton("click me");
    private JButton btnPushMe = new JButton("Push me!");
    private JButton btnActivateMe = new JButton("Activate me!");

    public Example1() {
        super("Implémentation d'interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);
    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        Example1 demo = new Example1();
        demo.setVisible(true);
    }
}
