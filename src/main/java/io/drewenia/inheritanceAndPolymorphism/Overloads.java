package io.drewenia.inheritanceAndPolymorphism;

public class Overloads {
    String uniqueID;

    public int addNums(int a, int b){
        return a + b;
    }
    public double addNums(double a, double b){
        return a + b;
    }
    public void setUniqueID(String id){
        this.uniqueID = id;
    }

    public void setUniqueID(int id){
        this.uniqueID = Integer.toString(id);
    }
}
