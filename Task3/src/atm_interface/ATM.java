/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_interface;

import java.util.Scanner;

/**
 *
 * @author anvek
 */
public class ATM {
    private BankAccount acc;
    private Scanner sc;

    public ATM(BankAccount acc, Scanner sc) {
        this.acc = acc;
        this.sc = sc;
    }

    public void displayMenu() {
        int choice;
        double amount;

        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    acc.withdraw(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    acc.deposit(amount);
                    break;
                case 3:
                    System.out.println("Current balance: " + acc.checkBalance());
                    break;
                case 4:
                    System.out.println("Exiting ATM. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
