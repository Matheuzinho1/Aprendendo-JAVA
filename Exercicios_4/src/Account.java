package Exercicios_4.src;

import java.util.Random;

public class Account {
    int numberAccount;
    String ownerAccount;
    double balanceAccount;
    Random geradorNumberAccount = new Random();

    //Criação da conta
    boolean createAccount() {
        numberAccount = geradorNumberAccount.nextInt(1000);
        return true;
    }

    //Deposito
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

    //Saque
    boolean withdraw(double amount) {
        if(amount > 0) {
            balanceAccount -= amount;
            return true;
        }
        return false;
    }

    //Transferência
    void transfer(double amount, Account targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    //Empréstimo
    boolean loan(double amount) {
        if(balanceAccount > 1000) {
            deposit(amount);
            return true;
        }
        return false;
    }

    //Saldo da conta
    void printBalance() {
        System.out.println("Saldo: " + balanceAccount);
    }

    //Número da conta
    void printNumberAccount() {
        System.out.println("Número da conta: " + numberAccount);
    }
}
