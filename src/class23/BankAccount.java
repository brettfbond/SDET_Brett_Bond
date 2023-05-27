package class23;
// Encapsulation. Says we should have a class for everything. Says fields should be private.
public class BankAccount {
    private String userName;
    private String password;
    private double accountBalance = 120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public double getAccountBalance(String password) {
        if(password.equals(this.password)) {
            return accountBalance;
        } else {
            return 0;
        }
    }
    public void setAccountBalance(double balance) {
        accountBalance = balance;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
class BankTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("admin", "pass123");
        System.out.println(bankAccount.getAccountBalance("pass123"));
    }
}