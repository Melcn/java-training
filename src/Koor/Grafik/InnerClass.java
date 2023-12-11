package Koor.Grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClass extends JFrame {
    private static final long serialVersionUID = -4939544011287453046L;
    public JButton btnActivateMe = new JButton("Activate me!");
    private JButton btnClickMe = new JButton("click me");
    private JButton btnPushMe = new JButton("Push me!");
    private int demo = 10;

    public InnerClass() {
        super("Implémentation d'interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        btnClickMe.addActionListener(new BtnClickMeListenerInner());

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new InnerClass();
    }

    private class BtnClickMeListenerInner implements ActionListener {

        private int demo = 2000;

        public void actionPerformed(ActionEvent e) {
            System.out.println(demo);
            System.out.println(this.demo);
            System.out.println(InnerClass.this.demo);//recupere la valeur de la class initial
        }
    }
}
