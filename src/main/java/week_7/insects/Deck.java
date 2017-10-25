package week_7.insects;

import java.util.ArrayList;
import java.util.Collections;

import static com.google.common.collect.Lists.newArrayList;
public class Deck {
    
    
    ArrayList<Integer> retrieveCards = CardData.getCards();
    ArrayList<String> retrieveSuite = CardData.getSuites();
    
    ArrayList<AgramCard> deck = new ArrayList<>();
    //Deck is created here.
    
    public ArrayList<AgramCard> createDeck(){
        for (String oneSuite : retrieveSuite){
            for (int oneCard : retrieveCards){
                
                //deck.add(oneCard+ " of "+oneSuite);
                
                AgramCard card = new AgramCard(oneSuite, "?", oneCard);    // or whatever data you need about each card
                deck.add(card);
            }

        }
        Collections.shuffle(deck); //the cards are shuffled.

        return deck;
    }
    Deck(){
        deck = createDeck();

    }
    
    public AgramCard deal() {
        if (deck.isEmpty()) { return null; }
        return deck.remove(0);    // todo is this the best check if there are no more cards left?
    }
    
    
//    public void setDeck(ArrayList<AgramCard> deck) {
//        this.deck = deck;
//    }
//
//    public ArrayList<AgramCard> getDeck() {
//        return deck;
//    }



}

