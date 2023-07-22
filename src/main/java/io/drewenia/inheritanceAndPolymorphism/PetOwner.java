package io.drewenia.inheritanceAndPolymorphism;

public class PetOwner {
    public void start(){
        Vet vet = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        /* Veterinerin "giveShot()" (aşı yap) yöntemi, size verdiğiniz herhangi bir "Animal"ı kabul edebilir.
        Argüman olarak geçirdiğiniz nesne, "Animal" sınıfının bir alt sınıfı olduğu sürece işleyecektir. Bu durumda
        method çalışacaktır.*/
        vet.giveShot(d); // Dog's makeNoise() runs
        vet.giveShot(h); // Hippo's makeNoise() runs
    }
}
