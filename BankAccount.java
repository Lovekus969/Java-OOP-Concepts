public class BankAccount {
    //  Private fields (hidden from outside)
    private String accountHolder;
    private double balance;
    private String accountNumber;

    //  Public constructor (to initialize safely)
    public BankAccount(String accountHolder, double balance, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //  Public Getter: Allow access in a controlled way
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Controlled Update: Only this method can change balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; //A class can access all its own **private variables and methods** internally.
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }


     public static void main(String[] args) {
        BankAccount userAccount = new BankAccount("Bhavneet",999999.99,"IFCN Bank of universe"); // starting with $500
        Cashier cashier = new Cashier("Aman");

        // Simulate customer actions
        cashier.handleDeposit(userAccount, 200);      // should show $700
        cashier.handleWithdrawal(userAccount, 100);   // should show $600
        cashier.handleWithdrawal(userAccount, 1000);  // invalid, not enough funds
        cashier.handleDeposit(userAccount, -50);      // invalid deposit
    }

}

    class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void handleDeposit(BankAccount account, double amount) {
        System.out.println("🧾 Cashier " + name + " processing deposit...");
        account.deposit(amount);
        printReceipt(account);
    }

    public void handleWithdrawal(BankAccount account, double amount) {
        System.out.println("🧾 Cashier " + name + " processing withdrawal...");
        account.withdraw(amount);
        printReceipt(account);
    }

    private void printReceipt(BankAccount account) {
        System.out.println("📄 Receipt: Current Balance = $" + account.getBalance());
        System.out.println("━━━━━━━━━━━━━━━━━━━━━");
    }


}