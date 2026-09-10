// Luke La
// September 2, 2026
// Lab 3
// This program asks user if they want a ham sandwich with yes or no option and print a respond based on user's choice

import javax.swing.*;

public class SandwichShop
{
    public static void main(String[] args)
    {
        int answer;

        answer = JOptionPane.showConfirmDialog(
                null,
                "Would you like a ham sandwich?",
                "sandwich shop",
                JOptionPane.YES_NO_OPTION
        );

        if (answer == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(
                    null,
                    "Great! We have Ham sandwiches."
            );
        }

        if (answer == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(
                    null,
                    "Alright! maybe another sandwich instead."
            );
        }
        System.exit(0);
    }
}