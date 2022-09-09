package Bank;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class BankAccount {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    String CreateDate = dtf.format(now);
    String HolderName, HolderNumber;
    static int CountOfAccount;
    double balance;

    public BankAccount() {
    }

    public BankAccount(String newHolderName, double newBalance) {
        CountOfAccount++;
        setHolderName(newHolderName);
        setBalance(newBalance);
    }

    private double setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Negative Values cannot be entered.");
        }
        return balance;
    }

    private String setHolderName(String newHolderName) {
        HolderName = newHolderName;
        return HolderName;
    }

    private String setHolderNumber() {
        HolderNumber = String.format("%4s", CountOfAccount).replace(" ", "0");
        return HolderNumber;
    }

    public String getHolderNumber() {
        return HolderNumber;
    }

    public String getCreatedDate() {
        return CreateDate;
    }

    public double setWithdraw(double withdraw, String newHolderNumber) {
        balance = balance - withdraw;
        HolderNumber = newHolderNumber;
        return balance;
    }

    public void setDeposit(double deposit, String newHolderNumber) {
        balance = balance + deposit;
        HolderNumber = newHolderNumber;
    }

    public void DisplayCreate() {
        System.out.println("\nHolder Name: " + setHolderName(HolderName) + "\n" + "Holder Number: "
                + setHolderNumber() + "\n" + "Account Balance Amount: RM" + setBalance(balance)
                + "\nCreate Date: " + getCreatedDate() + "\n");
    }

    public void DisplayNewAmount() {
        double amount = setBalance(balance);
        if (amount < 0) {
            System.out.println("You can't take out more than your account amount.");
        } else {                                                                    
            System.out.println("\nHolder Name: " + setHolderName(HolderName) + "\n" + "Holder Number: "
                    + getHolderNumber() + "\n" + "Account Balance Amount: RM" + setBalance(balance) + "\n");
        }
    }

}
