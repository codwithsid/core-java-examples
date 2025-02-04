package service;

import model.Account;
import model.SavingsAccount;
import repository.SavingsAccountRepository;

public class SavingAccountService extends AccountService {
    SavingsAccountRepository savingsAccountRepository = new SavingsAccountRepository();

    public double calculateInterest(SavingsAccount account) {
        return savingsAccountRepository.calculateInterest(account);
    }
}
