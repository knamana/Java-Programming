package gameofcraps;
import java.util.Scanner;
/**
 *
 * @author kavyanamana
 */
public class Gameofcraps {
    /**
     * Takes random number between 1 and 6 from 2 dices
     * Assigns the summation of those two dices to rollDice
     * @return rollDice - an integer which represents summation of two dice values
     */
    public static int rollDice() {
        // As Math.random() returns double value
        // Using type conversion to convert the double values into int
        // (int) (Math.random() * (higherValue - lowerValue)) + lowerValue;
        int rollDice1 = (int) (Math.random() * (6 - 1)) + 1; 
        int rollDice2 = (int) (Math.random() * (6 - 1)) + 1;
        int rollDice = (int)(rollDice1 + rollDice2);
        System.out.println("Your roll: d1: last roll: " + rollDice1 + "; d2: last roll: " + rollDice2 + "; roll value = " + rollDice);
        return rollDice;
    } // end of rollDice method
    
   
    /**
     * Compares the point value with itself and number 7
     * To determine whether its a winner or not
     * @param point - integer value which is of any value from these numbers (4, 5, 6, 8, 9, or 10) 
     * @return result - which returns a boolean value true if its a winner and false if not a winner
     */
    public static boolean rollWithPoint(int point) {
        boolean result;
        int newComeOutRoll;
        while(true) {
            newComeOutRoll = rollDice();
            if (newComeOutRoll == point) {
               System.out.println("A winner!");
               result = true;
               break;
            }
            if (newComeOutRoll == 7) {
               System.out.println("Oh, I'm sorry, you lost.");
               result = false;
               break;
            }
        } // end of while
        return result;
    } // end of rollWithPoint method
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Welcoming message
        System.out.println("Welcome to the game of Craps\n");
        System.out.println("The house has given you a starting balance of $500\n" +
            "On each round, you make a (whole number) wager.\n" +
            "The minimum wager is $10, and the maximum wager is your remaining balance.\n" +
            "\n" +
            "You make keep playing until you decide to cash in, or\n" +
            "you can't cover the minimum wager.\n" +
            "Good Luck!\n" +
            "\n" +
            "Your balance is $500");
        
        // Declaring and Initializing variables
        int currentBal = 500;
        int wins = 0;
        int loses = 0;
        char stillInPlay;
        int comeOutRoll = 0;
        int betAmount;
        int pointValue;
        
        // Iterates until player wants to quit or player runs out of money
        do {
            System.out.print("Place your bet: $");
            betAmount = sc.nextInt();
            
            // if user enters an invalid range asking them to check
            // and re-enter the amount
            while (betAmount <= 10 || betAmount > currentBal) {
                System.out.print("I'm sorry, that's not a valid wager; please re-enter: ");
                betAmount = sc.nextInt();
            }
            
            comeOutRoll = rollDice(); // calls rollDice() method to get summation of dices
           
            if (comeOutRoll == 7 || comeOutRoll == 11) {
               System.out.println("\nA winner!");
               currentBal += 2 * betAmount;
               wins += 1;
            }
            
            if (comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12) {
                System.out.println("\nOh, I'm sorry, you lost.");
                currentBal -= betAmount;
                loses += 1;
            }
            
            if (comeOutRoll == 4 || comeOutRoll == 5 || comeOutRoll == 6 || comeOutRoll == 8 || comeOutRoll == 9 || comeOutRoll == 10) {
                pointValue = comeOutRoll;
                System.out.println("\nYour point value is: " + pointValue);
                
                boolean result = rollWithPoint(pointValue);
                
                // Based on the result incrementing/decrementing currentBalance, wins and loses
                // currentBalance for the next play
                // wins and loses to determine probability of winning in the game
                if (result) {
                    currentBal += betAmount;
                    wins += 1;
                } else {
                    currentBal -= betAmount;
                    loses += 1;
                }
            }

            System.out.println("\nYour current balance is: " + currentBal);
            
            // Iterating a loop if someone enters an incorrect input (Other than y, Y, n, N)
            do {
                System.out.println("\nKeep playing (y/Y or n/N)?");
                stillInPlay = sc.next().charAt(0);
            } while (Character.isDigit(stillInPlay));
            
            System.out.println("\nYour balance is: " + currentBal);
        } while((stillInPlay == 'y' || stillInPlay == 'Y') && (currentBal >= 10)); // it only iterates when user balance is greater than 10 and user input is y or Y
        
        int probability = ((wins * 100)/ (wins + loses));
        
        System.out.println("Based on your play, the probability of winning is " + probability + "%" +
            "\n" +
            "Seems you lost your shirt; better luck next time.\n" +
            "Have a nice day! Hope to see you soon!");
        
    } // end of main
} // end of class
