package io.drewenia.primitivesAndReferences;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        // bark methodu name variable'i set edilmeden once cagirildigindan dolayi null ciktisi uretecektir
        dog1.bark();
        dog1.name = "Bart";

        // Dog array'ini create et
        Dog[] myDogs = new Dog[3];
        // icerisine Dog'lari ekle
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // array icerisinde ki Dog reference'larına eris
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // array'in icerisinde ki [2] numarali index'teki dog'un name'ini yazdir
        System.out.println("last dog name is " + myDogs[2].name);

        int x = 0;
        // myDogs array'inin length'i kadar dön
        while (x < myDogs.length){
            myDogs[x].bark();
            x += 1;
        }
    }
    void bark(){
        System.out.println(name + " says ruff!");
    }
}
