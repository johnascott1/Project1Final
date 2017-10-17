package week_7.insects;

import java.util.ArrayList;

/** The instructions are in grades/Lab 7 Questions.md  */


public class Question_1_InsectManager {
    
    public static void main(String[] args) {
        Question_1_InsectManager insectManager = new Question_1_InsectManager();
        insectManager.testInsects();
                
    }
    
    public void testInsects() {
        
        // TODO Create an ArrayList of Insect objects
        ArrayList<Insect> allInsects = new ArrayList<>();
        // TODO Create two example Butterfly objects and add them to the ArrayList
        Butterfly butterflyA = new Butterfly("red", "Rose");
        Butterfly butterflyB = new Butterfly("blue", "Tulips");
        allInsects.add(butterflyA);
        allInsects.add(butterflyB);
        // TODO Create two example Bee objects and add them to the ArrayList
        Bee beeA = new Bee("Bee", 4, "black and yellow", true);
        Bee beeC = new Bee("Bee", 4, "black and orange", true);
        allInsects.add(beeA);
        allInsects.add(beeC);
        // TODO loop over the ArrayList and call speciesDataReport() for each Insect (Butterfly, Bee) object in the ArrayList
        for (Insect I : allInsects){
           String data = I.speciesDataReport();
            System.out.println(data);
        }
    }
    
}
