# Problem Statement

In the game of craps, a passline bet proceeds as follows. Two six-sided dice are rolled; the first roll of the dice in a craps round is called the “come out roll.” 

* A come out roll of 7 or 11 automatically wins, with double winnings.
* A come out roll of 2, 3, or 12 automatically loses.
* If 4, 5, 6, 8, 9, or 10 is rolled on the come out roll, that number becomes “the point.”

The player keeps rolling the dice until either 7 or the point is rolled. If the point is rolled first, then the player wins the bet with even money. If a 7 is rolled first, then the player loses.

Write a program that simulates a game of craps using these rules.

* The player starts out with a given amount of money.
* The program asks the player for a wager, and then calculates whether the player would win or lose.
* The program should simulate rolling the two dice and calculate the sum.
* Add a loop so that the program keeps playing until either (1) the player decides to quit and "cash in", or (2) the player runs out of money.
* Add counters that count how many times the player wins, and how many times the player loses.

At the end of the game, compute the probability of winning [ i.e., Wins / (Wins + Losses)] and output this value to the user as well.

### Notes

Your program must implement and use calls to the following methods:

* static int rollDice()

Simulates rolling a pair of dice; returns an integer in the range {2, ..., 12}
 

* static boolean rollWithPoint(int point)

Simulates rolling the dice until either the player wins (true is returned) or loses (false is returned)


### Sample Output (and user input shown in red)

Welcome to the game of Craps

The house has given you a starting balance of $500
On each round, you make a (whole number) wager.
The minimum wager is $10, and the maximum wager is your remaining balance.

You make keep playing until you decide to cash in, or
you can't cover the minimum wager.
Good Luck!

Your balance is $500

Place your bet: $100

Your roll: d1: last roll: 2; d2: last roll: 3; roll value = 5

Your point value is 5
Your roll: d1: last roll: 1; d2: last roll: 4; roll value = 5

A winner!

Your current balance: $600

Keep playing (y/Y or n/N)? y

Your balance is $600

Place your bet: $100

Your roll: d1: last roll: 1; d2: last roll: 6; roll value = 7

A winner!

Your current balance: $800

Keep playing (y/Y or n/N)? y

Your balance is $800

Place your bet: $100

Your roll: d1: last roll: 1; d2: last roll: 2; roll value = 3

Oh, I'm sorry, you lost.

Your current balance: $700

Keep playing (y/Y or n/N)? y

Your balance is $700

Place your bet: $100

Your roll: d1: last roll: 3; d2: last roll: 4; roll value = 7

A winner!

Your current balance: $900

Keep playing (y/Y or n/N)? y

Your balance is $900

Place your bet: $100

Your roll: d1: last roll: 3; d2: last roll: 6; roll value = 9

Your point value is 9

Your roll: d1: last roll: 4; d2: last roll: 5; roll value = 9

A winner!

Your current balance: $1000

Keep playing (y/Y or n/N)? y

Your balance is $1000

Place your bet: $100

Your roll: d1: last roll: 4; d2: last roll: 6; roll value = 10

Your point value is 10
Your roll: d1: last roll: 1; d2: last roll: 4; roll value = 5

Your roll: d1: last roll: 5; d2: last roll: 3; roll value = 8

Your roll: d1: last roll: 1; d2: last roll: 1; roll value = 2

Your roll: d1: last roll: 4; d2: last roll: 1; roll value = 5

Your roll: d1: last roll: 5; d2: last roll: 6; roll value = 11

Your roll: d1: last roll: 1; d2: last roll: 3; roll value = 4

Your roll: d1: last roll: 5; d2: last roll: 4; roll value = 9

Your roll: d1: last roll: 1; d2: last roll: 2; roll value = 3

Your roll: d1: last roll: 6; d2: last roll: 3; roll value = 9

Your roll: d1: last roll: 6; d2: last roll: 3; roll value = 9

Your roll: d1: last roll: 2; d2: last roll: 4; roll value = 6

Your roll: d1: last roll: 4; d2: last roll: 5; roll value = 9

Your roll: d1: last roll: 4; d2: last roll: 5; roll value = 9

Your roll: d1: last roll: 5; d2: last roll: 2; roll value = 7

Oh, I'm sorry, you lost.

Your current balance: $900

Keep playing (y/Y or n/N)? y

Your balance is $900

Place your bet: $100

Your roll: d1: last roll: 4; d2: last roll: 6; roll value = 10

Your point value is 10

Your roll: d1: last roll: 6; d2: last roll: 2; roll value = 8

Your roll: d1: last roll: 2; d2: last roll: 2; roll value = 4

Your roll: d1: last roll: 3; d2: last roll: 1; roll value = 4

Your roll: d1: last roll: 4; d2: last roll: 6; roll value = 10

A winner!

Your current balance: $1000

Keep playing (y/Y or n/N)? y

Your balance is $1000

Place your bet: $500

Your roll: d1: last roll: 6; d2: last roll: 4; roll value = 10

Your point value is 10

Your roll: d1: last roll: 6; d2: last roll: 1; roll value = 7

Oh, I'm sorry, you lost.

Your current balance: $500

Keep playing (y/Y or n/N)? y

Your balance is $500

Place your bet: $100

Your roll: d1: last roll: 3; d2: last roll: 5; roll value = 8

Your point value is 8

Your roll: d1: last roll: 1; d2: last roll: 1; roll value = 2

Your roll: d1: last roll: 1; d2: last roll: 6; roll value = 7

Oh, I'm sorry, you lost.

Your current balance: $400

Keep playing (y/Y or n/N)? y

Your balance is $400

Place your bet: $100

Your roll: d1: last roll: 3; d2: last roll: 2; roll value = 5

Your point value is 5

Your roll: d1: last roll: 2; d2: last roll: 6; roll value = 8

Your roll: d1: last roll: 3; d2: last roll: 3; roll value = 6

Your roll: d1: last roll: 1; d2: last roll: 1; roll value = 2

Your roll: d1: last roll: 5; d2: last roll: 3; roll value = 8

Your roll: d1: last roll: 6; d2: last roll: 4; roll value = 10

Your roll: d1: last roll: 5; d2: last roll: 5; roll value = 10

Your roll: d1: last roll: 4; d2: last roll: 4; roll value = 8

Your roll: d1: last roll: 4; d2: last roll: 6; roll value = 10

Your roll: d1: last roll: 1; d2: last roll: 1; roll value = 2

Your roll: d1: last roll: 3; d2: last roll: 2; roll value = 5

A winner!

Your current balance: $500

Keep playing (y/Y or n/N)? y

Your balance is $500

Place your bet: $0

I'm sorry, that's not a valid wager; please re-enter: $600

I'm sorry, that's not a valid wager; please re-enter: $500

Your roll: d1: last roll: 4; d2: last roll: 5; roll value = 9

Your point value is 9

Your roll: d1: last roll: 3; d2: last roll: 4; roll value = 7

Oh, I'm sorry, you lost.

Your current balance: $0

Based on your play, the probability of winning is 54%

Seems you lost your shirt; better luck next time.

Have a nice day! Hope to see you soon!
