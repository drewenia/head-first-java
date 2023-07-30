package io.drewenia.constructorsAndGarbageCollection;

public class MakeHippo {
    public static void main(String[] args) {
        /* Buffy isminde bir Hippo oluşturun ve bu ismi Hippo constructor'ına geçirin. Ardından Hippo'nun miras aldığı
        getName() metodu çağırın */
        Hippo hippo = new Hippo("Buffy");
        System.out.println(hippo.getName());
    }
}
