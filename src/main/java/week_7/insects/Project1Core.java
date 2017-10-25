package week_7.insects;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.google.common.collect.Lists.newArrayList;
import static input.InputUtils.intInput;

/** The instructions are in grades/Lab 7 Questions.md  */


public class Project1Core {

    public static void main(String[] args) {
        
        
        Deck deckObject = new Deck();
       // ArrayList<AgramCard> deck = deckObject.getDeck();
        ArrayList<Player> playerQue = new ArrayList<>();
        
        
        // Just testing
        AgramCard firstCard = deckObject.deal();
        System.out.println(firstCard);
        System.out.println(firstCard.suit);
        System.out.println(firstCard.faceValue);
    
        
        
    
        int playerCount = 2; //intInput("Enter the number of players: ");
        int humanPlayerCount = 2; //intInput("Enter the number of human players: ");
        int computerPlayerCount = (playerCount-humanPlayerCount);
        /*
        for (String checkDeck : deck){
            System.out.println(checkDeck);
        }
        */
        for (int humanTotal = 0; humanTotal < humanPlayerCount; humanTotal++){
            //System.out.println(humanTotal);
            String name = ("Player " + humanTotal);
            ArrayList<AgramCard> handOfCards = Deal.makeDeal(deckObject);
    
            System.out.println(handOfCards);
    
            
            HumanPlayer newPlayer = new HumanPlayer(name, handOfCards);
            System.out.println(newPlayer.getPlayerHand());
        }
    }



}
