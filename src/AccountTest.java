import java.util.Scanner;

public class AccountTest {
    /**
     */
    public static void main(String[] args) {
        Account initializeConstructor = new Account();
        System.out.println(initializeConstructor.getName());
        Account account1 = new Account("Aniefiok Akpan",100.00);
        Account account2 = new Account("Joanna Ebreso",-100.00);
        System.out.printf("%s Balance: $%.2f%n",account1.getName(), account1.getAccountBalance());
        System.out.printf("%s Balance: $%.2f%n",account2.getName(), account2.getAccountBalance());

        // Deposit amount for account one:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmountAccount1 = input.nextDouble();

        System.out.printf("%nadding $%.2f to account balance %n%n", depositAmountAccount1);
        account1.deposit(depositAmountAccount1);

        // Display account balance 
        System.out.printf("%s Balance: $%.2f %n",account1.getName(), account1.getAccountBalance());
        System.out.printf("%s Balance: $%.2f %n",account2.getName(), account2.getAccountBalance());

        // Withdraw amount for account 1:
        System.out.print("Enter the amount you would like to withdraw from your account: ");
        double withdrawMoneyAccount1 = input.nextDouble();
        account1.withdraw(withdrawMoneyAccount1);

        // Display balance
        System.out.printf("%s Balance: $%.2f %n",account1.getName(), account1.getAccountBalance());


        // Deposit amount for account 2:
        System.out.print("Enter deposit amount for account2: ");
        double depositAmountAccount2 = input.nextDouble();

        System.out.printf("%nadding $%.2f to account balance %n%n", depositAmountAccount2);
        account2.deposit(depositAmountAccount2);


        // Display account balance 
        System.out.printf("%s Balance: $%.2f %n",account1.getName(), account1.getAccountBalance());
        System.out.printf("%s Balance: $%.2f %n",account2.getName(), account2.getAccountBalance());
        
        // Withdraw amount for account 2:
        System.out.print("Enter the amount you would like to withdraw: ");
        double withdrawMoneyAccount2 = input.nextDouble();
        account2.withdraw(withdrawMoneyAccount2);
        
        // Display balance
        System.out.printf("%s Balance: $%.2f %n",account2.getName(), account2.getAccountBalance());

        input.close();

    }
}