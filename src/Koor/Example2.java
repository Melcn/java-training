package Koor;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 extends JFrame {
    private static final long serialVersionUID = -4939544011287453046L;
    public JButton btnActivateMe = new JButton("Activate me!");
    private JButton btnClickMe = new JButton("click me");
    private JButton btnPushMe = new JButton("Push me!");
    private int demo = 10;

    public Example2() {
        super("Implémentation d'interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example2();
    }

    private class BtnClickMeListenerInner implements ActionListener {

        private int demo = 2000;

        public void actionPerformed(ActionEvent e) {

        }
    }
}
