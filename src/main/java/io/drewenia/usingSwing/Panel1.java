package io.drewenia.usingSwing;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 panel = new Panel1();
        panel.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JButton button1= new JButton("Click me");
        JButton button2= new JButton("Dont click me");
        JButton button3= new JButton("Shock me");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
