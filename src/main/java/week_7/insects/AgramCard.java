package week_7.insects;

/**
 * Created by clara on 10/25/17.
 */
public class AgramCard {
    
    String suit;
    String faceValue;  //  "A" or "3"  .....
    int gameValue;   //
    
    AgramCard(String suit, String faceValue, int gameValue) {
        this.suit = suit;
        this.faceValue = faceValue;
        this.gameValue = gameValue;
    }
    
    @Override
    public String toString() {
        return faceValue + " of " + suit + " worth " + gameValue;
    }
}
