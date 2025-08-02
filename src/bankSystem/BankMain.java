import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter initial balance: ₹");
        double balance = sc.nextDouble();

        BankAccount user = new BankAccount(name, accNo, balance);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Info");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double d = sc.nextDouble();
                    user.deposit(d);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double w = sc.nextDouble();
                    user.withdraw(w);
                    break;
                case 3:
                    user.checkBalance();
                    break;
                case 4:
                    user.displayInfo();
                    break;
                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
