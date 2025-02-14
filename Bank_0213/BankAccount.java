package Bank_0213;

import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    public BankAccount(String ownerName, BigDecimal balance) {
        // AccountNumberGenerator generator = new AccountNumberGenerator();
        this.accountNumber = AccountNumberGenerator.getAccountNumberGenerator().getAccountNumber();
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}

class CreateAccount {
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount(ownerName, balance);

        // newAccount.accountNumber = accountNumber;
        // newAccount.ownerName = ownerName;
        // newAccount.balance = balance;

        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = CreateAccount.createNewBankAccount("VesperLind",
                new BigDecimal("0.0"));
        BankAccount bankAccount2 = CreateAccount.createNewBankAccount("Haemil", new BigDecimal("1.0"));
        printBankAccount(bankAccount1);
        printBankAccount(bankAccount2);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }
}