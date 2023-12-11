package Koor.Grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnPushMeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        TestJFrame frame = (TestJFrame) btn.getTopLevelAncestor();
        frame.setTitle("Click");

        frame.btnActivateMe.setText("Hello");
        frame.btnActivateMe.setForeground(Color.red);

    }
}