package Iniciando_com_POO.src;

public class App {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account b1 = new Account();

        a1.createAccount("Fodase");
        b1.createAccount("Rafael");

        a1.deposit(1000);

        a1.transfer(200, b1, "Rafael");

    }
}