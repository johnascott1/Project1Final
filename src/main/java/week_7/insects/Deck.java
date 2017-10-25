package week_7.insects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import static com.google.common.collect.Lists.newArrayList;
public class Deck {
    Cards dealOut = new Cards();
    ArrayList<Integer> retrieveCards = dealOut.getCards();
    ArrayList<String> retrieveSuite = dealOut.getSuites();
    ArrayList<String> deck = new ArrayList<>();
    //Deck is created here.
    public ArrayList<String> createDeck(){
        for (String oneSuite : retrieveSuite){
            for (int oneCard : retrieveCards){
                deck.add(oneCard+ " of "+oneSuite);
            }

        }
        Collections.shuffle(deck); //the cards are shuffled.

        return deck;
    }
    Deck(){
        deck = createDeck();

    }
    public void setDeck(ArrayList<String> deck) {
        this.deck = deck;
    }

    public ArrayList<String> getDeck() {
        return deck;
    }



}

