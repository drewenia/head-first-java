package io.drewenia.remoteDeploymentWithRMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/* UnicastRemoteObject sınıfını extend etmek, bir remote nesne oluşturmanın en kolay yoludur.*/
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    /* Üst sınıfın (UnicastRemoteObject için) constructor metodu bir exception declare ediyor, bu nedenle SİZ bir
    constructor metod yazmalısınız, çünkü bu, constructor metodunuzun riskli kodu (üst sınıf constructor'ını) çağırdığı
    anlamına gelir.*/
    public MyRemoteImpl() throws RemoteException {
    }

    /* Tabii ki, tüm interface metodlarını implemente etmemiz gerekiyor. Ancak dikkat edin ki RemoteException'ı
    bildirmeniz gerekmiyor.*/
    @Override
    public String sayHello() throws RemoteException {
        return "Server says 'hi'";
    }

    public static void main(String[] args) {
       try{
           /* Remote nesneyi oluşturun ve ardından onu rmiregistry'ye, static Naming.rebind() kullanarak "bağlayın".
           Kaydettikten sonra, nesneye erişmek isteyen client'ların rmi kayıt defterinde bunu aramak için kullanacağı
           isimdir.*/
           MyRemote service = new MyRemoteImpl();
           Naming.rebind("Remote Hello",service);
       } catch (Exception ex){
           ex.printStackTrace();
       }
    }
}
