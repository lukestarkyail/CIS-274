// Luke La
// Aug 26, 2026
// Lab 2
// This program ask user a whole number and show that number on dialog window

import javax.swing.JOptionPane;

public class DialogBox
{
  public static void main(String[] args)
  {

    String input = JOptionPane.showInputDialog(
            "Enter a whole number:"
    );

    int number = Integer.parseInt(input);

    // Display the number entered
    JOptionPane.showMessageDialog(
            null,
            "You entered: " + number
    );

    System.exit(0);
  }
}