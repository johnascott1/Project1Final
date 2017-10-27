package week_7.insects;
import java.util.ArrayList;
import java.util.LinkedList;
public class Deal {
    
//    private Deck deck = new Deck();
//
//    private ArrayList<String> dealDeck;  // = deck.getDeck();

     static ArrayList<AgramCard> makeDeal(Deck dealDeck){
    
        ArrayList<AgramCard> playerHand;
        
        playerHand = new ArrayList<>();
    for (int x = 0; x < 6;x++) {
        playerHand.add(dealDeck.deal());
    }
    
    return playerHand;
    
    }
    
//    Deal(){
//        playerHand = makeDeal();
//
//    }

 //   public ArrayList<AgramCard> getPlayerHand() {
 //       return playerHand;
 //   }
}
