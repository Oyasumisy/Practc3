package ua.edu.ontu.cryptobanking;

import ua.edu.ontu.cryptobanking.model.User;
import ua.edu.ontu.cryptobanking.model.Currency;
import java.util.ArrayList;
import java.util.List;

public class BankingService {
    private List<User> users;
    private List<Currency> currencies;

    public BankingService() {
        this.users = new ArrayList<>();
        this.currencies = new ArrayList<>();
        initializeCurrencies();
    }

    private void initializeCurrencies() {
        currencies.add(new Currency("UAH", "Ukrainian Hryvnia", 2, 1.0, 1000000.0, 1.0));
        currencies.add(new Currency("USD", "US Dollar", 2, 1.0, 1000000.0, 38.5));
        currencies.add(new Currency("BTC", "Bitcoin", 8, 0.0001, 100.0, 45000.0));
    }

    public User createUser(String name, String email) {
        String userId = "U" + (users.size() + 1);
        User user = new User(userId, name);
        user.setContactInfo(email); // ✅ Теперь этот метод public
        users.add(user);
        return user;
    }

    public void verifyUser(User user) {
        user.setVerificationStatus("VERIFIED"); // ✅ Теперь этот метод public
        user.addInternalNote("Verified by banking system"); // ✅ Теперь этот метод public
    }

    void processDailyOperations() {
        System.out.println("Processing daily operations...");
    }

    protected void generateReport() {
        System.out.println("Bank Report: " + users.size() + " users");
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public List<Currency> getCurrencies() {
        return new ArrayList<>(currencies);
    }
}