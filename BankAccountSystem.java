public class BankAccountSystem {
    private String accounteHolder;
    private double balance;

    public BankAccountSystem(String accounteHolder, double Balance) {
        this.accounteHolder = accounteHolder;
        this.balance = Balance;
    }
    public String getAccountHolder() {
        return accounteHolder;
    }
    public double getBalance() {
        return balance;
    }

    public void calculateIntreast(double amount) {

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public static double calculateInterest(double amount) {
        return amount * 0.13;
    }

     public void witdhraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
        System.out.println("Witdhraw: " + amount);
     }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccountSystem account = new BankAccountSystem("nigesh", 1000.0);
        account.displayBalance();
        account.deposit(500.0);
        account.displayBalance();
        account.witdhraw(200.0);
        account.displayBalance();
        double interest = calculateInterest(account.getBalance());
        System.out.println("Interest on current balance: " + interest);
    }

}
