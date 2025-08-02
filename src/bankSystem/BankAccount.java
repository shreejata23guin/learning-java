

public class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String n, int accNo, double initialBalance) {
        name = n;
        accountNumber = accNo;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void displayInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}
