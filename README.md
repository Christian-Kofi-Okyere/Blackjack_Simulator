# Blackjack Simulator

This project is a simulation of the blackjack game, also known as 21. In this project, I made a simple code that simulates the Blackjack game. This is a game of cards usually played between multiple people, but this project limits it to just two players: the player and the house. 

To make this game, I created some various class files: Card Class, Hand Class, Deck Class, Blackjack Class and Simulation Class. 

Card Class: Consists of just the numeric value one can insert as a card. It takes an integer
value and restricts the use of a value like “0”.
Hand Class: An Arraylist created by using the java.util import. This class consists of a hand method(used to generate the hands of the player and dealer).
Hand Class: Consists of methods that can add a card to the hand, generate the size of a player's hand(number of cards in the player’s hand), get a card from the hand, and get
the total value in the hand.
Deck Class: Contains methods that can build the deck, generate the size of a deck, shuffle the deck and deal the cards
Blackjack Class: Contains a constructor that sets up the game, a method that can reset the game, a method that allows players to deal in turns, and a reshuffleCutOff method that assigns a cutoff.

A combination of these methods were used to make the actual game in the simulation class. This file contains the main method that executes a specified number of Blackjack games. The rules of the games were simple: The player and the house receive two cards each to begin with. Ace is worth 11 points, and other numeric cards have their usual values, and King, Queen and Joker cards also have values of 10 each. With the rules of the game, I generated a simulation to analyze how the likelihood of winning is affected by increasing the number of games.

This project helps to understand the concept of object-oriented programming, multiple methods (static and non-static), variables, loops and dynamic arrays in java.

##Installation

To use this blackjack simulator, simply clone this repository to your local machine:
git clone https://github.com/Christian-Kofi-Okyere/Data-Structures-and-Algorithms-Projects

## Usage

To run the blackjack simulator, simply execute the Simulation class:
cd blackjack-simulator
javac Simulation.java
java Simulation
This runs a simulation of the game and generates the results in the command prompt.

## Contributing

Contributions to this project are welcome. To contribute, simply fork this repository, make your changes, and submit a pull request.
