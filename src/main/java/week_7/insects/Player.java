package week_7.insects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.Delayed;

public class Player {

    private ArrayList<AgramCard> playerHand;
    private String searchValue;
    private Deal deal = new Deal();
    private String name;
//String searchValue
//this.searchValue = searchValue;
    
    public Player(String name, ArrayList<AgramCard> playerHand){
        this.playerHand = playerHand;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public void setPlayerHand(ArrayList<AgramCard> playerHand) {
        this.playerHand = playerHand;
    }

    public ArrayList<AgramCard> getPlayerHand() {
        return playerHand;
    }
}
