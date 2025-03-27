package Exercicios_4.src;

public class Account {
    String numberAccount;
    String ownerAccount;
    double balanceAccount;

    boolean deposit(double amount) {
        if(amount > 0) {
            balanceAccount += amount;
            return true;
        }
        return false;
    }

    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount) {
        if(amount > 0) {
            balanceAccount -= amount;
            return true;
        }
        return false;
    }

    void transfer(Double amount, Account targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    void printBalance() {
        System.out.println("Saldo: " + balanceAccount);
    }

    boolean loan(double amount) {
        if(balanceAccount > 1000) {
            deposit(amount);
            return true;
        }
        return false;
    }
}
