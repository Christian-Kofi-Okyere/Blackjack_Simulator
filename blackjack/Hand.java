/*
 Name: Christian Okyere
 Date: 02/12/2023
 Section: B
 File: Hand.java
 Project: Monte-Carlo Simulation: Blackjack
 Course: CS231
 */


import java.util.ArrayList;

public class Hand {

    ArrayList<Card> myList;

    /**
     * Creates an empty hand as an ArrayList of Cards.  
     */
    public Hand(){
       myList = new ArrayList<Card>();
    }

    /**
     * Removes any cards currently in the hand. 
     */
    public void reset(){
        myList.clear();
    }

    /**
     * Adds the specified card to the hand.
     * @param card the card to be added to the hand
     */
    public void add(Card card){
        myList.add(card);
    }


    /**
     * Returns the number of cards in the hand.
     * @return the number of cards in the hand
     */
    public int size(){
        return myList.size();
    }

    /**
     * Returns the card in the hand specified by the given index. 
     * @param index the index of the card in the hand.
     * @return the card in the hand at the specified index.
     */
    public Card getCard(int index){
        return myList.get(index);
    }

    /**
     * Returns the summed value over all cards in the hand.
     * @return the summed value over all cards in the hand
     */
    public int getTotalValue(){

        int num = 0;
        for (Card i : myList){
            num += i.getValue();    
        }
        return num;
    }

    /**
     * Returns a string representation of the hand.
     * @return a string representation of the hand
     */
    public String toString(){
        String output = "[";

        for (int i = 0; i < myList.size() -1 ; i++){
            output += myList.get(i) + ", ";
        }
        if (myList.size() > 0){
            output += myList.get(myList.size() -1);
        }
        output += "] : "; 
        output += getTotalValue(); 
        return output; 
    }
}
