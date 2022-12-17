package warFinal;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>(); // List of Card
    private int score;
    private String name;

    public Player(String name) { //player constructor created with a starting score of 0
		score = 0; 
		this.name = name;
	}

    // method describe prints out information about the player and calls the describe method for each card in the Hand List
    public void describe() {
        System.out.printf("\n" + name + " has the following hand: \n");
        for (Card card : hand) { 
            card.describe();
        }
    }

    public Card flip() { // remove method used to remove and return(use) the top card of the hand list allowing for use
        return hand.remove(0);// but removing it from the deck so it isn't used twice
    }

    public void draw(Deck deck) { //takes a Deck as an argument 
        hand.add(deck.draw());// and calls the draw method on the deck, adding the returned Card to the hand field
    }
    

    public void incrementScore() { //when called it will add 1 to the Player's score field
        score++;
    }

    public int getScore() { //retrieving the score 
        return score;
    }

}
	
	