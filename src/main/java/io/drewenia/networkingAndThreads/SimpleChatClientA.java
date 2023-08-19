package io.drewenia.networkingAndThreads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {
    JTextField outgoing;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClientA clientA = new SimpleChatClientA();
        clientA.go();
    }

    private void go() {
        JFrame frame = new JFrame("Simple chat application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());

        mainPanel.add(outgoing);
        mainPanel.add(sendButton);

        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);

        setUpNetworking();

        frame.setSize(400,500);
        frame.setVisible(true);
    }

    private void setUpNetworking() {
        try {
            socket = new Socket("127.0.0.1",5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("network established");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            writer.println(outgoing.getText());
            writer.flush();
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }
}

