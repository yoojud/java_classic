package Bank_0213;

public class AccountNumberGenerator {

    private static AccountNumberGenerator accountNumberGenerator;

    private AccountNumberGenerator() {
    }

    public static AccountNumberGenerator getAccountNumberGenerator() {
        if (accountNumberGenerator == null) {
            accountNumberGenerator = new AccountNumberGenerator();
        }
        return accountNumberGenerator;
    }

    private long accountNumber = 1;

    public long getAccountNumber() {
        return accountNumber++;
    }
}