package exception;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException() {
        System.out.println("Account not found");
    }
}
