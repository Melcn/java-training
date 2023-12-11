package Koor;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Example0 extends JFrame {

    private static final long serialVersionUID = -4939544011287453046L;

    private JButton btnClickMe = new JButton("Click me!");
    private JButton btnPushMe = new JButton("Push me!");
    private JButton btnActivateMe = new JButton("Activate me!");

    public Example0() {
        super("Implémentation d'interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        // Un FlowLayout permet de positionner les boutons les uns à la suite des autres.
        contentPane.setLayout(new FlowLayout());
        contentPane.add(btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());


        Example0 demo = new Example0();
        demo.setVisible(true);
    }
}
