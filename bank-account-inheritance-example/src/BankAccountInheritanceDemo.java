import model.Account;
import model.SavingsAccount;
import service.SavingAccountService;

public class BankAccountInheritanceDemo {
    public static void main(String[] args) {

        SavingAccountService savingAccountService = new SavingAccountService();

        Account account = savingAccountService.openAccount();

        savingAccountService.getAllAccount().forEach(System.out::println);

        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.setAccountNumber(account.getAccountNumber());
        savingsAccount.setFirstName(account.getFirstName());
        savingsAccount.setLastName(account.getLastName());
        savingsAccount.setBalance(2500);

        System.out.println("Interest : "+savingAccountService.calculateInterest(savingsAccount));


    }
}