package Koor;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Example1 extends JFrame {
    private static final long serialVersionUID = -4939544011287453046L;

    private JButton btnClickMe = new JButton("click me");
    private JButton btnPushMe = new JButton("Push me!");
    private JButton btnActivateMe = new JButton("Activate me!");

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());


        Example1 demo = new Example1();
        demo.setVisible(true);
    }
}
