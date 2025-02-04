package model;

public class BasicSavingsAccount extends SavingsAccount {
    boolean isZeroBalanceAccount;
    int withdrawalLimit;

    public boolean isZeroBalanceAccount() {
        return isZeroBalanceAccount;
    }

    public void setZeroBalanceAccount(boolean zeroBalanceAccount) {
        isZeroBalanceAccount = zeroBalanceAccount;
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public String toString() {
        return "BasicSavingsAccount{" +
                "isZeroBalanceAccount=" + isZeroBalanceAccount +
                ", withdrawalLimit=" + withdrawalLimit +
                ", interestRate=" + interestRate +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}