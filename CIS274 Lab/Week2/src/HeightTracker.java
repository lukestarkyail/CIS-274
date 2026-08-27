// Luke La
// Aug 26, 2026
// Lab 2
// This program calculate the child's growth

import java.util.Scanner;

public class HeightTracker
{
    public static void main(String[] args)
    {
        Scanner height = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How tall the child is today?");
        int todayHeight = height.nextInt();
        System.out.println("The child is " + todayHeight + " inches");

        Scanner previousHeight = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How tall the child was yesterday?");
        int yesterdayHeight = previousHeight.nextInt();
        int growth = todayHeight - yesterdayHeight;
        System.out.println("The child is " + growth + " inches taller");

    }
}