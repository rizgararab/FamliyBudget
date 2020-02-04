public class SavingAccount
{
    private double balance; //STATE
    private double interestRate; //STATE
    private double rate;//STATE

    public SavingAccount()
    {
        balance = 0;
        interestRate = 0;
    }

    public SavingAccount(double amount, double interestRate)
    {
        balance = amount;
        rate = interestRate;

    }

    public void deposit(double amount)
    {
        balance=balance+amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void setInterest(double rate)
    {
        balance = balance + balance * rate;
        //this.setInterst = setInterest;
        //setInterest = InterestRate / 12;
    }

    public double computeInterest(int n)
    {
        balance=Math.pow(balance*(1+rate),n/12);
        return balance;
    }

    public double getsetInterest()
    {
        return rate;
    }

    public double getBalance()
    {
        return balance;
    }

    public void close()
    {
        balance =0;
    }



}

