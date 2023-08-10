package io.drewenia.gettingGUI;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    /* x ve y coordinatları için 2 instance variable */
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel myDrawPanel = new MyDrawPanel(); //DrawPanel inner class olarak eklendi

        frame.getContentPane().add(myDrawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i=0;i<130;i++){
            x++; // x coordinatı 1 artırılıyor
            y++; // y coordinatı 1 artırılıyor
            myDrawPanel.repaint(); // panel sürekli baştan çizdiriliyor
            try {
                Thread.sleep(50); // 50 ms de bir circle aşağıya doğru hareket ediyor
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class MyDrawPanel extends JPanel{
        @Override
        public void paint(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }
}
