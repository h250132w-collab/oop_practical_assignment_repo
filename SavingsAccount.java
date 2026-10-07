public class SavingsAccount extends Account{
    private final double minimumBalance;

    public SavingsAccount(String accNum, double bal, double minBal){
        super(accNum, bal);
        this.minimumBalance = minBal;
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Can only withdraw amount greater than zero from " + accountNumber);
        }else if ((balance - amount) < minimumBalance) {
            System.out.println("Withdrawal of $" + amount + " from " + accountNumber
                    + " has been rejected because balance cannot go below $" + minimumBalance);
        } else {
            balance -= amount;
            System.out.println("New balance = $" + balance + " after withdrawing $" + amount + " from " + accountNumber);
        }
    }

    @Override
    public void endOfMonth(){
        double interest = balance * 0.02; //interest rate = 2%
        balance += interest;
        System.out.println("Interest of $" + interest + " added to " + accountNumber + " New Balance = $" + balance);
    }
}
