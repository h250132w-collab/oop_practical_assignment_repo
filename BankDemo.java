public class BankDemo{
    public static void main(String[] args){
        Account[] accounts = new Account[4];
        accounts[0] = new SavingsAccount("X45",0, 0);
        accounts[1] = new SavingsAccount("Y23",50, 10);
        accounts[2] = new CurrentAccount("S08",2.5d, 30);
        accounts[3] = new CurrentAccount("D12",7, 10);

        System.out.println("Testing deposits:");
        accounts[0].deposit(5);
        accounts[2].deposit(-1);
        System.out.println();

        for(Account acc : accounts){
            System.out.println("NOW WORKING WITH ACCOUNT NUMBER : " + acc.accountNumber
                    + "\nCURRENT BALANCE IS $" + acc.getBalance());
            acc.withdraw(20);
            acc.endOfMonth();
            System.out.println("");
        }

        System.out.println("Testing zero withdrawals:");
        accounts[1].withdraw(0);
        accounts[3].withdraw(0);
    }
}