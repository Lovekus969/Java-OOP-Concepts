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
                BankAccount user1 = new BankAccount("Kush", 5000.00, "SC123456789");
                BankAccount user2 = new BankAccount("Bhavneet ", 9999999.99, "Bank Of Universe");

                // 👨‍💼 Role: Account Holder (can see details)
                System.out.println("Welcome, " + user1.getAccountHolder());
                System.out.println("Account Number: " + user1.getAccountNumber());
                System.out.println("Balance: $" + user1.getBalance());

                //  Role: Security Guard (tries to access balance - not allowed)
                //  System.out.println(user1.balance); // ERROR: balance is private

                // Only way to change is through controlled deposit/withdraw
                user1.deposit(1000);
                user1.withdraw(300);

                System.out.println("Updated Balance: $" + user2.getBalance());
                 System.out.println("Welcome, " + user2.getAccountHolder());
                System.out.println("Account Number: " + user2.getAccountNumber());
                System.out.println("Balance: $" + user2.getBalance());
                user2.deposit(99999999);

                //  Role: Security Guard (tries to access balance - not allowed)
                //  System.out.println(user1.balance); // ERROR: balance is private

                // Only way to change is through controlled deposit/withdraw
                user1.deposit(1000);
                user2.withdraw(300);

                System.out.println("Updated Balance: $" + user2.getBalance());
        }
}