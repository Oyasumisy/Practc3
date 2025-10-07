package ua.edu.ontu.cryptobanking;

import ua.edu.ontu.cryptobanking.model.User;
import ua.edu.ontu.cryptobanking.model.Currency;
import ua.edu.ontu.cryptobanking.BankingService;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Cryptobanking with Encapsulation ===\n");

        BankingService bankService = new BankingService();

        User user1 = bankService.createUser("Artem Rakitenko", "artem@email.com");
        User user2 = bankService.createUser("Gleb Romanov", "gleb@email.com");

        user1.deposit(1500.0);
        user2.deposit(800.0);

        System.out.println("After initial deposit:");
        System.out.println(user1);
        System.out.println(user2);

        boolean transferResult = user1.transferTo(user2, 300.0);
        System.out.println("\nAfter transfer attempt:");
        System.out.println("Transfer " + (transferResult ? "successful" : "failed"));
        System.out.println(user1);
        System.out.println(user2);

        bankService.verifyUser(user1);
        System.out.println("\nUser1 verification status updated");

        Currency uah = bankService.getCurrencies().get(0);
        Currency usd = bankService.getCurrencies().get(1);

        double converted = uah.convertTo(1000, usd);
        System.out.println("\nCurrency conversion:");
        System.out.printf("1000 UAH = %.2f USD\n", converted);

        boolean withdrawalResult = user2.withdraw(2000.0);
        System.out.println("\nTrying to withdraw 2000 from user2:");
        if (!withdrawalResult) {
            System.out.println("Withdrawal failed: insufficient funds");
        }
    }
}