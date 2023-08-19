package io.drewenia.networkingAndThreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }

    private void go() {
        try {
            /* 4242 numaralı portta, bu kodun çalıştığı aynı ana makinede (yani 'localhost') çalışan bir şeye Soket
            bağlantısı oluşturun.*/
            Socket socket = new Socket("127.0.0.1",4242);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            /* Bir BufferedReader'ı, bir InputStreamReader'a ve sonra da Soket'in input stream'ine chain edin */
            BufferedReader bufferedReader = new BufferedReader(streamReader);

            /* Bu readLine() işlemi, sanki bir Dosya'ya chain edilmiş bir BufferedReader kullanıyormuşsunuz gibi
            TAM OLARAK aynıdır... Başka bir deyişle, bir BufferedReader methodunu çağırdığınızda, okuyucu karakterlerin
            nereden geldiğini bilmez veya umursamaz.*/
            String advice = bufferedReader.readLine();
            System.out.println("Today you should : " + advice);

            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
