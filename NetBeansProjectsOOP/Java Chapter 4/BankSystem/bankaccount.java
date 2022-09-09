package BankSystem;

import java.util.Date;

public class bankaccount {
    Date date = new Date();
    double cash1 = 0;
    double cash2 = 0;
    double deposit = 0;

    public bankaccount() {
    }

    public bankaccount(double newDeposit, double newCash1, double newCash2) {
        setDeposit(newDeposit);
        setCash1(newCash1);
        setCash2(newCash2);
    }

    public double setDeposit(double newDeposit) {
        deposit = newDeposit;
        return deposit;
    }

    public double setCash1(double newCash1) {
        cash1 = newCash1;
        return cash1;
    }

    public void setCash2(double newCash2) {
        cash2 = newCash2;
    }

    public double getCash2() {
        return cash2;
    }
    
    public String printResult() {
        double AccCash1 = setCash1(cash1);
        double AccCash2 = getCash2();
        double AccDeposit = setDeposit(deposit);
        double Account1 = 0;
        double Account2 = 0;

        Account1 = AccCash1 - AccDeposit;
        Account2 = AccCash2 + AccDeposit;

        String MSG = "Account 1 has RM" + Account1 + "\n" + "Account 2 has RM" + Account2;
        return MSG;
    }
}
