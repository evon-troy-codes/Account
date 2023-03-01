/*This program acts as an account manager. Account details are provided in Test.java. Bank fees and restrictions
are described in CheckingAccount.java, and SavingsAccount.java.
 */

public class Test {

    public static void main(String[] args) {

        CheckingAccount c = new CheckingAccount();
        SavingsAccount s = new SavingsAccount();

        c.setPIN("64587");
        c.setPIN("0275");
        c.deposit(100.8);
        c.withdraw(200.8);
        c.getBalance("0275");
        c.withdraw(90);
        c.getBalance("0275");
        System.out.println("------------------");
        c.monthElapsed(1);
        c.getBalance("0275");
        c.deposit(2000);
        c.monthElapsed(5);
        c.getBalance("0000");
        c.getBalance("0275");
        System.out.println("------------------");
        s.setPIN("5555");
        s.withdraw(50);
        s.deposit(1200.2);
        s.withdraw(195.2);
        s.getBalance("5555");
        s.monthElapsed(1);
        s.getBalance("4444");
        s.getBalance("5555");
        s.monthElapsed(30);
        s.getBalance("5555");
    }
}