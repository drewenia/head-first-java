package io.drewenia.networkingAndThreads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    private void go() {
        JFrame frame = new JFrame("Simple chat client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        outgoing = new JTextField(20);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());

        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUpNetworking();

        /* Yeni bir Thread başlatıyoruz, Thread için Runnable olarak yeni bir inner sınıf kullanıyoruz. Thread'in
        görevi, server'in soket stream'inden okumak ve gelen herhangi bir iletiyi kayan metin alanında
        görüntülemektir.*/
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking() {
        /* Input ve output stream'lerini almak için soketi kullanıyoruz. Zaten server'a göndermek için output stream'ini
        kullanıyorduk, ancak şimdi yeni 'reader' thread'in server'dan iletiler alabilmesi için inputStream'i
        kullanıyoruz.*/
        try {
            socket = new Socket("127.0.0.1", 4000);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        /* Burada yeni bir şey yok. Kullanıcı button'a tıkladığında, bu method metin alanının içeriğini server'a
        gönderir.*/
        public void actionPerformed(ActionEvent ev) {
            try {
                writer.println(outgoing.getText());
                writer.flush();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public class IncomingReader implements Runnable {
        /* İşte Thread bunu yapar!! run() methodunda, server'dan aldığı şey null değilse, bir döngü içinde kalır,
        her seferinde bir satır okur ve her satırı kayan metin alanına (bir satır sonu karakteri ile birlikte) ekler.*/
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    incoming.append(message + "\n");

                } // close while
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } // close run
    }
}
