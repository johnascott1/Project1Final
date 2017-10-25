package week_7.insects;
import java.util.ArrayList;
import java.util.LinkedList;
public class Deal {
    private Deck deck = new Deck();
    private ArrayList<String> playerHand;
    private ArrayList<String> dealDeck = deck.getDeck();

    private ArrayList<String> makeDeal(){
        playerHand = new ArrayList<>();
    for (int x = 0; x < 6;x++) {
        playerHand.add(dealDeck.get(0));
        dealDeck.remove(0);



        //dealDeck.remove(0);
    }
    return playerHand;
    }
    Deal(){
        playerHand = makeDeal();

    }

    public ArrayList<String> getPlayerHand() {
        return playerHand;
    }
}
