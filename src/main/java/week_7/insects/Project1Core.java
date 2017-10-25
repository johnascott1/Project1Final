package week_7.insects;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.google.common.collect.Lists.newArrayList;
import static input.InputUtils.intInput;

/** The instructions are in grades/Lab 7 Questions.md  */


public class Project1Core {

    public static void main(String[] args) {
        Deck deckObject = new Deck();
        ArrayList<String> deck = deckObject.getDeck();
        ArrayList<Player> playerQue = new ArrayList<>();
        int playerCount = intInput("Enter the number of players: ");
        int humanPlayerCount = intInput("Enter the number of human players: ");
        int computerPlayerCount = (playerCount-humanPlayerCount);
        /*
        for (String checkDeck : deck){
            System.out.println(checkDeck);
        }
        */
        for (int humanTotal = 0; humanTotal < humanPlayerCount; humanPlayerCount++){
            //System.out.println(humanTotal);
            String name = ("Player " + humanTotal);
            HumanPlayer newPlayer = new HumanPlayer(name);
            System.out.println(newPlayer.getPlayerHand());
        }
    }



}
