package io.drewenia.remoteDeploymentWithRMI;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote Hello");
            String s1 = service.sayHello();
            System.out.println(s1);
        }catch (Exception ex){
            ex.printStackTrace();;
        }
    }
}
