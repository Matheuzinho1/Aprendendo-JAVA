package Exercicios_4.src;

public class App {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.numberAccount = "1234-5";
        a1.ownerAccount = "José";
        a1.balanceAccount = 100;

        Account a2 = new Account();
        a2.numberAccount = "5432-1";
        a2.ownerAccount = "Matheus";
        a2.balanceAccount = 150;

        if(!a1.deposit(500)) {
            System.out.println("Depósito Inválido!");
        }
        if(!a1.withdraw(120)) {
            System.out.println("Depósito Inválido!");
        }

        a1.printBalance();
    }
}
