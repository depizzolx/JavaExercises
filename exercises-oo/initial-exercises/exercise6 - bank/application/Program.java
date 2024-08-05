package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you wanna open a new account in our Bank? Answer 'Yes' or 'No'");
        String answerAccount = sc.nextLine();

        if (answerAccount.equalsIgnoreCase("Yes")) {
            System.out.println("Great! Let's proceed with opening a new account.");

            BankAccount bankAccount = new BankAccount();

            System.out.println("Please, tell us your name: ");
            bankAccount.setOwnerName(sc.nextLine());

            System.out.println("Hello, " + bankAccount.getOwnerName() + "! Your account number is: " + bankAccount.getCountNumber());

            System.out.println("How much money do you wanna put in your account?");
            double initialMoney = sc.nextDouble();
            bankAccount.deposit(initialMoney);

            System.out.println(bankAccount.getOwnerName() + ", the balance available in your account is: " + bankAccount.getBalance());

            // Consumir o newline residual
            sc.nextLine();

            System.out.println("Now, do you want to make a deposit or a withdraw?");
            String answerMoney = sc.nextLine();

            if (answerMoney.equalsIgnoreCase("Deposit")) {
                System.out.println("Tell us the amount of the deposit: ");
                double depositAmount = sc.nextDouble();
                bankAccount.deposit(depositAmount);

                System.out.println("The balance available now is: " + bankAccount.getBalance());
            } else if (answerMoney.equalsIgnoreCase("Withdraw")) {
                System.out.println("Tell us the amount of the withdraw: ");
                double withdrawAmount = sc.nextDouble();
                if (bankAccount.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Insufficient funds.");
                }

                System.out.println("The balance available now is: " + bankAccount.getBalance());
            } else {
                System.out.println("Invalid operation. Please choose 'Deposit' or 'Withdraw'.");
            }

        } else if (answerAccount.equalsIgnoreCase("No")) {
            System.out.println("Thank you for your time. Have a great day!");
        } else {
            System.out.println("Invalid response. Please answer 'Yes' or 'No'.");
        }

        sc.close();
    }
}
