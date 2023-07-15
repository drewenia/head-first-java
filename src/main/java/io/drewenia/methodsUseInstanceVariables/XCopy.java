package io.drewenia.methodsUseInstanceVariables;

public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();

        int y = x.go(orig);
        // orig degeri go methoduna sadece kopyalanir degeri DEGISMEZ
        // cikti olarak 42 - 84 çıktısı elde edilir
        System.out.println("Orig : " + orig + " y : " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
