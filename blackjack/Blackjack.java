/*
 Name: Christian Okyere
 Date: 02/12/2023
 Section: B
 File: Blackjack.java
 Project: Monte-Carlo Simulation: Blackjack
 Course: CS231
 */


public class Blackjack {

    public Deck myDeck = new Deck();
    public Hand playerHand = new Hand();
    public Hand dealerHand = new Hand();
    private int reshuffleCutoff;
    

    // this constructor stores the reshuffleCutoff and sets up a game
    public Blackjack(int reshuffleCutoff){
        this.reshuffleCutoff = reshuffleCutoff;
        this.reset();
    }

    // this constructor calls the first constructor with a given value
    public Blackjack(){
        this(25);
    }

    // resets the game
    public void reset(){
        this.playerHand.reset();
        this.dealerHand.reset();
    
        if (this.myDeck.size() < reshuffleCutoff){
            this.myDeck.build(); 
        }
    }

    //deals out two cards to both players from the deck
    public void deal(){
        myDeck.shuffle();
        for (int i =0; i < 2; i++){
            this.playerHand.add(myDeck.deal());
            this.dealerHand.add(myDeck.deal());
        }
    }

    // have the player draw cards until he goes above 16
    // returns false if player goes above 21
    public boolean playerTurn(){

        while (true){
            if (playerHand.getTotalValue() >= 16){
                break;
            } else{
                this.playerHand.add(myDeck.deal());
            }
        }
    
        if (playerHand.getTotalValue() > 21){
            return false;
        } else {
            return true;
        }
    }

    // have the dealer draw cards until he goes above 17
    // returns false if dealer goes above 21
    public boolean dealerTurn(){

        while (true){
            if (dealerHand.getTotalValue() >= 17){
                break;
            } else{
                this.dealerHand.add(myDeck.deal());
            }
        }
    
        if (dealerHand.getTotalValue() > 21){
            return false;
        } else {
            return true;
        }
    }

    // assigns the new cutoff value to the internal reshuffle cutoff field
    public void setreshuffleCutoff(int cutoff){
        this.reshuffleCutoff = cutoff;
    }

    // returns the current value of the reshuffle cutoff field
    public int getReshuffleCutoff(){
        return this.reshuffleCutoff;
    }

    // returns a string representation of the state of the game.
    public String toString(){
        String output = "Player Hand: " + playerHand +  ", PlayerHandTotal: " + playerHand.getTotalValue() + "\n";
        output += "Dealer Hand: " + dealerHand +  ", DealerHandTotal: " + dealerHand.getTotalValue();
        return output;
    }
    

    //
    public int game(boolean verbose){
        Blackjack gm = new Blackjack();
        gm.reset();
        gm.deal();
        
        Boolean player1 = gm.playerTurn();
        int res = 0;

        if (player1 == false){
            res = -1;
        } else {
            Boolean player2 = gm.dealerTurn();
         
            if (player2 == false){
                res = 1;
            } else {
                if (gm.playerHand.getTotalValue() > gm.dealerHand.getTotalValue()){
                res = 1;
                }
                else if (gm.playerHand.getTotalValue() < gm.dealerHand.getTotalValue()){
                res = -1;
                }
                else{
                res = 0;
                
                }

            }
        }

        if (verbose==true){
            System.out.println(gm);
        }
        return res;


    } 

    public static void main(String[] args){
        Blackjack blackjack = new Blackjack(26);
        
        for (int i = 0; i < 3; i++){
            int res = blackjack.game(true);
            if (res == 1){
                System.out.println("PLAYER WINS" + "\n");
            } else if (res == 0){
                System.out.println("IT'S A DRAW" + "\n");
            } else if (res == -1){
                System.out.println("DEALER WINS" + "\n");
            }
        }
    }


}
