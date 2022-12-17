package warFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
   private List<Card> cards = new ArrayList<>(52); // List of Card
   private List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades"); // List Created to make it simpler to name cards
   
// in the constructor, when a new Deck is instantiated, the Cards field is populated with the standard 52 cards
    public Deck() {
    	for (int i = 2; i < 15; i++) {

            for (String suit : suits) { // for every suit in the deck of suits
                cards.add(new Card(i, suit)); // a card with a value of i and its corresponding suit is added
            }

        }

    }
    	
    public void shuffle() { // shuffle method used to randomize the order of the cards list
        Collections.shuffle(cards);
    }

    public Card draw() { // remove method is used to remove and return(use) the top card of the Cards list allowing for use
        return cards.remove(0);// but removing it from the deck so it isn't used twice in one game
    }

}