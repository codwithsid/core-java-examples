package repository;

import exception.AccountNotFoundException;
import model.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountRepository
{
    Set<Account> accounts = new HashSet<>();

    public Account openAccount(Account account){
         accounts.add(account);
         return account;
    }

    public Account getAccount(int accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
            else
                throw new AccountNotFoundException();
        }
        return null;
    }

    public void closeAccount(Account account){
        accounts.remove(account);
    }

    public void closeAccount(int accountNumber){
        Account accountToBeClosed =null;
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                accountToBeClosed = account;
            }
        }
        accounts.remove(accountToBeClosed);
    }

    public Set<Account> getAllAccounts(){
        return accounts;
    }

}
