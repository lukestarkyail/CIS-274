// Jim Hoffman
// Aug. 21, 2021
// Lab 1, Demonstration lab
// This program deals with eggs and baskets.
public class EggBasket  // This is a sample comment.
{
    public static void main (String[] args)
    {
        int numberOfBaskets, eggsPerBasket, totalEggs;

        numberOfBaskets = 10;
        eggsPerBasket = 6;

        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.print ("If you have");
        System.out.println (eggsPerBasket + " eggs per basket and ");
        System.out.println (numberOfBaskets + " baskets, then ");
        System.out.println ("the total number of eggs is " + totalEggs);
    }
}


