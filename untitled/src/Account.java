import java.util.Date;
public class Account {
    private int id=0;
private double balance=0;
private double AnnualInterestRate=0;
private Date dateCreated;
public Account(String[] args){};
public Account(int id,double balance)
{
    this.id=id;
    this.balance=balance;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return (AnnualInterestRate/12)/100;
    }
    public double getMonthlyInterest()
    {
        return balance*(AnnualInterestRate/12)/100;
    }
    public double withdraw(double x)
    {
        balance=balance-x;
        return balance;
    }
    public double deposit(double y)
    {
        balance=balance+y;
        return balance;
    }

}
