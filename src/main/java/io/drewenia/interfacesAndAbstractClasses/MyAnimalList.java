package io.drewenia.interfacesAndAbstractClasses;

public class MyAnimalList {
    /* Endişelenmeyin. Gerçekten yeni bir Animal nesnesi oluşturmuyoruz; yeni bir Animal tipinde bir dizi nesnesi
    oluşturuyoruz. (Unutmayın, soyut bir türün yeni bir örneğini oluşturamazsınız, ancak o türde tutan bir dizi nesnesi
    oluşturabilirsiniz).*/
    Animal[] animals = new Animal[5];
    private int nextIndex;

    public void add(Animal animal){
        if (nextIndex<animals.length){
            animals[nextIndex] = animal;
            System.out.println("Animal added at " + nextIndex);
            nextIndex++;
        }
    }
}
