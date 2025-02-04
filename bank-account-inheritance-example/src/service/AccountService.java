package service;

import model.Account;
import repository.AccountRepository;
import java.util.Scanner;
import java.util.Set;

public class AccountService
{
    Scanner sc=new Scanner(System.in);
    private AccountRepository accountRepository = new AccountRepository();

    public Account openAccount(){
        Account account = new Account();
        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextInt());
        System.out.print("Enter first Name: ");
        account.setFirstName(sc.next());
        System.out.print("Enter Last Name: ");
        account.setLastName(sc.next());
        accountRepository.openAccount(account);
        return account;
    }

    public void closeAccount(int accountNumber){

    }

    public void deposit(int accountNumber, int amount){

    }

    public void withdraw(int accountNumber, int amount){

    }

    public Account viewAccount(){

        return new Account();
    }

    public Set<Account> getAllAccount(){
        return accountRepository.getAllAccounts();
    }


}
