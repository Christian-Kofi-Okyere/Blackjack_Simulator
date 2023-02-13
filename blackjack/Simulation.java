/*
 Name: Christian Okyere
 Date: 02/12/2023
 Section: B
 File: Simulation.java
 Project: Monte-Carlo Simulation: Blackjack
 Course: CS231
 */

public class Simulation {
    public static void main(String[] args){

        Blackjack myGame = new Blackjack();
        int playerWins = 0;
        int dealerWins = 0;
        int draws = 0;
        int round = 0;
        
        for (int i = 0; i < 1000; i++){
            int roundOutcome = myGame.game(true);

            if (roundOutcome == 1){
                playerWins += 1;
            }else if (roundOutcome == -1){
                dealerWins += 1;
            }else if (roundOutcome == 0){
                draws += 1;
            }
            round += 1;

            // String output = "Round_Number:" + round + ", Player_Score:" + playerWins + ", Dealer_Score:" + dealerWins + ", Draws: " + draws; 
            // System.out.println(output);
        }
        String output = "End of Game.\n" + "Player_Score:" + playerWins + " Percentage: " + playerWins/10 + "%" + "\nDealer_Scores:" + dealerWins + " Percentage: " + dealerWins/10 + "%" + "\nDraws:" + draws + " Percentage: " + draws/10 + "%";
        System.out.println(output);
    }
}
