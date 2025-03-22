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

    boolean withdraw(double amount) {
        if(amount > 0) {
            balanceAccount -= amount;
            return true;
        }
        return false;
    }

    void printBalance() {
        System.out.println("Saldo: " + balanceAccount);
    }
}
