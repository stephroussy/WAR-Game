package warFinal;

public class App {

	public static void main(String[] args) {
        Deck deck = new Deck(); // instantiate a deck using the Deck class
        Player player1 = new Player("Player 1"); // instantiate player 1 using the Player class
        Player player2 = new Player("Player 2"); // instantiate player 2 using the Player class
        deck.shuffle(); // calling the shuffle method on the deck

       
        for (int i = 0; i < 52; i++) { // using a traditional for loop, iterate 52 times 
            if ( i % 2 == 0) { // calling the Draw method on every other player each iteration
                player1.draw(deck); // using the Deck you instantiated (this is done using modulus operator to get every other player)
            } else {
                player2.draw(deck);
            }
        }
        // introduction description to the game WAR will be printed when the game begins
        System.out.println("This is an automated version of the classic card game WAR. \n"
        		+ "A deck of cards has been split evenly between two players.\n"
        		+ "During each round, each player will draw a card from their hand.\n"
        		+ "The player who draws the card with the highest value will win the round and gain one point.\n"
        		+ "If the card values are equal then the round ends in a draw and no scores will increment during that round.\n"
        		+ "The game ends when all cards have been played.\n"
        		+ "The player with the highest score will be deemed the winner.\n"
        		+ "If the final scores are equal, the game ends in a draw.\n");
        
        // the following will print out each players hand
        player1.describe();
        player2.describe();
        
        for (int i = 1; i <= 26; i++) { // iterating through a traditional for loop 26 times and calling the flip method for each player
        	System.out.println("\nFlip " + i + ": ");
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            
            // comparing the value of each card returned by the two player's flip methods
            if (player1Card.getValue() > player2Card.getValue()) { // if player1Card is greater than player2Card
            	player1.incrementScore(); // then the incrementScore method will be called on player1 
            	//the following will print each players card value and suit
            	System.out.println("\nPlayer1 plays: ");
            	player1Card.describe();
            	System.out.println("\nPlayer2 plays: ");
            	player2Card.describe();
            	// the following will print the winner of the round and the current scores
            	System.out.println("\nWinner of round = Player1 !\n\nRound " + i + " scores: \n\nPlayer1: ");
            	System.out.println(player1.getScore());
            	System.out.println("\nPlayer2: ");
            	System.out.println(player2.getScore());
            	
  
            } else if (player1Card.getValue() < player2Card.getValue()) { // if player2Card is greater than player1Card
            	player2.incrementScore(); // then the incrementScore method will be called on player2
            	//the following will print each players card value and suit
            	System.out.println("\nPlayer1 plays: ");
            	player1Card.describe();
            	System.out.println("\nPlayer2 plays: ");
            	player2Card.describe();
            	// the following will print the winner of the round and the current scores
            	System.out.println("\nWinner of round = Player2 !\n\nRound " + i + " scores: \n\nPlayer1: ");
            	System.out.println(player1.getScore());
            	System.out.println("\nPlayer2: ");
            	System.out.println(player2.getScore());
            	
                
            }
            else { // else if player1Card and player2Card are equal
            	//incrementScore(); no scores will be incremented for either player as this would be a draw
            	//the following will print each players card value and suit
            	System.out.println("\nPlayer1 plays: ");
            	player1Card.describe();
            	System.out.println("\nPlayer2 plays: ");
            	player2Card.describe();
            	// the following will print the winner of the round and the current scores
            	System.out.println("\nWinner of round = A Draw ! \n\nRound " + i + " scores: \n\nPlayer1: ");
            	System.out.println(player1.getScore());
            	System.out.println("\nPlayer2: ");
            	System.out.println(player2.getScore());
            }
        }
        // compare the final score from each player and print the final score of each
        System.out.printf("\nPlayer1's final score = %d\n", player1.getScore());
        System.out.printf("\nPlayer2's final score = %d\n", player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println("\nPlayer1 is the winner!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("\nPlayer2 is the winner!");
        } else {
            System.out.println("\nThe final scores are equal! It's a Draw!");
        }


    }

}