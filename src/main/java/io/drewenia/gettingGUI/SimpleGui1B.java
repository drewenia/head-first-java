package io.drewenia.gettingGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Arayüzü uygulayın. Bu, şunu söyler: "SimpleGui1B'nin bir instance'i BİR ActionListener'dir." (Button yalnızca
ActionListener interface'ini implemente edenlere event'ler verecektir)*/
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click");

        /* Button'la ilginizi register edin. Bu, button'a "Beni listener'lar listene ekle" demektir. Geçmeniz gereken
        argüman MUTLAKA ActionListener interface'ini implemente eden bir sınıfın bir nesnesi OLMALIDIR!*/
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    /* Button, size bir event'in meydana geldiğini bildirmek için bu methodu çağırır. Bize bir ActionEvent nesnesini
    argüman olarak gönderir, ancak bizim ona ihtiyacımız yok. Event'in meydana geldiğini bilmek yeterlidir.*/
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Clicked");
    }
}
