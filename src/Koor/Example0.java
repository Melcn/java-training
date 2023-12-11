package Koor;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Example0 extends JFrame {

    private static final long serialVersionUID = -4939544011287453046L;

    private JButton btnClickMe = new JButton("Click me!");
    private JButton btnPushMe = new JButton("Push me!");
    private JButton btnActivateMe = new JButton("Activate me!");

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());


        Demo demo = new Demo();
        demo.setVisible(true);
    }
}
