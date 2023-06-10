    /*
 Name: Christian Okyere
 File: Simulation.java
 Project: Monte-Carlo Simulation: Blackjack
 */

public class Extensions {

    public static void main(String[] args){

    
        for (int j = 0; j < 5; j++){
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

        }
        String output = "End of Game.\n" + "Player_Score:" + playerWins/10 + "\nDealer_Scores:" + dealerWins/10 + "\nDraws:" + draws/10;
        System.out.println(output);
    }
}
}
