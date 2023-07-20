package io.drewenia.getTheKnowTheJavaApi;

import java.util.ArrayList;

public class DotCom {
    private String name;
    ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locationCells){
        this.locationCells = locationCells;
    }

    public void setName(String name){
        this.name = name;
    }

    public String checkYourSelf(String userInput){
        String result = "miss";
        // Kullanıcının tahmininin ArrayList içinde olup olmadığını, indeksini sorarak bulabilirsiniz. Eğer listede
        // bulunmuyorsa, indexOf() metodu -1 değerini döndürür.
        int index = locationCells.indexOf(userInput);

        // index büyük veya eşitse 0'a kullanıcı tahminini ArrayList'den kaldıracağız
        if (index>=0){
            locationCells.remove(index);
            // eğer liste boş ise "kill" dönmemiz gerekmektedir
            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "   : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
