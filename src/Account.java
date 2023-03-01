/*Evon Troy Alexander
 * COP-3337
 * Professor Saeed
 * February 5, 2023
 */

public class Account {

    // Instance variables

    private String PIN;
    protected double balance;

    // Conditional statement is used to error check - PIN can only be 4 digits.
    public void setPIN(String PIN) {
        if (PIN.length() == 4) {
            this.PIN = PIN;
        } else {
            System.out.println("The pin number should be 4 digits.");
        }
    }

    public boolean checkPIN(String PIN) {
        return this.PIN.equals(PIN);
    }

    // Deposit method that will be overridden in the checking and savings class
    // files.
    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            this.balance = Math.round(this.balance);
        }
    }

    // Withdrawal method that will be overridden in the checking and savings class
    // files.
    public void withdraw(double amount) {
        if (amount >= 0) {
            this.balance -= amount;
            this.balance = Math.round(this.balance);
        }
    }

    public double getBalance(String PIN) {
        if (this.PIN.equals(PIN)) {
            return this.balance;
        }
        return -1;
    }
}
