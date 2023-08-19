package io.drewenia.networkingAndThreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
    ArrayList clientOutputStream;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket socket;

        public ClientHandler(Socket socket) {
            try {
                this.socket = socket;
                InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);

                } // close while
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public void tellEveryone(String message) {
            Iterator it = clientOutputStream.iterator();
            while(it.hasNext()) {
                try {
                    PrintWriter writer = (PrintWriter) it.next();
                    writer.println(message);
                    writer.flush();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        VerySimpleChatServer verySimpleChatServer = new VerySimpleChatServer();
        verySimpleChatServer.go();
    }

    private void go() {
        clientOutputStream = new ArrayList();
        try {
            ServerSocket serverSock = new ServerSocket(4000);
            while(true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStream.add(writer);
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
