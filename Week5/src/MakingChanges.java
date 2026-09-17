// Luke La
// September 16, 2026
// Lab 5
// This program asks the user to enter an item price from 35 to 100 cents in 5-cent increments. It calculates the change from one dollar and displays the number of quarters, dimes, nickels, and pennies returned.

import java.util.Scanner;

public class MakingChanges
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int  amount = 100;
        int costOfItem, changesReturn, quarters, dimes, nickels, pennies;

        System.out.print("Enter price of item (from 35 cents to a dollar, in 5-cent increments): ");
        costOfItem = input.nextInt();

        if (costOfItem < 35)
        {
            System.out.println("The Cost of Item must be greater than $35");

        }
        else if (costOfItem > 100)
        {
            System.out.println("The Cost of Item must be below 100 cents");
        }
        else if (costOfItem % 5 != 0)
        {
            System.out.println("The Cost of Item must be multiple of 5");
        }
        else
        {
            changesReturn = amount - costOfItem;

            quarters = changesReturn / 25;
            changesReturn = changesReturn % 25;

            dimes = changesReturn / 10;
            changesReturn = changesReturn % 10;

            nickels = changesReturn / 5;
            changesReturn = changesReturn % 5;

            pennies = changesReturn;

            System.out.println("You bought an item for " + costOfItem + " cents and gave me a dollar,");
            System.out.println("so your change is ");
            System.out.println(quarters + " quarters");
            System.out.println(dimes + " dimes");
            System.out.println(nickels + " nickels");
            System.out.println(pennies + " pennies");
        }
    }
}