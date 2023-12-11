package Koor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AnonymClass extends JFrame implements ActionListener {

    private static final long serialVersionUID = -4939544011287453046L;

    private JButton btnClickMe = new JButton("Click me!");
    private JButton btnPushMe = new JButton("Push me!");
    private JButton btnActivateMe = new JButton("Activate me!");

    public AnonymClass() {
        super("Implémentation d'interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        btnClickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnActivateMe.setForeground(Color.GREEN);
            }
        });

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new AnonymClass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClickMe) {
            System.out.println("Bouton a clické");
        } else if (e.getSource() == btnPushMe) {
            this.setTitle(("click"));
        }
    }
}
