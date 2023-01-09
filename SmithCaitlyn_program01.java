/* This program simulates the rolling of a user-specified number of die.
We're using an array to keep track of the number of rolls of each number.

Author: Caitlyn Smith
Email: c-smith54@hvcc.edu
Course: CISS 111-300 - Programming & Logic II
 */

import java.util.Scanner;
import java.util.Random;

public class SmithCaitlyn_program01 {
    public static void main(String[] args) {
        int numberOfRolls;
        int numberOfSides;
        int numberOfDie;

        Scanner scan = new Scanner(System.in);

        // Prompt the user for the number of rolls
        System.out.print("Enter the number of rolls: ");
        numberOfRolls = scan.nextInt();

        // Checking for incorrect input
        if (numberOfRolls < 1) {
            System.out.print("Please enter at least one roll: ");
            numberOfRolls = scan.nextInt();
        }

        // Prompt the user for the number of sides of the die
        System.out.print("Enter the number of sides of the die: ");
        numberOfSides = scan.nextInt();

        // Checking for incorrect input
        if ((numberOfSides < 4) || (numberOfSides > 20)) {
            System.out.print("Please enter between 4 and 20 sides: ");
            numberOfSides = scan.nextInt();
        }

        // Prompt the user for the number of die
        System.out.print("Enter the number of dice used: ");
        numberOfDie = scan.nextInt();

        // Checking for incorrect input
        if (numberOfDie < 1) {
            System.out.print("Please enter at least one die: ");
            numberOfDie = scan.nextInt();
        }

        // Time to roll the dice
        int maxSum = numberOfDie * numberOfRolls; // Size of the array
        int[] rollDice = new int[numberOfSides]; // Array to capture each roll
        Random roller = new Random(); // Random method

        System.out.println("-------------------------------------------");
        System.out.println("The result of " + maxSum + " dice rolls:");

        // Print out the number of times each sum was rolled
        // For loop to capture the accumulation of each roll
        for (int i = 0; i < rollDice.length; i++) {
            rollDice[i] = roller.nextInt(maxSum)+1;

            System.out.print("The sum ");
            System.out.println(i+1 + " is rolled " + rollDice[i] + " times");
        }
    }
}