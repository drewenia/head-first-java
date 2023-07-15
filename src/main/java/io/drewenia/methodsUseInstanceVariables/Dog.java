package io.drewenia.methodsUseInstanceVariables;

public class Dog {
   void bark(int numberOfBarks){
       while (numberOfBarks > 0){
           System.out.println("wuff");
           numberOfBarks-=1;
       }
   }
}
