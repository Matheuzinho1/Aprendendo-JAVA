package Exercicios_4.src;

public class App {
    public static void main(String[] args) {

        Account a = new Account();
        Account b = new Account();

        a.deposit("1000");
        b.deposit(100);

        a.transfer(null, null);

        if(a.loan(3)) {
            System.out.println("Emprestimo LIBERADO -- Saldo maior que o necessário");
        } else {
            System.out.println("Emprestimo NEGADO -- Saldo menor que 1000");
        }

        a.printBalance();
        b.printBalance();

    }
}
