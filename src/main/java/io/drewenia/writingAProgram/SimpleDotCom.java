package io.drewenia.writingAProgram;

public class SimpleDotCom {
    private int[] locationCells;
    private int numberOfHits = 0;
    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
    public String checkYourSelf(String guess){
        int userGuess = Integer.parseInt(guess);
        String result = "miss";
        for (int cell : locationCells){
            if (userGuess == cell){
                result = "hit";
                numberOfHits++;
                break;
            }
        }

        if (numberOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
