package io.drewenia.gettingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel(); // Graphics2D olarak circle döndürecek

        frame.getContentPane().add(BorderLayout.SOUTH, button); // Button SOUTH konumuna konumlandırılacak
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel); // drawPanel CENTER'a
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint(); // paintComponent() her widget için tekrar çağırılır
    }
}

