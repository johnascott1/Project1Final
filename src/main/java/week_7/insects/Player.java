package week_7.insects;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {

    private ArrayList<String> playerHand;
    private String searchValue;
    private Deal deal = new Deal();
    private String name;
//String searchValue
//this.searchValue = searchValue;
    public Player(String name){
        this.playerHand = deal.getPlayerHand();
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

    public void setPlayerHand(ArrayList<String> playerHand) {
        this.playerHand = playerHand;
    }

    public ArrayList<String> getPlayerHand() {
        return playerHand;
    }
}
