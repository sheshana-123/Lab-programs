package sample;
import java.util.Scanner;
public class BankingApplication {
    private double balance;
    public BankingApplication() {
        balance = 0.0;
    }
        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else
        {
            System.out.println("Invalid amount.");
        }
    }
             public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient amount.");
        }
    }

            public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        BankingApplication bank = new BankingApplication();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Bank Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4.exit");
               System.out.print("Please choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Bank Application.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}          
    
          

