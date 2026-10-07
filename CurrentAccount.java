public class CurrentAccount extends Account {
    private final double overdraftLimit;

    public CurrentAccount(String accNum, double bal, double limit){
        super(accNum, bal);
        this.overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Can only withdraw amount greater than zero from " + accountNumber);
        }else if ((balance - amount) < -overdraftLimit) {
            System.out.println("Withdrawal of $" + amount + " from " + accountNumber
                    + " has been rejected because balance cannot go below -$" + overdraftLimit);
        } else {
            balance -= amount;
            if (balance < 0) {
                System.out.println(accountNumber + " is now in overdraft (limit is -$" + overdraftLimit + ")");
                System.out.println("New balance = $" + balance + " after withdrawing $" + amount);
            } else {
                System.out.println("New balance = $" + balance + " after withdrawing $" + amount + " from " + accountNumber);
            }
        }
    }

    @Override
    public void endOfMonth(){
        final double fee = 1.25d;
        balance -= fee;
        System.out.println("Maintenance fee of $" + fee + " deducted from " + accountNumber + " New Balance = $" + balance);
    }
}
