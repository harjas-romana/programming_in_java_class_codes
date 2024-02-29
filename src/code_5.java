import java.util.Scanner;

class BankAccount {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static long accNumber;
    static String accType;
    static float accBalance;

    public BankAccount() {
        name = "Harjas Partap Singh Romana";
        accNumber = 32498243;
        accType = "Savings";
        accBalance = 500;
    }

    public static void setParameters() {
        System.out.print("Please enter your name: ");
        name = sc.next();
        System.out.print("Hello " + name + ". Please enter your Bank Account Number: ");
        accNumber = sc.nextLong();
        System.out.print("What is your account type? Savings or Credit: ");
        accType = sc.next();
        System.out.print("Enter the current balance: ");
        accBalance = sc.nextFloat();
        System.out.println("Parameters setting was successful.");
    }

    public static void depositAmount(int deposit) {
        System.out.println("Deposit of " + deposit + " was successful.");
        accBalance = accBalance + (float)deposit;
        System.out.println("Available balance is: " + accBalance);
    }

    public static void withdrawAmount(int withdraw) {
        System.out.println("Withdrawal of " + withdraw + " was successful.");
        accBalance = accBalance - (float)withdraw;
        System.out.println("Available balance is: " + accBalance);
    }
}

public class code_5 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println("Default Parameters: ");
        System.out.println("Name: " + BankAccount.name);
        System.out.println("Account Number: " + BankAccount.accNumber);
        System.out.println("Account Type: " + BankAccount.accType);
        System.out.println("Account Balance: " + BankAccount.accBalance);

        BankAccount.setParameters();

        System.out.println("Updated Parameters: ");
        System.out.println("Name: " + BankAccount.name);
        System.out.println("Account Number: " + BankAccount.accNumber);
        System.out.println("Account Type: " + BankAccount.accType);
        System.out.println("Account Balance: " + BankAccount.accBalance);

        BankAccount.depositAmount(200);
        BankAccount.withdrawAmount(100);
    }
}
