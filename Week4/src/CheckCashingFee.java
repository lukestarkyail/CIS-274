// Luke La
// September 9, 2026
// Lab 4
// This program asks the user for the value of a check. It calculates the service charge based on the check amount and subtracts the charge from the check. It then prints a receipt showing the check amount, service charge, and the amount returned to the customer.

import java.util.Scanner;

public class CheckCashingFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double checkAmount;
        double serviceCharge;
        double amountReturned;

        System.out.print("What is the value of the check? $");
        checkAmount = input.nextDouble();

        if (checkAmount <= 0) {
            System.out.println("The check amount must be greater than $0.");
        } else {
            if (checkAmount <= 10) {
                serviceCharge = 1.00;
            } else if (checkAmount <= 100) {
                serviceCharge = checkAmount * 0.10;
            } else if (checkAmount <= 1000) {
                serviceCharge = 5.00 + checkAmount * 0.05;
            } else {
                serviceCharge = 40.00 + checkAmount * 0.01;
            }

            amountReturned = checkAmount - serviceCharge;

            System.out.println("\nReceipt:");
            System.out.printf("Amount of check:        $%8.2f%n", checkAmount);
            System.out.printf("Service charge:         $%8.2f%n", serviceCharge);
            System.out.printf("Amount returned to you: $%8.2f%n", amountReturned);
        }

        input.close();
    }
}