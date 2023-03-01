
public class CheckingAccount extends Account {
    /*
     * The checking account has a monthly fee of $15 if the balance of checking
     * account is lower than $1500
     */
    private final double MONTHLY_FEE = 15;

    /*
     * The checking account can go into negative and an overdraft fee of $10 will
     * apply each time.
     */
    private final double OVERDRAFT_FEE = 10;

    /* A user can never go into overdraft protection more than $250. */
    private final double OVERDRAFT_LIMIT = 250;

    public CheckingAccount() {
        super();
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance - amount >= -OVERDRAFT_LIMIT) {
            super.withdraw(amount);
            if (this.balance < 0) {
                super.withdraw(OVERDRAFT_FEE);
            }
            this.balance = Math.round(this.balance);
        }
    }

    @Override
//If the PIN is valid the users balance will output.
    public double getBalance(String PIN) {
        if (checkPIN(PIN)) {
            System.out.println("Current balance of your checking account : $ " + this.balance);
        } else {
            System.out.println("You need to enter the correct PIN number to check your balance.");
        }
        return balance;
    }

    // A for loop is used to asses the monthly maintenance fee.
    public void monthElapsed(int months) {
        for (int i = 0; i < months; i++) {
            if (this.balance < 1500) {
                withdraw(MONTHLY_FEE);
            }
            this.balance = Math.round(this.balance);
        }
    }
}