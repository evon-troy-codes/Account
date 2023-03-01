public class SavingsAccount extends Account {

    // The savings account has a monthly interest rate of 0.1% applied to the
    // balance in it.
    private static final double MONTHLY_INTEREST_RATE = 0.001;
    // For each time you withdraw money from the savings account, a flat fee of $5
    // will apply.
    private static final double WITHDRAWAL_FEE = 5.0;

    public SavingsAccount() {
        super();

    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount <= 0) {
            System.out.println("You cannot withdraw more money than you have in your savings account!");
        } else {
            super.withdraw(amount + WITHDRAWAL_FEE);
        }
    }

    @Override

    public double getBalance(String PIN) {
        if (checkPIN(PIN)) {
            System.out.println("Current balance of your savings account: $ " + this.balance + ".");
        } else {
            System.out.println("You need to enter the correct PIN number to check your balance.");
        }
        return balance;
    }

    // A for loop is used to asses the monthly interest rate.
    public void monthElapsed(int months) {
        for (int i = 0; i < months; i++) {
            this.balance = this.balance + this.balance * MONTHLY_INTEREST_RATE;
            this.balance = Math.round(this.balance * 100.0) / 100.0;
        }
    }
}
