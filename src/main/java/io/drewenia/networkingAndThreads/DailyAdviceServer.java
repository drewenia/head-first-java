package io.drewenia.networkingAndThreads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {
            "Take smaller bites",
            "Go for the tight jeans. No they do NOT make you look fat",
            "One word: inappropriate",
            "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut"
    };

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    private void go() {
        try {
            /* ServerSocket, bu sunucu uygulamasının bu kodun çalıştığı makinede 4242 numaralı portta client isteklerini
             dinlemesini' sağlar.*/
            ServerSocket serverSocket = new ServerSocket(4242);

            while(true){
                /* accept methodu, bir request gelene kadar engellenir (sadece bekler) ve ardından method, client ile
                iletişim kurmak için (anonim bir portta) bir Soket döndürür.*/
                Socket socket = serverSocket.accept();

                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                /* Şimdi client'e olan Soket bağlantısını kullanarak bir PrintWriter oluştururuz ve ona bir String
                advice iletisi göndeririz (println()). Ardından bu client ile işimiz bittiği için Soket'i kapatırız.*/
                writer.println(advice);
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getAdvice(){
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}
