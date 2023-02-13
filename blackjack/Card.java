/*
 Name: Christian Okyere
 Date: 02/12/2023
 Section: B
 File: Card.java
 Project: Monte-Carlo Simulation: Blackjack
 Course: CS231
 */

public class Card {

    /**
     * The value of the card.
     */
    private int value;


    /**
     * Constructs a card with the specified value.
     * @param val
     */
    public Card(int val) {
        this.value = val;
        if(val < 0){
            System.out.println("The card value is outside the range");
            System.exit(1);
        }
        // TBD
    }


    /**
     * Returns the value of the card.
     * @return the value of the card
     */
    public int getValue() {
        return this.value;
    }
    

    /**
     * Returns a string representation of this card.
     * @return a string representation of this card
     */
    public String toString() {
        String output = "";
        output += this.value;
        output += "";
        return output;
    }
    
    // //
    // public static void main(String[] args){
    //     Card num = new Card(6);
    //     System.out.println(num);
    // }
}