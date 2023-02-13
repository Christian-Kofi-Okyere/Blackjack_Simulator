/*
 Name: Christian Okyere
 Date: 02/12/2023
 Section: B
 File: Deck.java
 Project: Monte-Carlo Simulation: Blackjack
 Course: CS231
 */


import java.util.ArrayList;
import java.util.Random;
// import java.util.Collections;

public class Deck {

    ArrayList<Card> underlyingDeck;
    private Random ran = new Random();

    /**
     * Creates the underlying deck as an ArrayList of Card objects. 
     * Calls build() as a subroutine to build the deck itself.
     */
    public Deck() {

        // creates a new empty deck 
        underlyingDeck = new ArrayList<>();
        this.build();
    }

    /**
     * Builds the underlying deck as a standard 52 card deck. 
     * Replaces any current deck stored. 
     */
    public void build() {

        underlyingDeck.clear();

        // builds 4 cards with value 11 and adds to the deck
        for (int i = 0; i < 4; i++){
            Card cardObject = new Card(11);
            underlyingDeck.add(cardObject);
        }

        // builds 16 cards with value 10 and adds to the deck
        for (int i = 0; i < 16; i++){
            Card cardObject = new Card(10);
            underlyingDeck.add(cardObject);
        }

        // builds 4 cards of each of cards ranging from 2-9 inclusive
        // and adds to the deck
        for (int i = 2; i < 10; i++){
            for (int j = 0; j < 4; j++){
                Card cardObject = new Card(i);
                underlyingDeck.add(cardObject);
            }
        }

    }

    /**
     * Returns the number of cards left in the deck. 
     * @return the number of cards left in the deck
     */
    public int size() {

        // returns the underlyingDeck size
        return underlyingDeck.size();
    }

    /**
     * Returns and removes the first card of the deck.
     * @return the first card of the deck
     */
    public Card deal() {

        // gets the first index in the deck
        // removes that first index card
        // and returns the value in the first index

        Card firstCard = underlyingDeck.get(0);
        underlyingDeck.remove(firstCard);
        return firstCard;    
    }

    //swaps the card in index1 and index2
    //returns the resulting deck
    // Fisher- Yates Algorithm
    public ArrayList<Card> swap(int index1, int index2){
        Card card1 = this.underlyingDeck.get(index1);
        Card card2 = this.underlyingDeck.get(index2);
        this.underlyingDeck.set(index2, card1);
        this.underlyingDeck.set(index1, card2);
        return underlyingDeck;
    }

    /**
     * Shuffles the cards currently in the deck. 
     */
    public void shuffle() {
        int curr_index = this.underlyingDeck.size();
        for (int i = 0; i < curr_index; i++){
            int index1 = ran.nextInt(curr_index);
            this.swap(index1, curr_index-1);
            curr_index -= 1;
        }

    }

    /**
     * Returns a string representation of the deck.
     * @return a string representation of the deck
     */
    public String toString() {
        String output = "";
        output += this.underlyingDeck;
        output += "";
        return output;
    }
}
