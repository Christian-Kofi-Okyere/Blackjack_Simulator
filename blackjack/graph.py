"""
 Name: Christian Okyere
 File: graph.py
 Project: Monte-Carlo Simulation: Blackjack
"""

import numpy as np
import matplotlib.pyplot as plt

X = ["1", "2", "3", "4", "5"]
Player = [39, 40, 40, 38, 38]
Dealer = [54, 55, 54, 56, 56]
Draw = [5, 4, 5, 5, 5]

length = np.arange(len(X))
plt.figure(figsize = (6, 3))

plt.bar(length - 0.25, Player, 0.25, label = "Player")
plt.bar(length, Dealer, 0.25, label = "Dealer")
plt.bar(length + 0.25, Draw, 0.25, label = "Draw")

plt.xticks(length, X)
plt.xlabel("Simulation Number")
plt.ylabel("Win Percentage")
plt.title("Win Percentage during simulation")
plt.legend()
plt.show()

