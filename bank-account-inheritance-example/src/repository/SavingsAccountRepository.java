package repository;

import model.Account;
import model.SavingsAccount;

public class SavingsAccountRepository extends AccountRepository {

    final double defaultInterestRate = 4.5;
    public double calculateInterest(SavingsAccount account) {
        return account.getBalance() * defaultInterestRate;
    }
}
