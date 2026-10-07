public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accNum, double bal){
        this.accountNumber = accNum;
        this.balance = bal;
    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Can only deposit amount greater than zero into " + accountNumber);
            return;
        }else{
            balance += amount;
            System.out.println("New balance = " + balance + " after depositing " + amount + " into " + accountNumber);
        }
    }

    public double getBalance(){
        return balance;
    }

    public abstract void withdraw(double amount);

    public abstract void endOfMonth(); // each account type defines its own month-end behaviour
}