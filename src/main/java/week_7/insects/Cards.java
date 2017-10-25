package week_7.insects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newLinkedList;

public class Cards {
    private static final ArrayList<Integer> cards = newArrayList(3, 4, 5, 6, 7, 8, 9, 10);
    private static final ArrayList<String> suites = newArrayList("Hearts", "Diamonds", "Clubs", "Spades");


    public static ArrayList<Integer> getCards() {
        return cards;
    }

    public static ArrayList<String> getSuites() {
        return suites;
    }








}
