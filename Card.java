package warFinal;

public class Card {
	
    private int value; // contains a value from 2-14 representing cards 2-Ace
    private String name; // examples = Ace of Diamonds, Two of Hearts
    
    public Card(int cardValue, String suit) { // Card constructor that calls for a cardValue and suit when the Deck constructor is instantiated

        value = cardValue;

        switch(cardValue) { // switch statement created to assign String values to the card values
            case 2: name = "Two";
                break;
            case 3: name = "Three";
                break;
            case 4: name = "Four";
                break;
            case 5: name = "Five";
                break;
            case 6: name = "Six";
                break;
            case 7: name = "Seven";
                break;
            case 8: name = "Eight";
                break;
            case 9: name = "Nine";
                break;
            case 10: name = "Ten";
                break;
            case 11: name = "Jack";
                break;
            case 12: name = "Queen";
                break;
            case 13: name = "King";
                break;
            case 14: name = "Ace";
                break;
        }

        name += " of " + suit; // the name of the card is continued by concatenating "of suit" to it

    }

    public int getValue() { // method to get the value of a card
        return value;
    }

    public void setValue(int value) { // method to set the value of a card
        this.value = value;
    }

    public String getName() { // method to get the name of a card
        return name;
    }

    public void setName(String name) { // method to set the name of a card
        this.name = name;
        
    }
    
    public void describe() { //prints out information about a card
        System.out.printf(name + "\n");
    }

    
}