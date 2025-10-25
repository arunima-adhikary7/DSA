package Oops.Encapsulation;

public class BankAccount {

    private double balance;

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance +=amount;
        }
        else
         System.out.println("Deposit amount must be positive");

    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
          balance-=amount;
        else
          System.out.println("invalid withdraw amount");
    }

    public double getBalance()
    {
        return balance;
    }

        public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(500);
        System.out.println("Current Balance: " + acc.getBalance());
    }
    
}
