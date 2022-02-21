# Nim-Game-Variant-using-HashMap-
Here, I created a Nim variant telling who would win in a 2-player game using a HashMap.

Nim is a two-player strategy game in which players take turns removing certain amounts of objects from a stack of them. The winner of the game is the one who removes the last object. Several variations of the game exist, in which players can take different amounts of objects from the piles.

In this variant, players can take 1, 2, or 3 objects from a single stack (with the winner being the person who takes the last object). This program takes an input of n, the total number of objects. Assuming that both players play optimally, it returns whether the player who played first would win or not (true if the first player can win, false if they cannot). To write this code, I wrote base cases of 1, 2, and 3 objects being win scenarios, and created a HashMap with Integer and Boolean data values to show if the first player would win for each amount of objects (true if they would, false otherwise). I used a recursive function to fill in the HashMap, up until n possible objects.
