package javatwo;

import java.util.ArrayList;

public class Deck {


     static ArrayList<Card> makeDeck() {
        ArrayList<Card> result = new ArrayList<>();

        for (Suit suit : Suit.values ())
            for (Rank rank : Rank.values ())
                result.add (new Card (suit, rank));

            return result;
    }




}
