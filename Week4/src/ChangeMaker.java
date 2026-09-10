// Luke La
// September 9, 2026
// Lab 4
/// This program asks the user to enter an amount from 1 to 99 cents. It calculates and displays the number of quarters, dimes, nickels, and pennies needed to make that amount.

import java.util.Scanner;

public class ChangeMaker
{
    public static void main(String[] args)
    {
        int amount, originalAmount,
                quarters, dimes, nickels, pennies;

        System.out.println("Enter a whole number from 1 to 99.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");

        Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();

        originalAmount = amount;

        quarters = amount / 25;
        amount = amount % 25;

        dimes = amount / 10;
        amount = amount % 10;

        nickels = amount / 5;
        amount = amount % 5;

        pennies = amount;

        System.out.println(originalAmount
                + " cents in coins can be given as:");

        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");

        keyboard.close();
    }

    /*
     This program asks the user to enter an amount from 1 to 99 cents.
     It uses integer division to calculate the number of quarters,
     dimes, and nickels. The remainder operator (%) finds the amount
     left after each type of coin is calculated. Whatever remains at
     the end becomes the number of pennies. The program then displays
     the combination of coins.
    */
}