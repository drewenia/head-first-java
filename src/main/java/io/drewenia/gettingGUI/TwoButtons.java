package io.drewenia.gettingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Artık class bazında ActionListener'i implemente etmiyorum. Inner class olarak configure ediyorum */
public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    void go(){
        frame = new JFrame();
        label = new JLabel("I am a label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton changeLabelButton = new JButton("Change Label");
        changeLabelButton.addActionListener(new LabelListener()); //LabelListener instance'ini kullanıyorum

        JButton changeCircleColorButton = new JButton("Change Circle Color");
        changeCircleColorButton.addActionListener(new ColorListener()); //ColorListener instance'ini kullanıyorum

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.EAST,changeLabelButton);
        frame.getContentPane().add(BorderLayout.WEST,label);
        frame.getContentPane().add(BorderLayout.SOUTH,changeCircleColorButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }
}
