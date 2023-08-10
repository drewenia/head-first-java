package io.drewenia.gettingGUI;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        /* Bu satır, pencereyi kapattığınızda programın hemen sonlandırılmasını sağlar (eğer bu satırı çıkartırsanız,
        program sürekli olarak ekranda duracaktır).*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
