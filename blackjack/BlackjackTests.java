/*
 Name: Christian Okyere
 Date: 02/12/2023
 Section: B
 File: Blackjack.java
 Project: Monte-Carlo Simulation: Blackjack
 Course: CS231
 */


public class BlackjackTests {

    public static void blackjackTests() {

        // case 1: testing Blackjack() and Blackjack(i)
        {
            // set up
            Blackjack bj1 = new Blackjack();
            Blackjack bj2 = new Blackjack(5);

            // verify
            System.out.println(bj1.getReshuffleCutoff() + " == 25");
            System.out.println(bj2.getReshuffleCutoff() + " == 5");

            // test
            assert bj1 != null : "Error in Blackjack::Blackjack()";
            assert bj2 != null : "Error in Blackjack::Blackjack()";
        }

        // case 2: testing setReshuffleCutOff() and getReshuffleCutOff(i)
        {
            // set up
            Blackjack bj1 = new Blackjack();
            bj1.setreshuffleCutoff(10);

            // verify
            System.out.println(bj1.getReshuffleCutoff() + " == 10");
            
            // test
            assert bj1 != null : "Error in Blackjack::Blackjack()";
        }

        // case 3: testing reset()
        {
            // set up
            Blackjack bj1 = new Blackjack();
            bj1.deal();

            // verify
            System.out.println(bj1.dealerHand + " > 0");
            System.out.println(bj1.playerHand + " > 0");
            System.out.println(bj1.myDeck.size() + " == 48");
            // test
            assert bj1 != null : "Error in Blackjack::Blackjack()";
        }

        System.out.println("* Done testing Blackjack! *\n");
    }

    public static void main(String[] args) {

        blackjackTests();
    }
}